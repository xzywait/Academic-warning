<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>帮扶审核 | </title>
    <!-- Datatables -->
    <link href="../../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">帮扶审核</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="col-md-12 col-sm-12 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <table id="datatable-fixed-header" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>
                                        <p>帮扶人姓名</p>
                                    </th>
                                    <th>
                                        <p>预警类型</p>
                                    </th>
                                    <th>
                                        <p>预警等级</p>
                                    </th>
                                    <th>
                                        <p>帮扶计划</p>
                                    </th>
                                    <th>
                                        <p>帮扶预期结果</p>
                                    </th>
                                    <th>
                                        <p>是否审核</p>
                                    </th>
                                    <th>
                                        <p>详情查看</p>
                                    </th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <p>张晓晓</p>
                                    </td>
                                    <td>
                                        <p>成绩预警</p>
                                    </td>
                                    <td>
                                        <p>红色</p>
                                    </td>
                                    <td>
                                        <p>专业指导</p>
                                    </td>
                                    <td>
                                        <p>成绩提高一定程度</p>
                                    </td>
                                    <td>
                                        <p>否</p>
                                    </td>
                                    <td>
                                        <p>
                                            <a href="helpcheckdetail.jsp">链接</a>
                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p>张晓晓</p>
                                    </td>
                                    <td>
                                        <p>其他预警</p>
                                    </td>
                                    <td>
                                        <p>橙色</p>
                                    </td>
                                    <td>
                                        <p>专业指导</p>
                                    </td>
                                    <td>
                                        <p>脱离预警范围</p>
                                    </td>
                                    <td>
                                        <p>是</p>
                                    </td>
                                    <td>
                                        <p>
                                            <a href="helpcheckdetail.jsp">链接</a>
                                        </p>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->
<script src="../../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="../../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="../../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>

</body>

</html>