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
                                             src="../images/picture.jpg" alt="Avatar" title="Change the avatar">
                                    </div>
                                </div>
                                <h3 id="leftstuname">姓名&nbsp;&nbsp; </h3>
                                <input type="hidden" id="studentid" value="${sessionScope.student.id}">

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

                                <a id="personalinformation" href="../common/personalinformation.jsp"
                                   class="btn btn-success"><i class="fa fa-edit m-right-xs"></i>编辑</a>
                                <br/>
                                <!-- start skills -->
                                <a href="coursereadingsituation.jsp">
                                    <h3 style="margin-top: 50px;"> 课程修读情况 </h3></a>
                                <p></p>
                                <ul class="list-unstyled user_data" id="leftdown">
                                    <li>
                                        <p>
                                        <h4>必修</h4></p>
                                        <div class="progress progress_sm">
                                            <div class="progress-bar bg-green" role="progressbar"
                                                 data-transitiongoal=""></div>
                                        </div>
                                    </li>
                                    <li>
                                        <p>
                                        <h4>选修</h4></p>
                                        <div class="progress progress_sm">
                                            <div class="progress-bar bg-green" role="progressbar"
                                                 data-transitiongoal="70"></div>
                                        </div>
                                    </li>
                                    <li>
                                        <p>
                                        <h4>任选</h4></p>
                                        <div class="progress progress_sm">
                                            <div class="progress-bar bg-green" role="progressbar"
                                                 data-transitiongoal="30"></div>
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
                                                     style="margin-top: 3%;background-color: #f0fae4;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: #000000;">上一学期</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <table class="" id="lastterm" style="width:100%">
                                                            <tr>
                                                                <th>
                                                                    <p>学分预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>x次</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <th>
                                                                    <p>成绩预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>y次</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <th>
                                                                    <p>其他预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>z次</p>
                                                                </td>
                                                            </tr>
                                                        </table>
                                                    </div>
                                                </div>
                                                <div class="col-md-6 col-sm-6 col-xs-6"
                                                     style="margin-top: 3%;background-color: #f6ebbc;">
                                                    <div class="x_title">
                                                        <h2 style="font-family: '微软雅黑';color: rgba(54, 51, 59, 0.81);">
                                                            学期累计</h2>
                                                        <div class="clearfix"></div>
                                                    </div>
                                                    <div class="x_content">
                                                        <table class="" id="totalterm"
                                                               style="width:100%;color: rgba(54, 51, 59, 0.81);">
                                                            <tr>
                                                                <th>
                                                                    <p>学分预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>m次</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <th>
                                                                    <p>成绩预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>n次</p>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <th>
                                                                    <p>其他预警</p>
                                                                </th>
                                                                <td>
                                                                    <p>q次</p>
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
                                            <a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab"
                                               aria-expanded="false" style="background-color: #f69939">橙色预警</a>
                                        </li>
                                        <li role="presentation" class="">
                                            <a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab"
                                               aria-expanded="false" style="background-color: #f6f672">黄色预警</a>
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

</body>

</html>