<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>学生缺勤记录 | </title>
</head>

<body class="nav-md">

<!-- page content -->
<div class="right_col" role="main">
    <div class="">
        <div class="page-title">
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-5 col-sm-5 col-xs-5">
                <div class="x_panel col-md-5 col-sm-5 col-xs-5">
                    <div class="x_title">
                        <h2>记录
                            <small></small>
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
                    <form id="form" class="form-horizontal form-label-left" novalidate action="/absentCourse/addRecord">
                        <table class="table table-striped"
                               style="width: 100%;height: auto;table-layout: fixed;word-break: break-all;">
                            <tr>
                                <th style="width: 20%;text-align: center;">
                                    班级
                                </th>
                                <th style="width: 20%;text-align: center;">
                                    学号
                                </th>
                                <th style="width: 15%;text-align: center;">
                                    课程
                                </th>
                                <th style="width: 10%;text-align: center;">
                                    缺勤次数
                                </th>
                                <th style="width: 15%;text-align: center;">
                                    预警等级
                                </th>
                                <th style="width: 20%;text-align: center;">
                                    操作
                                </th>
                            </tr>
                            <tr>
                                <td style="width: 20%;text-align: center;">
                                    <input type="hidden" name="teacherid" value="${sessionScope.teacher.id}"/>


                                    <input id="classname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="classname"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <input id="studentnumber" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="studentnumber"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="coursename" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="coursename"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 10%;text-align: center;">
                                    <input id="absenttimes" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="absenttimes"
                                           required="required" type="text"><br/>
                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="warninglevelname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2"
                                           name="warninglevelname" required="required" type="text"><br/>
                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                    <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增 </a>
                                    <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除 </a>
                                </td>
                            </tr>
                            <tr>

                                <td style="width: 20%;text-align: center;">
                                    <input type="hidden" name="teacherid" value="${sessionScope.teacher.id}"/>


                                    <input id="classname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="classname"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <input id="studentnumber" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="studentnumber"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="coursename" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="coursename"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 10%;text-align: center;">
                                    <input id="absenttimes" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="absenttimes"
                                           required="required" type="text"><br/>
                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="warninglevelname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2"
                                           name="warninglevelname" required="required" type="text"><br/>
                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                    <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增 </a>
                                    <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除 </a>
                                </td>
                            </tr>
                            <tr>
                                <td style="width: 20%;text-align: center;">
                                    <input type="hidden" name="teacherid" value="${sessionScope.teacher.id}"/>
                                    <input id="classname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="classname"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <input id="studentnumber" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="studentnumber"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="coursename" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="coursename"
                                           required="required" type="text"><br/>

                                </td>
                                <td style="width: 10%;text-align: center;">
                                    <input id="absenttimes" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2" name="absenttimes"
                                           required="required" type="text"><br/>
                                </td>
                                <td style="width: 15%;text-align: center;">
                                    <input id="warninglevelname" class="form-control col-md-7 col-xs-12"
                                           data-validate-length-range="6" data-validate-words="2"
                                           name="warninglevelname" required="required" type="text"><br/>
                                </td>
                                <td style="width: 20%;text-align: center;">
                                    <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                    <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增 </a>
                                    <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除 </a>
                                </td>
                            </tr>
                        </table>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">

                                <button id="send" type="button" class="btn btn-success">确认</button>
                                <button id="clear" type="reset" class="btn btn-dark">清空</button>
                            </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->
</body>
<script type="text/javascript" src="../js/teacher/attendance.js"></script>
</html>