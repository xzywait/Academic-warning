<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>专业预警学生列表</title>
</head>

<body>
<!-- page content -->
<div class="right_col" role="main">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>专业预警学生列表
                    <small></small>
                </h3>
            </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>总览</h2>
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
                            <div class="col-md-12 col-sm-12 col-xs-12 text-center" id="upsearch">
                                <label class="control-label col-md-2 col-sm-2 col-xs-2">年级
                                </label>
                                <div class="col-md-3 col-sm-3 col-xs-3">
                                    <select id="year" class="form-control col-md-7 col-xs-12"
                                            style="font-family: '微软雅黑';">
                                        <option value="0" selected="selected">不限</option>
                                        <option value="1">大一</option>
                                        <option value="2">大二</option>
                                        <option value="3">大三</option>
                                        <option value="4">大四</option>
                                    </select>
                                </div>
                                <label class="control-label col-md-2 col-sm-2 col-xs-2">专业
                                </label>
                                <div class="col-md-3 col-sm-3 col-xs-3">
                                    <select id="major" class="form-control col-md-7 col-xs-12"
                                            style="font-family: '微软雅黑';">
                                        <option value="0" selected="selected">不限</option>
                                        <option value="1">计算机</option>
                                        <option value="2">信管</option>
                                        <option value="3">软件</option>
                                        <option value="4">电商</option>
                                    </select>
                                </div>
                                <div class="col-md-2">
                                    <button id="send" type="submit" class="btn btn-success">确认</button>
                                </div>
                            </div>
                            <!-- start project list -->
                            <table id="majorlist" class="table table-striped projects col-md-12 col-sm-12 col-xs-12">
                                <thead>
                                <tr>
                                    <th style="width: 10%">序号</th>
                                    <th style="width: 10%">年级</th>
                                    <th style="width: 15%">专业</th>
                                    <th>班级</th>
                                    <th style="width: 10%">查看</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>
                                        <a>大二</a>
                                    </td>
                                    <td>
                                        <a>软件</a>
                                    </td>
                                    <td>
                                        <ul class="list-inline">
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                        </ul>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs">查看</button>
                                    </td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>
                                        <a>大二</a>
                                    </td>
                                    <td>
                                        <a>信管</a>
                                    </td>
                                    <td>
                                        <ul class="list-inline">
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                        </ul>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs">查看</button>
                                    </td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>
                                        <a>大二</a>
                                    </td>
                                    <td>
                                        <a>计算机</a>
                                    </td>
                                    <td>
                                        <ul class="list-inline">
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                        </ul>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs">查看</button>
                                    </td>
                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>
                                        <a>大二</a>
                                    </td>
                                    <td>
                                        <a>电商</a>
                                    </td>
                                    <td>
                                        <ul class="list-inline">
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                            <li>
                                                <img src="../images/user.png" class="avatar" alt="Avatar">
                                            </li>
                                        </ul>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs">查看</button>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </form>

                        <!-- end project list -->

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->
<script type="text/javascript" src="../js/common/majorwarning.js"></script>

</body>

</html>