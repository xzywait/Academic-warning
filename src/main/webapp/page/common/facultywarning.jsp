<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>院系预警学生信息 | </title>
</head>

<body>
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">院系学业预警信息</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left" id="leftup">
                        <div class="item form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-3" for="name">院系名称
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-6">
                                <input id="facultyname" class="form-control col-md-7 col-xs-9"
                                       data-validate-length-range="6" data-validate-words="2" name="name"
                                       required="required" type="text">
                            </div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <button id="searchsend" type="submit" class="btn btn-success">搜索</button>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>预警总人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="warnrank" style="width:100%;text-align: center;">
                                    <tr>
                                        <th style="width: 40%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 60%;text-align: center;">
                                            <p>预警人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大一</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>50</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大二</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>45</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大三</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>35</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大四</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>32</p>
                                        </td>
                                    </tr>
                                </table>

                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">红色预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="redrank" style="width:100%;text-align: center;color: white;">
                                    <tr>
                                        <th style="width: 40%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 60%;text-align: center;">
                                            <p>预警人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大一</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>8</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大二</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>5</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大三</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>4</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大四</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>

                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">学分预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="creditrank" style="width:100%;text-align: center;color: white;">
                                    <tr>
                                        <th style="width: 40%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 60%;text-align: center;">
                                            <p>预警人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大一</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>20</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大二</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>15</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大三</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>12</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大四</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>12</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>成绩预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="scorerank" style="width:100%;text-align: center;">
                                    <tr>
                                        <th style="width: 40%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 60%;text-align: center;">
                                            <p>预警人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大一</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>5</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大二</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>4</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大三</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 40%;">
                                            <p>大四</p>
                                        </td>
                                        <td style="width: 60%;">
                                            <p>2</p>
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
<script type="text/javascript" src="../js/common/facultywarning.js"></script>

</body>

</html>