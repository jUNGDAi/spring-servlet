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

    <div class="container">
      <div class="row">
        <form class="col s12" method="post" action="../saveUserService">
          <div class="row">
            <div class="input-field col s12">
              <input name="user_code" id="user_code" type="text" class="validate">
              <label for="user_code">User Code</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="user_pwd" id="user_pwd" type="text" class="validate">
              <label for="user_pwd">User Password</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="user_age" id="user_age" type="text" class="validate">
              <label for="user_age">User Age</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="user_first_name" id="user_first_name"  type="text" class="validate">
              <label for="user_first_name">User First Name</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="user_last_name" id="user_last_name"  type="text" class="validate">
              <label for="user_last_name">User Last Name</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="user_dob" id="user_dob"  type="text" class="validate">
              <label for="user_dob">User Dob.</label>
            </div>
          </div>
          <button class="btn waves-effect waves-light pulse" type="submit" name="submitbtn" value="save">Add User
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