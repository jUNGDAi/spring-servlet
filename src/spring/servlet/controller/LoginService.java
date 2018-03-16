/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.controller;

import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wien
 */
public class LoginService extends HttpServlet {

  private static final long serialVersionUID = -6083505448823558619L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String userid = req.getParameter("userid");
    String pwd = req.getParameter("pwd");

    boolean hasUser = false;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://203.151.27.179:3306/train_db", "train", "train");

      Statement statement = (Statement) connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from sc_user where user_code = '" + userid + "' and user_pwd = '" + pwd + "'");

      while (resultSet.next()) {
        System.out.println(resultSet.getString("user_code"));
        hasUser = true;
      }

      resultSet.close();
      statement.close();
      connection.close();

    } catch (ClassNotFoundException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
    }

    if (hasUser) {
      try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://203.151.27.179:3306/train_db", "train", "train");

        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from sc_user where user_code = '" + userid + "'");

        Map m = new HashMap();
        while (resultSet.next()) {
          m.put("userid", resultSet.getString("user_code"));
          m.put("firstname", resultSet.getString("user_first_name"));
          m.put("lastname", resultSet.getString("user_last_name"));
          m.put("dob", resultSet.getString("user_dob"));
          m.put("age", resultSet.getString("user_age"));
        }

        resultSet.close();
        statement.close();
        connection.close();

        req.setAttribute("user", m);
        req.getRequestDispatcher("/hello").forward(req, resp);

      } catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
        Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
      }

    } else {

      req.setAttribute("error", "User or password not found");
      req.getRequestDispatcher("login").forward(req, resp);

    }

    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.print(userid + " : " + pwd);

  }

}
