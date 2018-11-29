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

    <title>帮扶标准制定 | </title>
</head>

<body class="nav-md">
<!-- page content -->
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">学业帮扶标准</h2>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="col-md-12 col-sm-12 col-xs-12" style="margin-top: 3%;background-color: #FAFAFA;">
                            <span class="section"
                                  style="font-family: '微软雅黑';text-align: center;">信息学院本科生学业帮扶工作实施办法</span>

                            <div class="item form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">帮扶措施、流程
                                </label>
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <textarea id="textarea" required="required" name="textarea"
                                              class="form-control col-md-7 col-xs-12" rows="6"></textarea>
                                </div>
                            </div>
                            <div class="item form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">帮扶审核标准
                                </label>
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <textarea id="textarea" required="required" name="textarea"
                                              class="form-control col-md-7 col-xs-12" rows="6"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">附件上传
                                </label>
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <input type="file" class="form-control col-md-7 col-xs-12" name=""
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
                                    <button type="submit" class="btn btn-dark">取消</button>
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
</body>

</html>