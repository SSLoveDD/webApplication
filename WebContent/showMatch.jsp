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

    <title>赛事信息</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/cover.css" rel="stylesheet">
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
                  <li><a href="<%= path %>">首页</a></li>
                  <li class="active"><a href="<%= path %>/showMatch">比赛详情</a></li>
                  <% if(session.getAttribute("username")==null){ %>
                  <li>
                    <a href="JavaScript:void(0);" data-toggle="modal" data-target="#myModal">登录</a>
                    </li>
                    <% }else{ %>
                    <li class="dropdown" id="xiala">
                      <a class="dropdown-toggle dropdown-menu-right"  
                        id="dropdownMenu2"  href="#" 
                        data-toggle="dropdown"  role="button"  aria-haspopup="true" aria-expanded="false" 
                      >
                      <%= session.getAttribute("username")%>
                      <span class="caret"></span>
                    </a>
          
            <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
              <li><a href="<%= path %>/user-center">个人中心</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="<%=path %>/quit">退出</a></li>
            </ul>
            <% }%>
                  </li>
                </ul>
              </nav>
            </div>
          </div>

          <div class="inner cover">
            <div>
              <h3 class="cover-heading">比赛规则</h3>
              <p class="lead">
                                                                 选手可以在网站上注册用户进而添加队伍。所有队伍被平均地分到4个小组中。首先进行的是小组循环赛，比赛结果决定积分队伍所获得的积分，小组赛后每组积分头两名队伍晋级，然后进行世界杯赛制淘汰赛。
              </p>
            </div>
	            <div>
	              <h3>对战信息</h3>
	              <div>
	              <table class="table table-bordered">
	                <tr>
	                  <th><a>A组</a></th>
	                  <th><a>B组</a></th>
	                  <th><a>C组</a></th>
	                  <th><a>D组</a></th>
	                  <th><a>淘汰赛</a></th>
	                </tr>
	              </table>
				</div>
	            <div>
	              <table  id="match" class="table table-bordered">
	                <tr>
	                  <th>名次</th>
	                  <th>战队名</th>
	                  <th>积分</th>
	                  <th>晋级情况</th>
	                </tr>
	              </table>
	            </div>

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
            <span><a href="#" class="pull-left">法律条约</a></span>
            <span><a href="register" class="pull-right" style="color:black">注册</a></span>
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
<!--     <script>window.jQuery || document.write('<script src="./js/jquery.min.js"><\/script>')</script><script src="./js/jquery.min.js"></script> -->
  <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/showMatch.js"></script>
        <script src="./js/logAndReg.js"></script>
    
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="./js/ie10-viewport-bug-workaround.js"></script> -->
  

</body></html>