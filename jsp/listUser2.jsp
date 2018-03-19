<!DOCTYPE html>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
    <h1>Welcome, <c:out value="hello" /> </h1>

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
        <c:forEach items="${userdata}" var="user" >
          <tr>
            <td> <c:out value="${user.code}"/> </td>
            <td> <c:out value="${user.firstName}"/> </td>
            <td> <c:out value="${user.lastName}"/> </td>
            <td> <c:out value="${user.age}"/> </td>
            <td> <c:out value="${user.dob}"/> </td>

          </tr>
        </c:forEach>
      </tbody>
    </table>

    <a href="jsp/userForm.jsp" class="btn-floating btn-large waves-effect waves-light red right"><i class="material-icons">add</i></a>

    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
  </body>
</html>