<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>帮扶详细页 | </title>

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
                    <a href="../index/teacherindex.jsp" class="site_title"><i class="fa fa-mortar-board"></i> <span>欢迎登录！</span></a>
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
                                <a href="../index/teacherindex.jsp"><i class="fa fa-home"></i> 主页 </a>
                            </li>
                            <li>
                                <a><i class="fa fa-upload"></i> 预警工作记录 <span class="fa fa-chevron-down"></span> </a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../teacher/attendance.jsp">考勤情况记录</a>
                                    </li>
                                    <li>
                                        <a href="../teacher/ordinarycheck.jsp">平时考核情况记录</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-bell"></i> 预警信息 <span class="badge bg-green">8</span><span
                                        class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/warningstandard.jsp">预警标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/classwarning.jsp">班级预警信息<span class="badge bg-green">8</span></a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-heart"></i> 帮扶记录 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/helpstandard.jsp">帮扶标准</a>
                                    </li>
                                    <li>
                                        <a href="../common/helpworklist.jsp">记录查看</a>
                                    </li>
                                    <li>
                                        <a href="../common/helpworkupload.jsp"> 帮扶工作记录 </a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-upload"></i> 缺考学生记录 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../teacher/missexam.jsp">缺考学生记录</a>
                                    </li>
                                </ul>
                            </li>
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
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel tile fixed_height_auto">
                            <div class="x_title">
                                <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">帮扶详情</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <form class="form-horizontal form-label-left">
                                    <div class="col-md-12 col-sm-12 col-xs-12"
                                         style="margin-top: 3%;background-color: #FAFAFA;">
                                        <table class="" style="width:100%">
                                            <tr>
                                                <th>
                                                    <p>被帮扶人姓名</p>
                                                </th>
                                                <td>
                                                    <p>孙晓</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>预警类型</p>
                                                </th>
                                                <td>
                                                    <p>成绩预警</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>预警等级</p>
                                                </th>
                                                <td>
                                                    <p>黄色</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>问题分析</p>
                                                </th>
                                                <td>
                                                    <p>沉迷游戏</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>帮扶计划</p>
                                                </th>
                                                <td>
                                                    <p>监督学习</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>帮扶形式</p>
                                                </th>
                                                <td>
                                                    <p>专业指导</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>帮扶具体措施</p>
                                                </th>
                                                <td>
                                                    <p>定期督导</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>帮扶时间</p>
                                                </th>
                                                <td>
                                                    <p>2016-12-24</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>帮扶地点</p>
                                                </th>
                                                <td>
                                                    <p>8号楼</p>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                            </div>
                            </form>
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

<script type="text/javascript" src="../js/index/teacherindex.js"></script>

<!-- bootstrap-progressbar -->
<script src="../../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<script type="text/javascript" src="../js/ajaxframe.js"></script>

</body>

</html>