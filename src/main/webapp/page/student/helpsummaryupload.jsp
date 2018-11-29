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

    <title>帮扶总结记录 | </title>
    <link href="../../vendors/dropzone/dist/min/dropzone.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">学业帮扶总结记录</h2>
                    <div class="title_right">
                        <div class="col-md-4 col-sm-4 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <a href="../student/helpplanning.jsp" class="btn btn-success personalinformation"><i
                                        class="fa fa-angle-double-left"></i>&nbsp;&nbsp;返回</a>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"></div>

                </div>
                <div class="x_content" style="color: black;">
                    <form class="form-horizontal form-label-left" novalidate id="myform">

                        <span class="section" style="font-family: '微软雅黑';text-align: center;">帮扶总结表</span>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">帮扶过程 <span
                                    class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <textarea name="helpprocess" id="helpprocess" title="帮扶过程" required="required"
                                          name="textarea" class="form-control col-md-7 col-xs-12" rows="6"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">帮扶结果<span
                                    class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <textarea title="帮扶结果" id="helpresult" required="required" name="helpresult"
                                          class="form-control col-md-7 col-xs-12" rows="2"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">帮扶总结<span
                                    class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <textarea title="帮扶总结" id="helpsummary" required="required" name="helpsummary"
                                          class="form-control col-md-7 col-xs-12" rows="6"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="textarea">上传
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="file" class="form-control col-md-7 col-xs-12" name=""
                                       style="height: auto;">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="hidden" name="Time"
                                       value='<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime())%> '>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-3">
                                <button id="send" type="button" class="btn btn-success" onclick="success()">确认</button>
                                <button type="button" class="btn btn-dark">取消</button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>

        </div>

    </div>
</div>

<!-- /page content -->
<!-- jquery.inputmask -->
<script src="../../vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>

<script src="../../vendors/dropzone/dist/min/dropzone.min.js"></script>
<script src="../js/student/helpsummaryupload.js"></script>
<script type="text/javascript">
    function success() {
        var myform = document.getElementById("myform"); //获得form表单对象
        for (var i = 0; i < 2; i++) { //循环form表单
            if (myform.elements[i].value == "") { //判断每一个元素是否为空
                alert(myform.elements[i].title + "不能为空！");
                myform.elements[i].focus(); //元素获得焦点
                return;
            }
        }


    };
</script>

</body>
<script type="text/javascript" src="../js/student/helpsummaryupload.js"></script>
</html>