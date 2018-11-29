<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>年级预警学生帮扶信息 | </title>
</head>

<body>
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">年级预警学生帮扶信息</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left" id="leftup">
                        <div class="item form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-3" for="name">年级
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-6">
                                <select id="gyear" class="form-control col-md-7 col-xs-12" style="font-family: '微软雅黑';">
                                    <option value="1" selected="selected">大一</option>
                                    <option value="2">大二</option>
                                    <option value="3">大三</option>
                                    <option value="4">大四</option>
                                </select>
                            </div>
                            <div class="col-md-3 col-sm-3 col-xs-3">
                                <button id="searchsend" type="submit" class="btn btn-success">搜索</button>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>帮扶效果总排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="helprank" style="width:100%;text-align: center;">
                                    <tr>
                                        <th style="width: 25%;text-align: center;">
                                            <p>专业名称</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶成功人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶失败人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶中人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>计算机</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>30</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>25</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>5</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>软件</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>35</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>32</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>电商</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>23</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>20</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>信管</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>13</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>10</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                </table>

                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">红色预警学生帮扶效果排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="redrank" style="width:100%;text-align: center;color: white;">
                                    <tr>
                                        <th style="width: 25%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶成功人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶失败人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶中人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>计算机</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>10</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>6</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>4</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>软件</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>15</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>12</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>电商</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>13</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>10</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>信管</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>6</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>

                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">学分预警学生帮扶效果排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="creditrank" style="width:100%;text-align: center;color: white;">
                                    <tr>
                                        <th style="width: 25%;text-align: center;">
                                            <p>年级名称</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶成功人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶失败人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶中人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>计算机</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>12</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>8</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>4</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>软件</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>13</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>10</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>电商</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>10</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>7</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>信管</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>6</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>成绩预警学生帮扶效果排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" id="scorerank" style="width:100%;text-align: center;">
                                    <tr>
                                        <th style="width: 25%;text-align: center;">
                                            <p>专业名称</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶成功人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶失败人数</p>
                                        </th>
                                        <th style="width: 25%;text-align: center;">
                                            <p>帮扶中人数</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>计算机</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>3</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>1</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>2</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>软件</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>2</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>1</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>1</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>电商</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>0</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>0</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>0</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="width: 25%;">
                                            <p>信管</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>1</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>1</p>
                                        </td>
                                        <td style="width: 25%;">
                                            <p>0</p>
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
<script type="text/javascript" src="../js/common/gradehelp.js"></script>

</body>

</html>