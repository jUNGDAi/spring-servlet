/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wien
 */
public class HelloWorld extends HttpServlet {

  private static final long serialVersionUID = -7220633308642036300L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    Map<String, String> userid = (Map) req.getAttribute("userid");
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<head>");
    out.println("<title>Hello World!</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello " + name + "!</h1>");
    out.println("<h1>Hello " + userid + "!</h1>");
    out.println("</body>");
    out.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Map<String, String> user = (Map) req.getAttribute("user");
//    String name = req.getParameter("name");
//    String surName = req.getParameter("surName");
//    String age = req.getParameter("age");
//    String job = req.getParameter("job");
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<head>");
    out.println("<title>Hello World!</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello " + user.get("userid") + "!</h1>");
    out.println("<h1>| " + user.get("firstname") + "!</h1>");
    out.println("<h1>| " + user.get("lastname") + "!</h1>");
    out.println("<h1>| " + user.get("dob") + "!</h1>");
    out.println("<h1>| " + user.get("age") + "!</h1>");
    out.println("</body>");
    out.println("</html>");
  }

}
