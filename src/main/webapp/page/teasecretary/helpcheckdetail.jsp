<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>帮扶审核详细页 | </title>
    <!-- iCheck -->
    <link href="../../vendors/iCheck/skins/flat/green.css" rel="stylesheet">
</head>

<body class="nav-md">
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">帮扶计划总览</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="col-md-12 col-sm-12 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <table class="" style="width:100%">
                                <tr>
                                    <th>
                                        <p>帮扶人姓名</p>
                                    </th>
                                    <td>
                                        <p>张晓晓</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>帮扶计划</p>
                                    </th>
                                    <td>
                                        <p>专业指导</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>帮扶具体措施</p>
                                    </th>
                                    <td>
                                        <p>每周三定期辅导课程</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>帮扶时间</p>
                                    </th>
                                    <td>
                                        <p>2015-09-13</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>帮扶地点</p>
                                    </th>
                                    <td>
                                        <p>8号楼</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>已审核</p>
                                    </th>
                                    <td>
                                        是：
                                        <input type="radio" class="flat" name="check" id="T" value="T" checked=""
                                               required/> 否：
                                        <input type="radio" class="flat" name="check" id="F" value="F"/>

                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <p>是否合格</p>
                                    </th>
                                    <td>
                                        是：
                                        <input type="radio" class="flat" name="checks" id="T" value="T" checked=""
                                               required/> 否：
                                        <input type="radio" class="flat" name="checks" id="F" value="F"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center;">
                                        <button id="send" type="submit" class="btn btn-success">确认</button>
                                        <button type="submit" class="btn btn-dark">取消</button>

                                    </td>
                                </tr>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- /page content -->
<script src="../../vendors/iCheck/icheck.min.js"></script>
</body>

</html>