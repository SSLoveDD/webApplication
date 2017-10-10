<!-- THE-NODE-OF-SESSION-TIMEOUT -->
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0039)http://getbootstrap.com/examples/cover/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    
    <% String path=request.getContextPath(); %>
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://getbootstrap.com/favicon.ico">

    <title>主页</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/cover.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!--     <script src="./js/ie-emulation-modes-warning.js.下载"></script> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
 <body>

    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
              <h3 class="masthead-brand">NLC</h3>
              <nav>
                <ul class="nav masthead-nav">
                  <li class="active"><a href="<%= path %>">首页</a></li>
                  <li><a href="<%= path %>/showMatch">比赛详情</a></li>

                </ul>
              </nav>
            </div>
          </div>

          <div class="inner cover">
          <div class="col-md-2"></div>
          <div class="col-md-8 center-block" style="text-align: left;">
			<form action="register" method="post">
			  <div class="form-group">
			    <label for="user_name">user_name</label>
			    <input type="text" class="form-control" name="user_name" placeholder="姓名">
			  </div>
			  <div class="form-group">
			    <label for="user_psw">user_psw</label>
			    <input type="password" class="form-control" name="user_psw" placeholder="密码">
			  </div>
			  <div class="form-group">
			    <label for="user_game_name">user_game_name</label>
			    <input type="text" class="form-control" name="user_game_name" placeholder="游戏名">
			  </div>
			  <div class="form-group">
			    <label for="user_game_acount">user_game_acount</label>
			    <input type="number" class="form-control" name="user_game_acount" placeholder="游戏账户">
			  </div>
			  <div class="form-group">
			    <label for="user_work_id">user_work_id</label>
			    <input type="number" class="form-control" name="user_work_id" placeholder="员工号">
			  </div>
			  <div class="form-group">
			    <label for="user_position">user_position</label>
			    <input type="text" class="form-control" name="user_position" placeholder="所打位置">
			  </div>
			  <div class="form-group">
			    <label for=user_telephone>user_telephone</label>
			    <input type="tel" class="form-control" name="user_telephone" placeholder="电话">
			  </div>			  
			  <button type="submit" class="btn btn-default">注册</button>
			</form>
          </div>
          </div>

          <div class="mastfoot">
            <div class="inner">
              <p>complished for<a href="http://getbootstrap.com/">Bootstrap</a>, by <a href="https://twitter.com/mdo">kuang</a>.</p>
            </div>
          </div>

        </div>

      </div>

    </div>



  <div class="modal fade" id="myModal" tabindex="-1"  aria-labelledby="myModalLabel" aria-hidden="true">
<!--     <div class="modal-dialog"> -->
<!--         <div class="modal-content"> -->
<!--             <div class="modal-header"> -->
<!--                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button> -->
<!--                 <h1 class="text-center text-primary">登录</h1> -->
<!--             </div> -->
<!--             <div class="modal-body"> -->
<!--             <form class="form col-md-8 center-block" action="login" method="post"> -->
<!--             	  <div class="form-group"> -->
<!-- 	                <input type="text" id="user_name" name="user_name" class="form-control" placeholder="工号" required="" autofocus=""> -->
<!-- 	               </div> -->
<!-- 	               <div class="form-group"> -->
<!-- 	                <input type="" id="user_psw" name="user_psw" class="form-control" placeholder="密码" required=""> -->
<!--                	</div> -->
<!--                	<div class="form-group"> -->
<!--         		<button class="btn btn-lg btn-primary" type="submit">普通用户</button> -->
<!--         		<button class="btn btn-lg btn-danger" type="submit">管理员</button> -->
<!--         		</div> -->
<!--         		<a href=""  class="pull-right" type="submit">注册</a> -->
<!--       		</form> -->
<!--       		</div> -->
<!--       		  <div class="modal-footer"> -->
        
<!--      		 </div> -->
<!--         </div>/.modal-content -->
<!--    	 </div>/.modal -->
   	 
   	 <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
        <h1 class="text-center text-primary">登录</h1>
      </div>
      <div class="modal-body">
        <form id="form" action="login" method="post"  class="form col-md- center-block">
          <div class="">
            <input id="name" type="text" class="form-control input-lg" placeholder="用户名" name="user_name">
          </div>
          <div class="form-group">
            <input id="psw" type="password" class="form-control input-lg" placeholder="登录密码" name="user_psw">
          </div>
          <div class="form-group">
            <button id="origin" class="btn btn-primary btn-lg btn-block" type="button">普通用户</button>
            <button id="admin" class="btn btn-primary btn-lg btn-block btn-danger">管理员</button>
          </div>
          <div class="form-group">
            <span><a href="#" class="pull-left">找回密码</a></span>
            <span><a href="#" class="pull-right" style="color:black">注册</a></span>
           </div>
        </form>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
  </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  <!--   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> -->
<!--     <script>window.jQuery || document.write('<script src="./js/jquery.min.js"><\/script>') </script> -->
      <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
     <script type="text/javascript" src="./js/logAndReg.js"></script>
<!--     IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!--     <script src="./js/ie10-viewport-bug-workaround.js.下载"></script> -->
  

</body>
</html>