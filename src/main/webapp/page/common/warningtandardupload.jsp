<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>预警标准制定 | </title>
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
                    <form class="form-horizontal form-label-left" style="text-align: center;">
                        <div class="col-md-12 col-sm-12 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <span class="section"
                                  style="font-family: '微软雅黑';text-align: center;">西北农林科技大学本科生学业预警工作实施办法</span>
                            <br/>
                            <div class="form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <input id="fileurl" type="file" class="form-control col-md-7 col-xs-12" name=""
                                           style="height: auto;">
                                </div>
                            </div>
                            <div class="item form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <input type="hidden" name="Time"
                                           value='<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime())%> '>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-6 col-md-offset-3">
                                    <button id="send" type="submit" class="btn btn-success">确认</button>
                                    <button id="cancel" type="submit" class="btn btn-dark">取消</button>
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
<script type="text/javascript" src="../js/common/warningtandardupload.js"></script>
</body>

</html>