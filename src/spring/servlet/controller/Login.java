/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wien
 */
public class Login extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();

    String err = (String) req.getAttribute("error");

    out.println("<html>");
    out.println("<body>");
    out.println("<head>");
    out.println("<title>Hello World!</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Login ! </h1>");
    out.print("<form method='post' action='loginService'>");
    out.print("<input type='text' name='userid' placeholder='Username' > &nbsp;");
    out.print("<input type='password' name='pwd' placeholder='Password'> &nbsp;");
    out.print("<input type='submit' name='submitbtn' value='Login'> &nbsp;");
    if (err != null) {
      out.println("<b style='color:red;'>" + err + "</b>");
    }
    out.print("</form>");
    out.println("</body>");
    out.println("</html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    this.doGet(req, resp);
  }

}
