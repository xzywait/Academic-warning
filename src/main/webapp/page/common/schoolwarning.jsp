<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>全校预警学生信息 | </title>
</head>

<body>
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">全校学业预警信息</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>预警总人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div>
                                    <table class="" style="width:100%;">
                                        <tr>
                                            <th style="width: 40%;text-align: center;">
                                                <p>学院名称</p>
                                            </th>
                                            <th style="width: 60%;text-align: center;">
                                                <p>预警人数</p>
                                            </th>
                                        </tr>
                                    </table>
                                </div>
                                <div style="width: 100%;height: 120px;overflow-y: scroll;">
                                    <table class="" id="warnrank" style="width:100%;text-align: center;">
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>经管学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>50</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>水建学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>45</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>机电学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>35</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>农学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>32</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>林学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>31</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>食品学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>30</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>资环学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>29</p>
                                            </td>
                                        </tr>
                                    </table>
                                </div>

                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">红色预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div>
                                    <table class="" style="width:100%;color: white;">
                                        <tr>
                                            <th style="width: 40%;text-align: center;">
                                                <p>学院名称</p>
                                            </th>
                                            <th style="width: 60%;text-align: center;">
                                                <p>预警人数</p>
                                            </th>
                                        </tr>
                                    </table>
                                </div>
                                <div style="width: 100%;height: 120px;overflow-y: scroll;">
                                    <table class="" id="redrank" style="width:100%;text-align: center;color: white;">
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>经管学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>10</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>水建学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>8</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>机电学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>5</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>农学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>4</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>林学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>3</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>食品学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>2</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>资环学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>1</p>
                                            </td>
                                        </tr>
                                    </table>
                                </div>

                            </div>

                        </div>
                        <br/>
                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #1ABB9C;">
                            <div class="x_title">
                                <h2 style="color: white;">学分预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div>
                                    <table class="" style="width:100%;color: white;">
                                        <tr>
                                            <th style="width: 40%;text-align: center;">
                                                <p>学院名称</p>
                                            </th>
                                            <th style="width: 60%;text-align: center;">
                                                <p>预警人数</p>
                                            </th>
                                        </tr>
                                    </table>
                                </div>
                                <div style="width: 100%;height: 120px;overflow-y: scroll;">
                                    <table class="" id="creditrank" style="width:100%;color: white;">
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>经管学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>13</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>水建学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>9</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>机电学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>7</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>农学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>5</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>林学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>4</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>食品学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>3</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;text-align: center;">
                                                <p>资环学院</p>
                                            </td>
                                            <td style="width: 60%;text-align: center;">
                                                <p>2</p>
                                            </td>
                                        </tr>
                                    </table>
                                </div>

                            </div>
                        </div>

                        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="x_title">
                                <h2>成绩预警人数排名</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div>
                                    <table class="" style="width:100%;">
                                        <tr>
                                            <th style="width: 40%;text-align: center;">
                                                <p>学院名称</p>
                                            </th>
                                            <th style="width: 60%;text-align: center;">
                                                <p>预警人数</p>
                                            </th>
                                        </tr>
                                    </table>
                                </div>
                                <div style="width: 100%;height: 120px;overflow-y: scroll;">
                                    <table class="" id="scorerank" style="width:100%;text-align: center;">
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>经管学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>13</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>水建学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>8</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>机电学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>7</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>农学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>6</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>林学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>5</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>食品学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>3</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 40%;">
                                                <p>资环学院</p>
                                            </td>
                                            <td style="width: 60%;">
                                                <p>2</p>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>

    </div>
</div>
<!-- /page content -->
<script type="text/javascript" src="../js/common/schoolwarning.js"></script>
</body>

</html>