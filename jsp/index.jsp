<!DOCTYPE html>
<html>
  <head>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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
    <div>
      <h1><%= request.getAttribute("error") %></h1>
    </div>
    <div class="container">
      <div class="row">
        <form class="col s12" method="post" action="loginService">
          <div class="row">
            <div class="input-field col s12">
              <input name="userid" id="userid" type="text" class="validate">
              <label for="userid">Username</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="pwd" id="pwd" type="password" class="validate">
              <label for="pwd">Password</label>
            </div>
          </div>
          <button class="btn waves-effect waves-light pulse" type="submit" name="submitbtn" value="Login">Login
            <!--<i class="material-icons right">send</i>-->
          </button>
        </form>
      </div>
    </div>


    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
  </body>
</html>
