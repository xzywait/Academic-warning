<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>学生——首页 | </title>

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
                    <a href="stuindex.jsp" class="site_title"><i class="fa fa-mortar-board"></i>
                        <span>学业预警与帮扶</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="http://q.qlogo.cn/headimg_dl?dst_uin=${sessionScope.student.qq}&spec=640&img_type=jpg"
                             alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>Welcome,</span>
                        <h2>${sessionScope.student.studentname}</h2>
                        <input type="hidden" id="studentid" value="${sessionScope.student.id}">
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br/>

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul class="nav side-menu">
                            <li>
                                <a href="stuindex.jsp"><i class="fa fa-home"></i> 主页 </a>
                            </li>
                            <li>
                                <a><i class="fa fa-book"></i> 课程信息 <span class="fa fa-chevron-down"></span> </a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../student/coursereadingsituation.jsp">课程修读情况</a>
                                    </li>
                                    <li>
                                        <a href="../student/gpacalculated.jsp">学积分试算</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-bell"></i> 预警信息 <span class="badge bg-green">6</span><span
                                        class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/warningstandard.jsp">预警标准</a>
                                    </li>
                                    <li>
                                        <a href="../student/onestuwarnsum.jsp">预警信息<span class="badge bg-green">6</span></a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-heart"></i> 帮扶信息 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../common/helpstandard.jsp">帮扶计划</a>
                                    </li>
                                    <li>
                                        <a href="../student/helpplanning.jsp">帮扶过程记录</a>
                                        <input type="hidden" id="helpid">
                                    </li>
                                    <li>
                                        <a href="../student/helpsummary.jsp">帮扶总结</a>
                                        <input type="hidden" id="helpsummaryid">
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
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="../../index.jsp">
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
                                <input type="hidden" id="userqq" value="${sessionScope.student.qq}">
                                <img src="http://q.qlogo.cn/headimg_dl?dst_uin=${sessionScope.student.qq}&spec=640&img_type=jpg"
                                     alt="">${user.name}
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
                                    <a href="../../index.jsp"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
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


                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>基本信息
                                        <small>备注信息</small>
                                    </h2>

                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <div class="col-md-4 col-sm-4 col-xs-12 profile_left">
                                        <div class="profile_img">
                                            <div id="crop-avatar">
                                                <!-- Current avatar -->
                                                <img id="stuindeximg" class="img-responsive avatar-view"
                                                     src="../images/picture.jpg" alt="Avatar" title="Change the avatar"
                                                     width="220" height="220">
                                            </div>
                                        </div>
                                        <h3 id="leftstuname">姓名&nbsp;&nbsp; </h3>


                                        <ul class="list-unstyled user_data" id="leftmid" style="font-size: large;">
                                            <li><i class="fa fa-university user-profile-icon"></i> &nbsp;&nbsp;学院：
                                            </li>

                                            <li>
                                                <i class="fa fa-list-alt user-profile-icon"></i> &nbsp;&nbsp;班级：
                                            </li>

                                            <li class="m-top-xs">
                                                <i class="fa fa-phone user-profile-icon"></i>
                                                &nbsp;&nbsp;电话：
                                            </li>
                                        </ul>

                                        <a href="../common/personalinformation.jsp"
                                           class="btn btn-success personalinformation"><i
                                                class="fa fa-edit m-right-xs"></i>编辑</a>
                                        <br/>
                                        <!-- start skills -->
                                        <a class="personalinformation" href="../student/coursereadingsituation.jsp">
                                            <h3 style="margin-top: 50px;"> 课程修读情况 </h3></a>
                                        <p></p>
                                        <ul class="list-unstyled user_data" id="leftdown">
                                            <li>
                                                <p>
                                                <h4>必修</h4></p>
                                                <div class="progress progress_wide">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="">
                                                        <span id="spanone"></span>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>
                                                <h4>选修</h4></p>
                                                <div class="progress progress_wide">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="">
                                                        <span id="spantwo"></span>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>
                                                <h4>任选</h4></p>
                                                <div class="progress progress_wide">
                                                    <div class="progress-bar bg-green" role="progressbar"
                                                         data-transitiongoal="">
                                                        <span id="spanthree"></span>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                        <!-- end of skills -->

                                    </div>
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <div class="row">
                                            <div class="col-md-12 col-sm-12 col-xs-12">
                                                <div class="x_panel tile fixed_height_auto">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                            预警信息全览</h2>

                                                    </div>
                                                    <div class="x_content">
                                                        <div class="col-md-6 col-sm-6 col-xs-6"
                                                             style="margin-top: 3%;background-color: #FFFFCC;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                    上一学期</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="lastterm"
                                                                       style="width:100%;color: #000000;">

                                                                    <tr>
                                                                        <th>
                                                                            <p>学分或成绩预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>3次</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>其他预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>2次</p>
                                                                        </td>
                                                                    </tr>
                                                                </table>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6 col-sm-6 col-xs-6"
                                                             style="margin-top: 3%;background-color: #f6ebbc;">
                                                            <div class="x_title">
                                                                <h2 style="font-family: '微软雅黑';color: #000000;">
                                                                    学期累计</h2>
                                                                <div class="clearfix"></div>
                                                            </div>
                                                            <div class="x_content">
                                                                <table class="" id="totalterm"
                                                                       style="width:100%;color: #000000;">

                                                                    <tr>
                                                                        <th>
                                                                            <p>学分或成绩预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>5次</p>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th>
                                                                            <p>其他预警</p>
                                                                        </th>
                                                                        <td>
                                                                            <p>6次</p>
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

                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active">
                                                    <a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab"
                                                       aria-expanded="true" style="background-color: #f65155">红色预警</a>
                                                </li>
                                                <li role="presentation" class="">
                                                    <a href="#tab_content2" role="tab" id="profile-tab"
                                                       data-toggle="tab" aria-expanded="false"
                                                       style="background-color: #f69939">橙色预警</a>
                                                </li>
                                                <li role="presentation" class="">
                                                    <a href="#tab_content3" role="tab" id="profile-tab2"
                                                       data-toggle="tab" aria-expanded="false"
                                                       style="background-color: #f6f672">黄色预警</a>
                                                </li>
                                            </ul>
                                            <div id="myTabContent" class="tab-content">
                                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content1"
                                                     aria-labelledby="home-tab">

                                                    <!-- start recent activity -->
                                                    <ul class="messages" id="rightone">

                                                    </ul>
                                                    <!-- end recent activity -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content2"
                                                     aria-labelledby="profile-tab">

                                                    <!-- start recent activity -->
                                                    <ul class="messages" id="righttwo">

                                                    </ul>
                                                    <!-- end recent activity -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content3"
                                                     aria-labelledby="profile-tab">
                                                    <!-- start recent activity -->
                                                    <ul class="messages" id="rightthree">

                                                    </ul>
                                                    <!-- end recent activity -->
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

<script type="text/javascript" src="../js/index/stuindex.js"></script>

<!-- bootstrap-progressbar -->
<script src="../../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>

<script type="text/javascript" src="../js/ajaxframe.js"></script>


</body>

</html>