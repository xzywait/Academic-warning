<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>班级预警信息列表 | </title>
</head>

<body>
<div id="content">
    <!-- page content -->
    <div class="right_col" role="main">
        <div class="">
            <div class="page-title">
                <div class="title_left">
                    <h3>班级预警学生目录</h3>
                </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
                <div class="col-md-12">
                    <div class="x_panel">
                        <div class="x_content">
                            <form id="leftup" class="form-horizontal form-label-left" novalidate>
                                <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                                    <label class="control-label col-md-2 col-sm-2 col-xs-2">班级
                                    </label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <select class="form-control col-md-7 col-xs-9">
                                            <c:forEach var="clazz" items="${sessionScope.btclass}">
                                                <option value="${clazz.id}">${clazz.classname}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <label class="control-label col-md-2 col-sm-2 col-xs-2" for="name">姓名
                                    </label>
                                    <div class="col-md-3 col-sm-3 col-xs-3">
                                        <input id="stuname" class="form-control col-md-7 col-xs-9"
                                               data-validate-length-range="6" data-validate-words="2" name="name"
                                               required="required" type="text">
                                    </div>
                                    <div class="col-md-2">
                                        <button id="searchsend" type="button" class="btn btn-success">确认</button>
                                    </div>
                                </div>
                                <div class="row" id="classeslist">
                                    <div class="col-md-12 col-sm-12 col-xs-12 text-center">
                                        <ul class="pagination pagination-split">
                                            <li>
                                                <a href="#">A</a>
                                            </li>
                                            <li>
                                                <a href="#">B</a>
                                            </li>
                                            <li>
                                                <a href="#">C</a>
                                            </li>
                                            <li>
                                                <a href="#">D</a>
                                            </li>
                                            <li>
                                                <a href="#">E</a>
                                            </li>
                                            <li>...</li>
                                            <li>
                                                <a href="#">W</a>
                                            </li>
                                            <li>
                                                <a href="#">X</a>
                                            </li>
                                            <li>
                                                <a href="#">Y</a>
                                            </li>
                                            <li>
                                                <a href="#">Z</a>
                                            </li>
                                        </ul>
                                    </div>

                                    <div class="clearfix"></div>


                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /page content -->
</div>

<script type="text/javascript" src="../js/common/classwarning.js"></script>

</body>

</html>