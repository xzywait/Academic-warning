<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>院系领导——首页 | </title>

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
                    <a href="facultyleaderindex.jsp" class="site_title"><i class="fa fa-mortar-board"></i>
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
                                <a href="facultyleaderindex.jsp"><i class="fa fa-home"></i> 主页 </a>
                            </li>
                            <li>
                                <a><i class="fa fa-bell"></i> 预警信息 <span class="badge bg-green">8</span><span
                                        class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/warningstandard.jsp">预警标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/facultywarning.jsp">院系预警信息<span
                                                class="badge bg-green">2</span></a>
                                    </li>
                                    <li>
                                        <a href="../common/gradewarning.jsp">年级预警信息<span class="badge bg-green">2</span></a>
                                    </li>
                                    <li>
                                        <a href="../common/majorwarning.jsp">专业预警信息<span class="badge bg-green">2</span></a>
                                    </li>
                                    <li>
                                        <a href="../common/classwarning.jsp">班级预警信息<span class="badge bg-green">4</span></a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-heart"></i> 帮扶信息 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/helpstandard.jsp">帮扶标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/facultyhelp.jsp">院系帮扶结果信息</a>
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
                <div class="">
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
                                    <h2>整体信息</h2>
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

                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                        <div class="row">
                                            <div class="col-md-12 col-sm-12 col-xs-12">
                                                <div class="x_panel tile fixed_height_auto">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                            预警信息全览</h2>
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
                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                             style="margin-top: 3%;background-color: #fac696;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                    总览</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="facultywarnallnum"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>预警总人数</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>34人</p>
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
                                                                <table class="" id="facultywarnlevelnum"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>黄色预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>18人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>橙色预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>2人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>红色预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>14人</p>
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
                                                                <table class="" id="facultywarntypenum"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>学分预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>10人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>成绩预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>10人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>其他预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>14人</p>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </div>
                                                        </div>

                                                        <br/>
                                                        <div class="col-md-5 col-sm-5 col-xs-5"
                                                             style="margin-top: 5%;background-color: #f6ebbc;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                    年级预警排名</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="gradewarnmax"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>大一</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>15人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>大二</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>6人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>大三</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>8人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>大四</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>5人</p>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-offset-2 col-md-5 col-sm-offset-2 col-sm-5 col-xs-offset-2 col-xs-5"
                                                             style="margin-top: 5%;background-color: #f6ebbc;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                    专业预警排名</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="majorwarnmax"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>计算机</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>16人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>电商</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>8人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>软件</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>6人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>信管</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>4人</p>
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
                                                            帮扶信息全览</h2>
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
                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                             style="margin-top: 3%;background-color: #fac696;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';font-size:large;font-weight: bold;color: #000000;">
                                                                    总览</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="facultyhelpallnum"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>帮扶总人数</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>34人</p>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-12 col-sm-12 col-xs-12"
                                                             style="margin-top: 3%;background-color: #FFFFCC;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                    帮扶效果</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="facultyhelpresultnum"
                                                                       style="width:100%;color: #000000;">
                                                                    <tr>
                                                                        <th>
                                                                            <p>成功</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>24人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>失败</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>0人</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>进行中</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>10人</p>
                                                                        </td>
                                                                    </tr>
                                                                </table>
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
<!-- bootstrap-progressbar -->
<script src="../../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<script type="text/javascript" src="../js/ajaxframe.js"></script>
</body>

</html>