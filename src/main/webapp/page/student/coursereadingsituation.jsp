<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>学生——课程修读情况总览页 | </title>
</head>

<body class="nav-md">
<div class="right_col" role="main">
    <div class="row">
        <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">课程修读情况个人总览图</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li>
                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li>
                            <a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <table class="" style="width:100%">
                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>总学分</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="zongxuefen">175.5</p>
                            </td>
                            <td rowspan="4">
                                <div class="widget_summary">
                                    <div class="w_left w_25">
                                        <span>已修学分</span>
                                    </div>
                                    <div class="w_center w_55">
                                        <div class="progress">
                                            <div id="selectetprcess" class="progress-bar bg-green" role="progressbar"
                                                 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                                 style="width: 0%;">
                                                <span class="sr-only">60% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="w_right w_20">
                                        <span id="selectedcreditrate">60%</span>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="widget_summary">
                                    <div class="w_left w_25">
                                        <span>已获学分</span>
                                    </div>
                                    <div class="w_center w_55">
                                        <div class="progress">
                                            <div id="passedprcess" class="progress-bar bg-green" role="progressbar"
                                                 aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"
                                                 style="width: 0%;">
                                                <span class="sr-only">90% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="w_right w_20">
                                        <span id="passedcreditrate">90%</span>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </td>
                        </tr>

                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>已修学分</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="yixiuxuefen">105.5</p>
                            </td>
                        </tr>
                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>已获学分</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="tongguoxuefen">95.5</p>
                            </td>
                        </tr>
                    </table>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>

        <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">公共选修课程</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li>
                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li>
                            <a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <table class="" style="width:100%">
                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>总门数</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="zongmenshu">5</p>
                            </td>
                            <td rowspan="4">
                                <div class="widget_summary">
                                    <div class="w_left w_25">
                                        <span>已修门数</span>
                                    </div>
                                    <div class="w_center w_55">
                                        <div class="progress">
                                            <div id="selectetprcess1" class="progress-bar bg-green" role="progressbar"
                                                 aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
                                                 style="width: 0%;">
                                                <span class="sr-only">80% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="w_right w_20">
                                        <span id="selectednumrate">80%</span>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="widget_summary">
                                    <div class="w_left w_25">
                                        <span>通过门数</span>
                                    </div>
                                    <div class="w_center w_55">
                                        <div class="progress">
                                            <div id="passedcreditrate2" class="progress-bar bg-green" role="progressbar"
                                                 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                                 style="width: 0%;">
                                                <span class="sr-only">60% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="w_right w_20">
                                        <span id="passednumrate">60%</span>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>已修门数</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="yixiumenshu">4</p>
                            </td>
                        </tr>
                        <tr>
                            <th class="col-lg-3 col-md-3 col-sm-3 col-xs-3" style="width:20%;">
                                <p>通过门数</p>
                            </th>
                            <td class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p id="tongguomenshu">3</p>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2" style="width:20%;">
                                <p>
                                    <a href="publiccoursedetail.jsp" style="color: #1B6D85;">详情查看</a>
                                </p>
                            </td>
                        </tr>
                    </table>

                </div>
            </div>
        </div>
    </div>
    <br/>
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_390">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">外语等级考试</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li>
                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li>
                            <a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <div id="examType1" class="col-md-12 col-sm-12 col-xs-12"
                         style="margin-top: 3%;background-color: #f0fae4;">
                        <div class="x_title">
                            <h2 style="font-family: '微软雅黑';color: #000000;">总览</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <table id="spets" class="" style="width:100%">
                                <tr>
                                    <th>
                                        <p>考试名称</p>
                                    </th>
                                    <th>
                                        <p>考试成绩</p>
                                    </th>
                                    <th>
                                        <p>考试时间</p>
                                    </th>
                                </tr>


                            </table>
                        </div>
                    </div>


                </div>
            </div>
        </div>

    </div>
    <br/>
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">学期教学计划</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li>
                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li>
                            <a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="form-group">
                            <label class="control-label col-md-1 col-sm-1 col-xs-12">学年</label>
                            <div class="col-md-2 col-sm-2 col-xs-12">
                                <input type="text" id="yearname">
                            </div>
                            <label class="control-label col-md-1 col-sm-1 col-xs-12">学期</label>
                            <div class="col-md-2 col-sm-2 col-xs-12">
                                <select class="form-control" id="semester">
                                    <option selected="selected">春</option>
                                    <option>秋</option>
                                </select>
                            </div>
                            <label class="control-label col-md-2 col-sm-2 col-xs-12">课程性质</label>
                            <div class="col-md-2 col-sm-2 col-xs-12">
                                <select class="form-control" id="coursenature">
                                    <option selected="selected"></option>
                                    <option>必修</option>
                                    <option>选修</option>
                                    <option>任选</option>
                                </select>
                            </div>
                            <div class="col-md-2 col-sm-2 col-xs-2">
                                <button id="coursestudysearch" class="btn btn-success">搜索</button>
                            </div>
                            <br/>
                            <div class="col-md-5 col-sm-5 col-xs-12" style="margin-top: 3%;background-color: #f0fae4;">
                                <div class="x_title">
                                    <h2 style="color: black;" id="naturename">必修</h2>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <table class="" style="width:100%;height:200px;color: black">
                                        <tr>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="middle">总览</p>
                                            </th>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="middle">门数</p>
                                            </th>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="middle">学分</p>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th id="total" colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="center">开课</p>
                                            </th>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="TotalNum" align="middle">xx</p>
                                            </td>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="TotalCredit" align="middle">xx</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="center">已选</p>
                                            </th>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="selectedNum" align="middle">xx</p>
                                            </td>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="selectedCredit" align="middle">xx</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th id="passed" colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="center">通过</p>
                                            </th>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="passedNum" align="middle">xx</p>
                                            </td>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="passedCredit" align="middle">xx</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="center">未通过</p>
                                            </th>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="unpassNum" align="middle">xx</p>
                                            </td>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="unpassCredit" align="middle">xx</p>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p align="center">未选</p>
                                            </th>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="unselectNum" align="middle">xx</p>
                                            </td>
                                            <td colspan="2" class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                                <p id="unselectCredit" align="middle">xx</p>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>

                            <div class="col-md-5 col-md-offset-2 col-sm-5 col-sm-offset-2 col-xs-12"
                                 style="margin-top: 3%;background-color: #f0fae4;">
                                <div class="x_title">
                                    <h2 style="color: black;" id="">比例</h2>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <table class="" style="width:100%;height:200px;color: black">
                                        <tr>
                                            <td>
                                                <div class="widget_summary">
                                                    <div class="w_left w_25">
                                                        <span>已修学分</span>
                                                    </div>
                                                    <div class="w_center w_55">
                                                        <div class="progress">
                                                            <div id="selectedprogress3" class="progress-bar bg-green"
                                                                 role="progressbar" aria-valuenow="80" aria-valuemin="0"
                                                                 aria-valuemax="100" style="width: 0%;">
                                                                <span class="sr-only">80% Complete</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="w_right w_20">
                                                        <span id="yixiuxuefenrate">0%</span>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td rowspan="3">
                                                <div class="widget_summary">
                                                    <div class="w_left w_25">
                                                        <span>已获学分</span>
                                                    </div>
                                                    <div class="w_center w_55">
                                                        <div class="progress">
                                                            <div id="passedprogress3" class="progress-bar bg-green"
                                                                 role="progressbar" aria-valuenow="60" aria-valuemin="0"
                                                                 aria-valuemax="100" style="width: 0%;">
                                                                <span class="sr-only">60% Complete</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="w_right w_20">
                                                        <span id="tongguoxuefenrate">0%</span>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
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

    <br/>

    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel tile fixed_height_auto">
                <div class="x_title">
                    <h2 style="font-family: '微软雅黑';font-weight: bold;color: #000000;">模块教学计划</h2>
                    <ul class="nav navbar-right panel_toolbox">
                        <li>
                            <a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li>
                            <a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <form class="form-horizontal form-label-left">
                        <div class="form-group">
                            <label class="control-label col-md-offset-3 col-md-2 col-sm-offset-3 col-sm-2 col-xs-12">选择</label>
                            <div class="col-md-2 col-sm-2 col-xs-12">
                                <select class="form-control">
                                    <option selected="selected">通识类公选课</option>
                                    <option>英语</option>
                                    <option>体育</option>
                                    <option>计算机</option>
                                    <option>思想政治理论课</option>
                                    <option>自然科学--限选</option>
                                    <option>自然科学--必修</option>
                                    <option>学科大类基础课</option>
                                    <option>学科基础课</option>
                                    <option>专业课</option>
                                    <option>实践教学环节</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2>通识类公选课</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: black;">英语</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: black;">体育</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <br/>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: black;">计算机</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: black;">思想政治理论课</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: black ;">自然科学--限选</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <br/>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: black;">自然科学--必修</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: black;">学科大类基础课</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: black;">学科基础课</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <br/>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #FFFFCC;">
                            <div class="x_title">
                                <h2 style="color: black;">专业课</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-4 col-xs-12" style="margin-top: 3%;background-color: #f6ebbc;">
                            <div class="x_title">
                                <h2 style="color: black;">实践教学环节</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <table class="" style="width:50%;height:auto;color: black;">
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">总览</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">门数</p>
                                        </th>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">学分</p>
                                        </th>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">开课</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">已选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未通过</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="center">未选</p>
                                        </th>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
                                        </td>
                                        <td colspan="2" class="col-lg-2 col-md-2 col-sm-2 col-xs-2">
                                            <p align="middle">xx</p>
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
</body>
<script type="text/javascript" src="../js/student/coursereadingsituation.js"></script>
</html>