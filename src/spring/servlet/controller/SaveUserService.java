/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.controller;

import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import spring.servlet.bean.User;

/**
 *
 * @author wien
 */
public class SaveUserService extends HttpServlet {

  private static final long serialVersionUID = -5254142274279403059L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    /**
     * 1. get parameter 2. insert into table sc_user{ user_code,
     * user_pwd,user_age,user_last_name,user_first_name,user_dob } 3. redirect
     * page /jsp/listUser2.jsp
     */
    String user_code = request.getParameter("user_code");
    String user_pwd = request.getParameter("user_pwd");
    String user_age = request.getParameter("user_age");
    String user_first_name = request.getParameter("user_first_name");
    String user_last_name = request.getParameter("user_last_name");
//    String user_dob = request.getParameter("user_dob");
//    java.sql.Date user_dob = new java.sql.Date(new java.util.Date().getTime());
    Calendar calendar = Calendar.getInstance();
    java.sql.Date user_dob = new java.sql.Date(calendar.getTime().getTime());

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://203.151.27.179:3306/train_db", "train", "train");

//      Statement statement = (Statement) connection.createStatement();
//      ResultSet resultSet = statement.executeQuery("select * from sc_user ");
      // the mysql insert statement
      String query = " insert into sc_user (user_code, user_pwd, user_age, user_first_name, user_last_name, user_dob) values (?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setString(1, user_code);
      preparedStmt.setString(2, user_pwd);
      preparedStmt.setString(3, user_age);
      preparedStmt.setString(4, user_first_name);
      preparedStmt.setString(5, user_last_name);
      preparedStmt.setDate(6, user_dob);

      // execute the preparedstatement
      preparedStmt.execute();

//      resultSet.close();
//      statement.close();
//      preparedStmt.close();
      connection.close();

    } catch (ClassNotFoundException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    }

    request.getRequestDispatcher("/userService").forward(request, response);
  }

}
