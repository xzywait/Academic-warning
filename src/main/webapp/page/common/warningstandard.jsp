<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>预警标准 | </title>
</head>

<body>
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">学业预警标准</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: #000000;">上学期未获学分占应修总学分的比例</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="termcredit" style="width:100%;height:auto;color: #000000;">
                                    <tr>
                                        <th>
                                            <p>黄色</p>
                                        </th>
                                        <td>
                                            <p>(0%,10%)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>橙色</p>
                                        </th>
                                        <td>
                                            <p>[10%,30%)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>红色</p>
                                        </th>
                                        <td>
                                            <p>[30%,40%)</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #fac696;">
                            <div class="x_title">
                                <h2 style="color: #000000;">累计未获学分数占应修总学分的比例</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="totalcredit" style="width:100%;height:auto;color: #000000;">
                                    <tr>
                                        <th>
                                            <p>黄色</p>
                                        </th>
                                        <td>
                                            <p>(0%,15%)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>橙色</p>
                                        </th>
                                        <td>
                                            <p>[15%,30%)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>红色</p>
                                        </th>
                                        <td>
                                            <p>[30%,50%)</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: #000000;">学分成绩</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="score" style="width:100%;height:auto;color: #000000;">
                                    <tr>
                                        <th>
                                            <p>黄色</p>
                                        </th>
                                        <td>
                                            <p>[68,70)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>橙色</p>
                                        </th>
                                        <td>
                                            <p>[65,68)</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>红色</p>
                                        </th>
                                        <td>
                                            <p>(0,65)</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #fac696;">
                            <div class="x_title">
                                <h2 style="color: #000000;">其他</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="other"
                                       style="width:100%;height:auto;word-break:break-all; word-wrap:break-all;color: #000000;">
                                    <tr>
                                        <th style="width: 40%;">
                                            <p>黄色</p>
                                        </th>
                                        <td>
                                            <p>学习态度不端正，存在旷考，旷课情况，但达不到学籍处理者</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>橙色</p>
                                        </th>
                                        <td>
                                            <p>学业上存在其他严重的问题者</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <p>红色</p>
                                        </th>
                                        <td>
                                            <p>学业上存在其他特别严重的问题者</p>
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
</body>

</html>