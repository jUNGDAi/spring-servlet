<!DOCTYPE html>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>
<%@page import = "spring.servlet.bean.User" %>
<html>
  <head>
    <title>List User Page</title>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8" />
  </head>

  <body>
    <nav>
      <div class="nav-wrapper">
        <a href="#" class="brand-logo">jUNG-DAi</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
          <li><a href="login">Login</a></li>
        </ul>
      </div>
    </nav>
    <%= request.getAttribute("userdata") %>
    <hr/>
    <div class="container">
      <table border="1" class="striped">
        <thead>
          <tr>
            <th>user_code</th>
            <th>user_first_name</th>
            <th>user_last_name</th>
            <th>user_age</th>
            <th>user_dob</th>
          </tr>
        </thead>
        <tbody>
          <%
            List<User> userdata = (List<User>) request.getAttribute("userdata");
        
            for( int i = 0 ; i < userdata.size() ; i++ ) {
              User user= userdata.get(i);
          %>
          <tr>
            <td> <%= user.getCode() %> </td>
            <td> <%= user.getFirstName() %> </td>
            <td> <%= user.getLastName() %> </td>
            <td> <%= user.getAge() %> </td>
            <td> <%= user.getDob() %> </td>          
          </tr>
          <% }
          %>
        </tbody>
      </table>
    </div>


    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
  </body>
</html>
