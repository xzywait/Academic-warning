<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>辅导员——首页 | </title>

    <!-- Bootstrap -->
    <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="../../build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="instructorindex.jsp" class="site_title"><i class="fa fa-mortar-board"></i>
                        <span>欢迎登录！</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="../images/user.png" alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>Welcome,</span>
                        <h2>${user.name}</h2>
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br/>

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul class="nav side-menu">
                            <li>
                                <a href="instructorindex.jsp"><i class="fa fa-home"></i> 主页 </a>
                            </li>
                            <li>
                                <a><i class="fa fa-bell"></i> 预警信息 <span class="badge bg-green">8</span><span
                                        class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/warningstandard.jsp">预警标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/gradewarning.jsp">年级预警信息<span class="badge bg-green">8</span></a>
                                    </li>
                                    <li>
                                        <a href="../common/majorwarning.jsp">专业预警信息<span class="badge bg-green">8</span></a>
                                    </li>

                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-upload"></i> 帮扶工作记录 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/helpworklist.jsp">记录查看</a>
                                    </li>
                                    <li>
                                        <a href="../common/helpworkupload.jsp">记录上传<span class="badge bg-green">8</span></a>
                                    </li>
                                </ul>
                            </li>

                            </li>
                            <li>
                                <a><i class="fa fa-heart"></i> 帮扶信息 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/helpstandard.jsp">帮扶标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/gradehelp.jsp">年级帮扶结果信息</a>
                                    </li>
                                    <li>
                                        <a href="###">专业帮扶结果信息</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>

                </div>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <div class="sidebar-footer hidden-small">
                    <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </a>
                </div>
                <!-- /menu footer buttons -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown"
                               aria-expanded="false">
                                <img src="../images/user.png" alt="">${user.name}
                                <span class=" fa fa-angle-down"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li>
                                    <a href="javascript:;">
                                        <span class="badge bg-red pull-right">50%</span>
                                        <span>Settings</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:;">Help</a>
                                </li>
                                <li>
                                    <a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
                                </li>
                            </ul>
                        </li>
                        <!--
            作者：ljj
            时间：2017-04-18
            描述：可保留，用作最新预警信息的提示
        -->
                        <li role="presentation" class="dropdown">
                            <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown"
                               aria-expanded="false">
                                <i class="fa fa-envelope-o"></i>
                                <span class="badge bg-green">6</span>
                            </a>
                            <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                                <li>
                                    <a>
                                        <span class="image"><img src="../images/img.jpg" alt="Profile Image"/></span>
                                        <span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
                                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a>
                                        <span class="image"><img src="../images/img.jpg" alt="Profile Image"/></span>
                                        <span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
                                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a>
                                        <span class="image"><img src="../images/img.jpg" alt="Profile Image"/></span>
                                        <span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
                                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a>
                                        <span class="image"><img src="../images/img.jpg" alt="Profile Image"/></span>
                                        <span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
                                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                                    </a>
                                </li>
                                <li>
                                    <div class="text-center">
                                        <a>
                                            <strong>See All Alerts</strong>
                                            <i class="fa fa-angle-right"></i>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div id="content">
            <div class="right_col" role="main">
                <div>
                    <div class="page-title">
                        <div class="title_left">
                            <h3>用户主页</h3>
                        </div>

                        <div class="title_right">
                            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search for...">
                                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>基本信息
                                        <small>备注信息</small>
                                    </h2>
                                    <ul class="nav navbar-right panel_toolbox">
                                        <li>
                                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                        </li>
                                        <li>
                                            <a class="close-link"><i class="fa fa-close"></i></a>
                                        </li>
                                    </ul>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 profile_left">
                                        <div class="profile_img">
                                            <div id="crop-avatar">
                                                <!-- Current avatar -->
                                                <img id="teaindeximg" class="img-responsive avatar-view"
                                                     src="../images/picture.jpg" alt="Avatar" title="Change the avatar">
                                            </div>
                                        </div>
                                        <h3>姓名</h3>

                                        <ul class="list-unstyled user_data" id="leftmid" style="font-size: large;">
                                            <li><i class="fa fa-university user-profile-icon"></i> &nbsp;&nbsp;学院
                                            </li>

                                            <li>
                                                <i class="fa fa-list-alt user-profile-icon"></i> &nbsp;&nbsp;专业
                                            </li>

                                            <li class="m-top-xs">
                                                <i class="fa fa-phone user-profile-icon"></i>
                                                <a href="" target="_blank">&nbsp;&nbsp;&nbsp;电话</a>
                                            </li>
                                        </ul>

                                        <a id="personalinformation" href="../common/personalinformation.jsp"
                                           class="btn btn-success"><i class="fa fa-edit m-right-xs"></i>编辑</a>
                                        <br/>
                                        <!-- start skills -->
                                        <h3 style="margin-top: 50px;"> 年级学生总况 </h3>
                                        <p></p>
                                        <ul class="list-unstyled user_data" id="leftdown">
                                            <li>
                                                <p>
                                                <h4>预警人数</h4></p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="50"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>
                                                <h4>已被帮扶人数</h4></p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="70"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>
                                                <h4>待被帮扶人数</h4></p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="30"></div>
                                                </div>
                                            </li>
                                        </ul>
                                        <!-- end of skills -->

                                    </div>
                                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                        <div class="col-md-12 col-sm-12 col-xs-12">
                                            <div class="x_panel">
                                                <div class="x_title">
                                                    <h2>整体信息</h2>
                                                    <ul class="nav navbar-right panel_toolbox">
                                                        <li>
                                                            <a class="collapse-link"><i
                                                                    class="fa fa-chevron-up"></i></a>
                                                        </li>
                                                        <li>
                                                            <a class="close-link"><i class="fa fa-close"></i></a>
                                                        </li>
                                                    </ul>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <div class="x_content">

                                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                                        <div class="row">
                                                            <div class="col-md-12 col-sm-12 col-xs-12">
                                                                <div class="x_panel tile fixed_height_auto">
                                                                    <div class="x_title">
                                                                        <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                                            信息全览</h2>
                                                                        <ul class="nav navbar-right panel_toolbox">
                                                                            <li>
                                                                                <a class="collapse-link"><i
                                                                                        class="fa fa-chevron-up"></i></a>
                                                                            </li>
                                                                            <li>
                                                                                <a class="close-link"><i
                                                                                        class="fa fa-close"></i></a>
                                                                            </li>
                                                                        </ul>
                                                                        <div class="clearfix"></div>
                                                                    </div>
                                                                    <div class="x_content">
                                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                                             style="margin-top: 3%;background-color: #fac696;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    总览</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradewarnallnum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>帮扶总人数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>12人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <div class="col-md-5 col-sm-5 col-xs-5"
                                                                             style="margin-top: 3%;background-color: #FFFFCC;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                                    各级别预警</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradewarnlevelnum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>黄色预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>2人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>橙色预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>5人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>红色预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>5人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>
                                                                        <div class="col-md-offset-2 col-md-5 col-sm-offset-2 col-sm-5 col-xs-offset-2 col-xs-5"
                                                                             style="margin-top: 3%;background-color: #FFFFCC;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                                    各类型预警</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradewarntypenum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>学分预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>4人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>成绩预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>4人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>其他预警</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>4人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <br/>
                                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                                             style="margin-top: 3%;background-color: #f6ebbc;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                                    帮扶效果</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradehelpresult"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>成功</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>8人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>失败</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>1人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>进行中</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>3人</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <br/>

                                                        <div class="row">
                                                            <div class="col-md-12 col-sm-12 col-xs-12">
                                                                <div class="x_panel tile fixed_height_auto">
                                                                    <div class="x_title">
                                                                        <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                                            帮扶计划全览</h2>
                                                                        <ul class="nav navbar-right panel_toolbox">
                                                                            <li>
                                                                                <a class="collapse-link"><i
                                                                                        class="fa fa-chevron-up"></i></a>
                                                                            </li>
                                                                            <li>
                                                                                <a class="close-link"><i
                                                                                        class="fa fa-close"></i></a>
                                                                            </li>
                                                                        </ul>
                                                                        <div class="clearfix"></div>
                                                                    </div>
                                                                    <div class="x_content">
                                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                                             style="margin-top: 3%;background-color: #FFFFCC;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    总览</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="helpplaninfor"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th colspan="2"
                                                                                            style="text-align: center;">
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td colspan="2"
                                                                                            style="text-align: center;">
                                                                                            <p>12</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>12</p>
                                                                                        </td>
                                                                                        <th>
                                                                                            <p>待审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已通过</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>12</p>
                                                                                        </td>
                                                                                        <th>
                                                                                            <p>未通过</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <br/>

                                                        <div class="row">
                                                            <div class="col-md-12 col-sm-12 col-xs-12">
                                                                <div class="x_panel tile fixed_height_auto">
                                                                    <div class="x_title">
                                                                        <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                                            帮扶工作全览</h2>
                                                                        <ul class="nav navbar-right panel_toolbox">
                                                                            <li>
                                                                                <a class="collapse-link"><i
                                                                                        class="fa fa-chevron-up"></i></a>
                                                                            </li>
                                                                            <li>
                                                                                <a class="close-link"><i
                                                                                        class="fa fa-close"></i></a>
                                                                            </li>
                                                                        </ul>
                                                                        <div class="clearfix"></div>
                                                                    </div>
                                                                    <div class="x_content">
                                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                                             style="margin-top: 3%;background-color: #fac696;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    总览</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradehelpallnum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>12</p>
                                                                                        </td>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>12</p>
                                                                                        </td>
                                                                                        <th>
                                                                                            <p>待审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <div class="col-md-5 col-sm-5 col-xs-12"
                                                                             style="margin-top: 3%;background-color:  #FFFFCC;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    心理辅导类</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class=""
                                                                                       id="gradepsychologicalnum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>4</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>4</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>未审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <div class="col-md-offset-2 col-md-5 col-sm-offset-2 col-sm-5 col-xs-12"
                                                                             style="margin-top: 3%;background-color:  #FFFFCC;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    专业指导类</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class=""
                                                                                       id="gradeprofessionalnum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>3</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>3</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>未审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <br/>

                                                                        <div class="col-md-5 col-sm-5 col-xs-12 "
                                                                             style="margin-top: 3%;background-color: #f6ebbc;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    电话约谈类</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradetelephonenum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>2</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>2</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>未审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                        <div class="col-md-offset-2 col-md-5 col-sm-offset-2 col-sm-5 col-xs-12"
                                                                             style="margin-top: 3%;background-color: #f6ebbc;">
                                                                            <div class="x_title">
                                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                                    其他类</h2>
                                                                                <div class="clearfix"></div>
                                                                            </div>
                                                                            <div class="x_content">
                                                                                <table class="" id="gradeothernum"
                                                                                       style="width:100%;color: #000000;">
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>总数</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>3</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>已审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>3</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <th>
                                                                                            <p>未审</p>
                                                                                        </th>
                                                                                        <td>
                                                                                            <p>0</p>
                                                                                        </td>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <br/>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
            <div class="pull-right">
                本科生学业预警信息管理系统
            </div>
            <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
    </div>
</div>
<!-- jQuery -->
<script src="../../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/index/instructorindex.js"></script>
<!-- bootstrap-progressbar -->
<script src="../../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<script type="text/javascript" src="../js/ajaxframe.js"></script>
</body>

</html>