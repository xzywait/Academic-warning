/**
 * 用户基本信息模块
 */

renderUser("/student/" + $("#studentid").val());
/**
 * 课程修读情况模块
 */
$.getJSON("/courseStudy/", {"coursenaturename": "必修", "studentid": $("#studentid").val()}, function (course) {
    $("#leftdown>li:eq(0) div div").attr("style", "width:" + 100 * (course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) + "%;");
    $("#spanone").text((course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) * 100 + "%");
});
$.getJSON("/courseStudy/", {"coursenaturename": "选修", "studentid": $("#studentid").val()}, function (course) {
    $("#leftdown>li:eq(1) div div").attr("style", "width:" + 100 * (course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) + "%;");

    $("#spantwo").text((100 * course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) + "%");
});
$.getJSON("/courseStudy/", {"coursenaturename": "任选", "studentid": $("#studentid").val()}, function (course) {
    $("#leftdown>li:eq(2) div div").attr("style", "width:" + 100 * (course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) + "%;");
    $("#spanthree").text((course[2].courseTotalCredit / course[0].courseTotalCredit).toFixed(3) * 100 + "%");
});
/**
 * 预警信息全览模块
 */
$.getJSON("/warningtimes/" + $("#studentid").val(), function (result) {
    $("#lastterm tr:eq(0) td p").text(result[0]);
    $("#lastterm tr:eq(1) td p").text(result[1]);

    $("#totalterm tr:eq(0) td p").text(result[2]);
    $("#totalterm tr:eq(1) td p").text(result[3]);

});
/**
 * 三种基本预警信息模块
 */
$.getJSON("/warninglevel/" + $("#studentid").val(), {"warninglevelid": 1}, function (dataone) {
    $.each(dataone, function (i, result) {
        $("#rightone").append("<li><div class=\"message_date\"><h3 class=\"date text-info\" >" + formatDate(result.waringDate, "dd") + "</h3><p class=\"month\">" + formatDate(result.waringDate, "MM") + "</p></div><div class=\"message_wrapper\"><h4 class=\"heading\">" + result.warningType + "</h4><blockquote class=\"message\">" + "预警学年：" + result.warningyear + "预警学期：" + result.warningSemester + "</blockquote><br /></div></li>");
    });
});


$.getJSON("/warninglevel/" + $("#studentid").val(), {"warninglevelid": 2}, function (datatwo) {
    $.each(datatwo, function (i, result) {
        $("#righttwo").append("<li><div class=\"message_date\"><h3 class=\"date text-info\" >" + formatDate(result.waringDate, "dd") + "</h3><p class=\"month\">" + formatDate(result.waringDate, "MM") + "</p></div><div class=\"message_wrapper\"><h4 class=\"heading\">" + result.warningType + "</h4><blockquote class=\"message\">" + "预警学年：" + result.warningyear + "预警学期：" + result.warningSemester + "</blockquote><br /></div></li>");
    });
});

$.getJSON("/warninglevel/" + $("#studentid").val(), {"warninglevelid": 3}, function (datathree) {
    $.each(datathree, function (i, result) {
        $("#rightthree").append("<li><div class=\"message_date\"><h3 class=\"date text-info\" >" + formatDate(result.waringDate, "dd") + "</h3><p class=\"month\">" + formatDate(result.waringDate, "MM") + "</p></div><div class=\"message_wrapper\"><h4 class=\"heading\">" + result.warningType + "</h4><blockquote class=\"message\">" + "预警学年：" + result.warningyear + "预警学期：" + result.warningSemester + "</blockquote><br /></div></li>");
    });
});

function renderUser(url) {
    var $userqq = $("#userqq").val();
    if ($userqq != "") {
        $("#stuindeximg").attr("src", "http://q.qlogo.cn/headimg_dl?dst_uin=" + $userqq + "&spec=640&img_type=jpg");
    }
    $.getJSON(url, function (stu) {

        $("#leftstuname").append("<span style=\"color:#eb9316;font-size: larger \" >" + stu.student.studentname + "</span>");
        // $(":header:eq(3)").text(stu.stuname);
        $("#leftmid>li:eq(0)").append("<span style=\"color: rgba(133, 15, 92, 0.81)\">" + stu.btDepartment.departmentname + "</span>");
        $("#leftmid>li:eq(1)").append("<span style=\"color:rgba(133, 15, 92, 0.81)\">" + stu.btclass.classname + "</span>");
        $("#leftmid>li:eq(2)").append("<span style=\"color:rgba(133, 15, 92, 0.81)\">" + stu.student.telephone + "</span>");
    });
}

/**
 * 将日期格式化成指定格式的字符串
 * @param date 要格式化的日期，不传时默认当前时间，也可以是一个时间戳
 * @param fmt 目标字符串格式，支持的字符有：y,M,d,q,w,H,h,m,S，默认：yyyy-MM-dd HH:mm:ss
 * @returns 返回格式化后的日期字符串
 */
function formatDate(date, fmt) {
    date = date == undefined ? new Date() : date;
    date = typeof date == 'number' ? new Date(date) : date;
    fmt = fmt || 'yyyy-MM-dd ';//在此设置默认格式默认
    var obj =
        {
            'y': date.getFullYear(), // 年份，注意必须用getFullYear
            'M': date.getMonth() + 1, // 月份，注意是从0-11
            'd': date.getDate(), // 日期
            'q': Math.floor((date.getMonth() + 3) / 3), // 季度
            'w': date.getDay(), // 星期，注意是0-6
            'H': date.getHours(), // 24小时制
            'h': date.getHours() % 12 == 0 ? 12 : date.getHours() % 12, // 12小时制
            'm': date.getMinutes(), // 分钟
            's': date.getSeconds(), // 秒
            'S': date.getMilliseconds() // 毫秒
        };
    var week = ['天', '一', '二', '三', '四', '五', '六'];
    for (var i in obj) {
        fmt = fmt.replace(new RegExp(i + '+', 'g'), function (m) {
            var val = obj[i] + '';
            if (i == 'w') return (m.length > 2 ? '星期' : '周') + week[val];
            for (var j = 0, len = val.length; j < m.length - len; j++) val = '0' + val;
            return m.length == 1 ? val : val.substring(val.length - m.length);
        });
    }
    return fmt;
}