<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>系统管理员——首页 | </title>

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
                    <a href="administratorindex.jsp" class="site_title"><i class="fa fa-mortar-board"></i>
                        <span>学业预警与帮扶</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="http://q.qlogo.cn/headimg_dl?dst_uin=${sessionScope.administrator.qq}&spec=640&img_type=jpg"
                             alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>Welcome,</span>
                        <h2></h2>
                        <input type="hidden" id="studentid" value="${sessionScope.administrator.id}">
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br/>

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul class="nav side-menu">
                            <li>
                                <a href="/page/index/administrator.jsp"><i class="fa fa-home"></i> 主页 </a>
                            </li>
                            <li>
                                <a><i class="fa fa-user"></i> 用户管理 <span class="fa fa-chevron-down"></span> </a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../administrator/userinsert.jsp">用户增加</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/userdelete.jsp">用户删除</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/userupdate.jsp">用户修改</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/userselect.jsp">用户查询</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-key"></i> 角色管理 <span class="badge bg-green">6</span><span
                                        class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../administrator/roleinsert.jsp">角色增加</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/roledelete.jsp">角色删除</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/roleupdate.jsp">角色修改</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/roleselect.jsp">角色查询</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a><i class="fa fa-lock"></i> 权限管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="../administrator/authorizationinsert.jsp">权限增加</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/authorizationdelete.jsp">权限删除</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/authorizationupdate.jsp">权限修改</a>
                                    </li>
                                    <li>
                                        <a href="../administrator/authorizationselect.jsp">权限查询</a>
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
                    <div class="clearfix"></div>
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


                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <div class="x_panel tile fixed_height_auto">
                                            <div class="x_title">
                                                <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                    角色管理</h2>
                                                <div class="clearfix"></div>

                                            </div>
                                            <div class="x_content">
                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">新增</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <form action="/role/add" method="post">
                                                            <table class="" id="roleadd"
                                                                   style="width:100%;color: #000000;">

                                                                <tr>
                                                                    <th width="35%" style="text-align: center;">
                                                                        <p>角色代码</p>
                                                                    </th>
                                                                    <th width="35%" style="text-align: center;">
                                                                        <p>角色名称</p>
                                                                    </th>
                                                                </tr>
                                                                <tr>
                                                                    <td>
                                                                        <p><input name="rolecode" id="newroleno"
                                                                                  class="form-control col-md-7 col-xs-12"
                                                                                  type="text" style="width: 100%"></p>
                                                                    </td>
                                                                    <td>
                                                                        <p><input name="rolename" id="newrolename"
                                                                                  class="form-control col-md-7 col-xs-12"
                                                                                  type="text" style="width: 100%"></p>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3" align="center">
                                                                        <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                            <p></p>
                                                                            <button id="newroleconfirm" type="submit"
                                                                                    class="btn btn-success">确认
                                                                            </button>
                                                                            <button id="newroleclear" type="reset"
                                                                                    class="btn btn-dark">清空
                                                                            </button>
                                                                        </div>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </form>
                                                    </div>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #FFFFCC;">
                                                    <div class="x_title">
                                                        <div class="col-md-6 col-sm-6 col-xs-6"
                                                             style="font-family: '微软雅黑';color: #000000;font-size: large;">
                                                            列表
                                                        </div>
                                                        <form action="/role/list" method="post">
                                                            <button id="rolelistbutton"
                                                                    class="btn btn-info btn-group-sm" type="submit"
                                                                    style="margin-left: 30%;" onclick="">查看！
                                                            </button>

                                                        </form>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content" align="center"
                                                         style="width:100%;height:300px;overflow-y: scroll;">
                                                        <table class="" id="rolelist"
                                                               style="width:100%;color: #000000;height:35px;overflow-y: scroll;">
                                                            <tr>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>角色代码</p>
                                                                </th>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>角色名称</p>
                                                                </th>
                                                            </tr>
                                                            <c:forEach items="${sessionScope.roleList}" var="role">
                                                                <tr>
                                                                    <td style="text-align: center;">
                                                                        <p>${role.rolecode}</p>
                                                                    </td>
                                                                    <td style="text-align: center;">
                                                                        <p>${role.rolename}</p>
                                                                    </td>
                                                                </tr>
                                                            </c:forEach>
                                                            <%--<tr>
                                                                <td style="text-align: center;">
                                                                    <p>1</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>学生</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>2</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>教师</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>3</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>校领导</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>4</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>院系领导</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>5</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>处室领导</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>6</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>教学秘书</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>7</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>辅导员</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>8</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>班主任</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>9</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>帮扶人</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>10</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>家长</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>11</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>学籍管理员</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>12</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>系统管理员</p>
                                                                </td>
                                                            </tr>--%>
                                                        </table>

                                                    </div>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">删除</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <table class="" id="roledelete"
                                                               style="width:100%;color: #000000;">

                                                            <tr>
                                                                <th width="40%">
                                                                    <p>用户名</p>
                                                                </th>
                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    <p><input id="deleterolename"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="3" align="center">
                                                                    <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                        <p></p>
                                                                        <button id="deleteroleconfirm" type="button"
                                                                                class="btn btn-danger">确认
                                                                        </button>
                                                                        <button id="deleteroleclear" type="reset"
                                                                                class="btn btn-dark">清空
                                                                        </button>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </table>

                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="x_panel tile fixed_height_auto">
                                            <div class="x_title">
                                                <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                    权限管理</h2>
                                                <div class="clearfix"></div>

                                            </div>
                                            <div class="x_content">
                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #FFFFCC;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">新增</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <form action="/user/adduserscope" method="post">
                                                            <table class="" id="rangeadd"
                                                                   style="width:100%;color: #000000;">

                                                                <tr>
                                                                    <th width="35%">
                                                                        <p>用户名</p>
                                                                    </th>
                                                                    <th width="35%">
                                                                        <p>管理范围</p>
                                                                    </th>
                                                                </tr>
                                                                <tr>
                                                                    <td>
                                                                        <p><input id="rangeaddusername" name="username"
                                                                                  class="form-control col-md-7 col-xs-12"
                                                                                  type="text" style="width: 100%"></p>
                                                                    </td>
                                                                    <td>
                                                                        <p><input id="addrangename" name="scope"
                                                                                  class="form-control col-md-7 col-xs-12"
                                                                                  type="text" style="width: 100%"></p>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="3" align="center">
                                                                        <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                            <p></p>
                                                                            <button id="addrangeconfirm" type="submit"
                                                                                    class="btn btn-success">确认
                                                                            </button>
                                                                            <button id="addrangeclear" type="reset"
                                                                                    class="btn btn-dark">清空
                                                                            </button>
                                                                        </div>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </form>
                                                    </div>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <form action="/user/listuserscope" method="post">
                                                        <div class="x_title">
                                                            <h2 style="font-family: '微软雅黑';color: #000000;">查询</h2>
                                                            <div class="clearfix"></div>
                                                        </div>
                                                        <div class="x_content" align="center">
                                                            <div class="col-md-6 col-sm-6 col-xs-6">
                                                                <input id="rangeselectusername" name="username"
                                                                       class="form-control col-md-12 col-sm-12 col-xs-12"
                                                                       type="text" style="width: 100%"
                                                                       placeholder="用户名">
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6">
                                                                <button id="rangeselectconfirm" type="submit"
                                                                        class="btn btn-success">查询
                                                                </button>
                                                            </div>
                                                            <table class="" id="rangeselect"
                                                                   style="width:100%;color: #000000;margin-top: 10%;">
                                                                <tr>
                                                                    <th width="35%" style="text-align: center;">
                                                                        <p>用户名</p>
                                                                    </th>
                                                                    <th width="35%" style="text-align: center;">
                                                                        <p>管理范围</p>
                                                                    </th>
                                                                </tr>
                                                                <c:forEach items="${userscopeList}" var="userscope">
                                                                    <tr>
                                                                        <td style="text-align: center;">
                                                                            <p>${userscope[0]}</p>
                                                                        </td>
                                                                        <td style="text-align: center;">
                                                                            <p>${userscope[1]}</p>
                                                                        </td>
                                                                    </tr>
                                                                </c:forEach>

                                                            </table>

                                                        </div>
                                                    </form>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #FFFFCC;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">删除</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <table class="" id="rangedelete"
                                                               style="width:100%;color: #000000;">

                                                            <tr>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>用户名</p>
                                                                </th>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>管理范围</p>
                                                                </th>
                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    <p><input id="rangedeleteusername"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                                <td>
                                                                    <p><input id="deleterangetname"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="3" align="center">
                                                                    <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                        <p></p>
                                                                        <button id="deleterangeconfirm" type="button"
                                                                                class="btn btn-danger">确认
                                                                        </button>
                                                                        <button id="deleterangeclear" type="reset"
                                                                                class="btn btn-dark">清空
                                                                        </button>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </table>

                                                    </div>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">修改</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content" align="center">
                                                        <table class="" id="updaterange"
                                                               style="width:100%;color: #000000;">
                                                            <tr>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>用户名</p>
                                                                </th>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>管理范围</p>
                                                                </th>
                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    <p><input id="updaterangeusername"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                                <td>
                                                                    <p><input id="updaterangename"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="3" align="center">
                                                                    <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                        <p></p>
                                                                        <button id="updaterangeconfirm" type="button"
                                                                                class="btn btn-success">确认
                                                                        </button>
                                                                        <button id="updaterangeclear" type="reset"
                                                                                class="btn btn-dark">清空
                                                                        </button>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </table>

                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <div class="x_panel tile fixed_height_auto">
                                            <div class="x_title">
                                                <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">
                                                    用户管理</h2>
                                                <div class="clearfix"></div>

                                            </div>
                                            <div class="x_content">
                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">查询</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content" align="center">
                                                        <div class="col-md-6 col-sm-6 col-xs-6">
                                                            <input id="selectusername"
                                                                   class="form-control col-md-12 col-sm-12 col-xs-12"
                                                                   type="text" style="width: 100%" placeholder="用户名">
                                                        </div>
                                                        <div class="col-md-6 col-sm-6 col-xs-6">
                                                            <button id="selectuserconfirm" type="button"
                                                                    class="btn btn-success">查询
                                                            </button>
                                                        </div>
                                                        <table class="" id="selectuser"
                                                               style="width:100%;color: #000000;margin-top: 10%;">
                                                            <tr>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>用户名</p>
                                                                </th>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>密码</p>
                                                                </th>
                                                                <th width="30%" style="text-align: center;">
                                                                    <p>角色</p>
                                                                </th>
                                                            </tr>
                                                            <tr>
                                                                <td style="text-align: center;">
                                                                    <p>张笑</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>1234</p>
                                                                </td>
                                                                <td style="text-align: center;">
                                                                    <p>学生</p>
                                                                </td>
                                                            </tr>

                                                        </table>

                                                    </div>
                                                </div>

                                                <div class="col-md-12 col-sm-12 col-xs-12"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">修改</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content" align="center">
                                                        <table class="" id="updateuser"
                                                               style="width:100%;color: #000000;">
                                                            <tr>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>用户名</p>
                                                                </th>
                                                                <th width="35%" style="text-align: center;">
                                                                    <p>密码</p>
                                                                </th>
                                                                <th width="30%" style="text-align: center;">
                                                                    <p>角色</p>
                                                                </th>
                                                            </tr>
                                                            <tr>
                                                                <td>
                                                                    <p><input id="updateusername"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                                <td>
                                                                    <p><input id="updateuserpassword"
                                                                              class="form-control col-md-7 col-xs-12"
                                                                              type="text" style="width: 100%"></p>
                                                                </td>
                                                                <td>
                                                                    <p>
                                                                        <select id="updateuserrole"
                                                                                class="form-control col-md-7 col-xs-12"
                                                                                style="font-family: '微软雅黑';">
                                                                            <c:forEach items="${sessionScope.roleList}"
                                                                                       var="role">
                                                                                <option value="${role.id}">${role.rolename}</option>
                                                                            </c:forEach>
                                                                        </select>
                                                                    </p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td colspan="3" align="center">
                                                                    <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                                                        <p></p>
                                                                        <button id="updateuserconfirm" type="button"
                                                                                class="btn btn-success">确认
                                                                        </button>
                                                                        <button id="updateuserclear" type="reset"
                                                                                class="btn btn-dark">清空
                                                                        </button>
                                                                    </div>
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
<!-- bootstrap-progressbar -->-->
<script src="../../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- Custom Theme Scripts -->
<script src="../../build/js/custom.min.js"></script>
<script type="text/javascript" src="../js/ajaxframe.js"></script>
<script type="text/javascript" src="../js/index/administratorindex.jsp.js"></script>

</body>
</html>