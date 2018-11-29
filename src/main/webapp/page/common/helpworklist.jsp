<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>帮扶记录列表</title>
    <!-- Bootstrap -->
    <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="../../build/css/custom.min.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="../../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">帮扶总览</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div id="leftup" class="col-md-12 col-sm-12 col-xs-12"
                             style="margin-top: 3%;background-color: #FAFAFA;">
                            <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                                <label class="control-label col-md-2 col-sm-2 col-xs-2">帮扶形式
                                </label>
                                <div class="col-md-3 col-sm-3 col-xs-3">
                                    <select id="htype" class="form-control col-md-7 col-xs-12"
                                            style="font-family: '微软雅黑';">
                                        <option value="0" selected="selected">不限</option>
                                        <option value="1">心理疏导</option>
                                        <option value="2">专业指导</option>
                                        <option value="3">电话约谈</option>
                                        <option value="4">面谈</option>
                                    </select>
                                </div>
                                <label class="control-label col-md-2 col-sm-2 col-xs-2">帮扶时间
                                </label>
                                <div class="col-md-3 col-sm-3 col-xs-3">
                                    <input id="htime" type="text" class="form-control col-md-7 col-xs-12"
                                           data-inputmask="'mask': '99/99/9999'" name="htime" required="required">
                                </div>
                                <div class="col-md-2">
                                    <button id="searchsend" type="submit" class="btn btn-success">确认</button>
                                </div>
                            </div>
                            <table id="datatable-fixed-header" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>
                                        <p>被帮扶人姓名</p>
                                    </th>
                                    <th>
                                        <p>预警类型</p>
                                    </th>
                                    <th>
                                        <p>预警等级</p>
                                    </th>
                                    <th>
                                        <p>帮扶形式</p>
                                    </th>
                                    <th>
                                        <p>帮扶时间</p>
                                    </th>
                                    <th>
                                        <p>详情查看</p>
                                    </th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <p>秦海</p>
                                    </td>
                                    <td>
                                        <p>学分预警</p>
                                    </td>
                                    <td>
                                        <p>红色</p>
                                    </td>
                                    <td>
                                        <p>专业指导</p>
                                    </td>
                                    <td>
                                        <p>2016-10-12</p>
                                    </td>
                                    <td>
                                        <p>
                                            <a class="personalinformation" href="../common/helpworkdetail.jsp">链接</a>
                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <p>孙志</p>
                                    </td>
                                    <td>
                                        <p>其他预警</p>
                                    </td>
                                    <td>
                                        <p>黄色</p>
                                    </td>
                                    <td>
                                        <p>电话约谈</p>
                                    </td>
                                    <td>
                                        <p>2015-12-24</p>
                                    </td>
                                    <td>
                                        <p>
                                            <a class="personalinformation" href="../common/helpworkdetail.jsp">链接</a>
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

<script type="text/javascript" src="../js/common/helpworklist.js"></script>
</body>

</html>