<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>缺考学生记录 | </title>
</head>

<body class="nav-md">
<!-- page content -->
<div id="content">
    <div class="right_col" role="main">
        <div class="">
            <div class="page-title">
                <div class="title_left">
                    <h3>缺考学生记录</h3>
                </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
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
                        <div class="x_content">
                            <form class="form-horizontal form-label-left" novalidate>
                                <table class="table table-striped"
                                       style="width: 100%;height: auto;table-layout: fixed;word-break: break-all;">
                                    <caption style="font-family: '微软雅黑';text-align: center;">缺考记录表</caption>
                                    <tr>
                                        <th style="width: 20%;text-align: center;">
                                            考生姓名
                                        </th>
                                        <th style="width: 20%;text-align: center;">
                                            考试课程
                                        </th>
                                        <th style="width: 20%;text-align: center;">
                                            考试时间
                                        </th>
                                        <th style="width: 20%;text-align: center;">
                                            操作
                                        </th>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                            <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增
                                            </a>
                                            <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                            <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增
                                            </a>
                                            <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <input id="name" class="form-control col-md-7 col-xs-12"
                                                   data-validate-length-range="6" data-validate-words="2" name="name"
                                                   required="required" type="text">
                                        </td>
                                        <td>
                                            <a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i> 编辑 </a>
                                            <a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i> 新增
                                            </a>
                                            <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i> 删除
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                                <div class="form-group">
                                    <div class="col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-6 col-xs-offset-3">
                                        <button id="send" type="submit" class="btn btn-success">确认</button>
                                        <button type="submit" class="btn btn-dark">清空</button>
                                    </div>
                                </div>
                            </form>
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