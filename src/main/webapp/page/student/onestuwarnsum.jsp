<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>学生预警列表 | </title>
</head>

<body class="nav-md">
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">学业预警详情</h2>
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
                    <form class="form-horizontal form-label-left">
                        <br/>
                        <h4 style="font-family: '微软雅黑';">结果性预警</h4>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>所修学分类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="creditwarn" class="" style="width:100%;height:auto;">
                                    <tr>
                                        <th>
                                            <p>预警类型</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警学年</p>
                                        </th>
                                        <th>
                                            <p>预警学期</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">平均学积分类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="averagescore" class="" style="width:100%;height:auto;color: white;">
                                    <tr>
                                        <th>
                                            <p>预警类型</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警学年</p>
                                        </th>
                                        <th>
                                            <p>预警学期</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">其他类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="otherwarn" class=""
                                       style="width:100%;height:auto;color: white;word-break:break-all; word-wrap:break-all;">
                                    <tr>
                                        <th>
                                            <p>预警类型</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警学年</p>
                                        </th>
                                        <th>
                                            <p>预警学期</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>四六级预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="spetswarn" class=""
                                       style="width:100%;height:auto;word-break:break-all; word-wrap:break-all;">
                                    <tr>
                                        <th>
                                            <p>预警类型</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警学年</p>
                                        </th>
                                        <th>
                                            <p>预警学期</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>

                        <br/>
                        <div class="col-md-12 col-sm-12 col-xs-12" style="margin-top: 10%;background-color: #FAFAFA;">
                            <span style="font-family: '微软雅黑';">过程性预警</span>
                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>缺勤类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="course" style="width:100%;height:auto;">
                                    <tr>
                                        <th>
                                            <p>预警课程</p>
                                        </th>
                                        <th>
                                            <p>缺勤次数</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">平时考核类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="usual" style="width:100%;height:auto;color: white;">
                                    <tr>
                                        <th>
                                            <p>预警课程</p>
                                        </th>
                                        <th>
                                            <p>预警内容</p>
                                        </th>
                                        <th>
                                            <p>预警等级</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">缺考类预警</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table id="exam" style="width:100%;height:auto;color: white;">
                                    <tr>
                                        <th>
                                            <p>缺考课程</p>
                                        </th>
                                        <th>
                                            <p>预警学年</p>
                                        </th>
                                        <th>
                                            <p>预警学期</p>
                                        </th>
                                        <th>
                                            <p>预警时间</p>
                                        </th>
                                    </tr>

                                </table>
                            </div>
                        </div>
                        <br/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../js/student/onestuwarnsum.js"></script>
</html>