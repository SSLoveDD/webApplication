<!-- THE-NODE-OF-SESSION-TIMEOUT -->
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0039)http://getbootstrap.com/examples/cover/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://v3.bootcss.com/favicon.ico">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./js/ie-emulation-modes-warning.js.下载"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="##">主页</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="##">赛事信息</a></li>
            <li><a href="##">张三</a></li>
          </ul>
<!--           <form class="navbar-form navbar-right"> -->
<!--             <input type="text" class="form-control" placeholder="Search..."> -->
<!--           </form> -->
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="userCenter">Overview <span class="sr-only">(current)</span></a></li>
            <li><a id="editUser" href="JavaScript:void(0)">个人信息更改</a></li>
            <li><a id="container_modifyPSW" href="JavaScript:void(0)">个人密码修改</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a id="container_teamInfo" href="javascript:void(0)">战队信息</a></li>
            <li><a href="javascript:void(0)">添加战队成员信息</a></li>
            <li><a href="#">删除战队成员信息</a></li>
            <li><a href="#">修改战队成员信息</a></li>
            <li><a href="#">查询战队成员信息</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main row">
          <h2 class="sub-header">个人信息</h2>
            
          <div id="view">

        <div id="modalForsearch" class="modal fade" tabindex="-1" role="dialog">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">编辑</h4>
              </div>
              <div id="modalForSearchBody" class="modal-body">                
             <form id="searchTeamMemberForm" action="editUserByTL" method="post">
            <div class="form-group">
              <label for="user_game_name">user_game_name</label>
              <input id="search-form-group-input0"  type="text" class="form-control" name="user_name" placeholder="姓名">
            </div>
            <div class="form-group">
              <label for="user_game_name">电话</label>
              <input id="search-form-group-input1"  type="text" class="form-control" name="user_game_name" placeholder="电话">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
           </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="searchModalFormSubmit" type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->



        <div id="modalForEdit" class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">编辑</h4>
              </div>
              <div id="modalForEditBody" class="modal-body">
                    <form id="editTeamMemberForm" action="editUserByTL" method="post">


                    <div class="form-group">
                      <label for="user_game_name">user_name</label>
                      <input id="form-group-input0"  type="text" class="form-control" name="user_name" placeholder="姓名" disabled="true">
                    </div>
                    <div class="form-group">
                      <label for="user_game_name">user_game_name</label>
                      <input id="form-group-input1"  type="text" class="form-control" name="user_game_name" placeholder="游戏名">
                    </div>
                    <div class="form-group">
                      <label for="user_game_acount">user_game_acount</label>
                      <input  id="form-group-input2" type="number" class="form-control" name="user_game_acount" placeholder="游戏账户">
                    </div>
                    <div class="form-group">
                      <label for="user_position">user_position</label>
                      <input id="form-group-input3"  type="text" class="form-control" name="user_position" placeholder="所打位置">
                    </div>
                    <div class="form-group">
                      <label for=user_telephone>user_telephone</label>
                      <input id="form-group-input4"  type="tel" class="form-control" name="user_telephone" placeholder="电话">
                    </div>        
                  </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="modalFormSubmit" type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

          <div id="teamIndex">
            <h2>队伍基本信息</h2>
            <div id="teamBaseInfo">
              
            </div>

            <h2>队伍成员信息</h2>
            <div id="teamMemberInfo">
              
            </div>
          </div>



          <div id="addMem" class="modal fade" tabindex="-1" role="dialog">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">编辑</h4>
              </div>
              <div id="modalForaddMemBody" class="modal-body">
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="modalFormSubmit" type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


            
      <div id="editabelDiv" class="form-control center-block" style="text-align: left;">

          </div>


          <div id="modifyPSW" class="input-group input-group-lg center-block" style="display: none;padding-right: 300 ;padding-left: 200">
            <div class="input-group">
              <input id="originPSW" type="password" class="form-control" placeholder="原密码" >    
              <input id="newPSW" type="password" class="form-control" placeholder="新密码" >  
              <input id="reNewPSW" type="password" class="form-control" placeholder="重新输入新密码" >  
              <button id="modifyPSWButton" class="btn btn-primary btn-block" type="button"></button>                     
            </div>
                     
          </div>


          <div id="editUserDisp" class="input-group input-group-lg center-block" style="display: none;padding-right: 30% ;padding-left: 5%">
           <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon0">https://example.com/users/</span>

              <input id="input0" type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button  id="button0" class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->
            

           <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon1">https://example.com/users/</span>

              <input id="input1"  type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button  id="button1" class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->


           <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon2">https://example.com/users/</span>

              <input id="input2" type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button  id="button2" class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->

                                   <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon3">https://example.com/users/</span>

              <input id="input3" type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button  id="button3" class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->


           <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon4">https://example.com/users/</span>

              <input id="input4" type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button  id="button4" class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->


           <div class="input-group">
   
              <span class="input-group-addon" id="basic-addon5">https://example.com/users/</span>

              <input id="input5" type="text" class="form-control" placeholder="Search for..." >

              <span class="input-group-btn">
                <button id="button5"  class="btn btn-default" type="button">go</button>
              </span>
            </div><!-- /input-group -->
                                    

            <button id="saveUser" class="btn btn-default" type="button">save</button>
          </div><!-- /input-group -->



          </div>
          <div>

       <div  id="searchButtonForMember" class="input-group">
          <input id="searchAndAdd" type="text" class="form-control" placeholder="搜索用户">
          <span class="input-group-btn">
            <button class="btn btn-default" type="button">Go!</button>
          </span>
        </div><!-- /input-group -->

        </div>
      </div>
    </div>


			













    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./js/jquery.min.js"></script>
<!--     <script>window.jQuery || document.write('<script src=".../../assets/js/vendor/jquery.min.js"><\/script>')</script> -->
    <script src="./js/bootstrap.min.js"></script>
     <script src="./js/user-center.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<!--     <script src="../js/holder.min.js"></script> -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!--     <script src="../js/ie10-viewport-bug-workaround.js.下载"></script> -->
  

</body></html>