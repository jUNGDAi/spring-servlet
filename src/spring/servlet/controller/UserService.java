/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.controller;

import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class UserService extends HttpServlet {

  private static final long serialVersionUID = 3054367182733459811L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    /**
     * 1. query data from sc_user table 2. add result to array list 3. set array
     * list object to attribute name = userdata 4. forward to listuser.jsp
     */
    /**
     * get user_code,user_age,user_last_name,user_first_name,user_dob
     */
    List list = new ArrayList();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://203.151.27.179:3306/train_db", "train", "train");

      Statement statement = (Statement) connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from sc_user ");

      while (resultSet.next()) {
        User user = new User();
        user.setCode(resultSet.getString("user_code"));
        user.setAge(resultSet.getInt("user_age"));
        user.setLastName(resultSet.getString("user_last_name"));
        user.setFirstName(resultSet.getString("user_first_name"));
        user.setDob(resultSet.getString("user_dob"));
        list.add(user);
      }

      resultSet.close();
      statement.close();
      connection.close();

    } catch (ClassNotFoundException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    }

    request.setAttribute("userdata", list);

    request.getRequestDispatcher("/jsp/listUser2.jsp").forward(request, response);
  }

}
