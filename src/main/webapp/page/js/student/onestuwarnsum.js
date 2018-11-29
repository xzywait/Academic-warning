/**
 * Created by xzy on 2017/5/7.
 */
/**
 * 结果性预警
 * 所修学分
 * 平均学积分
 * 其他类预警
 * 四六级预警
 */

$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/averagescorewarn/" + $("#studentid").val(),

    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("#averagescore").append(" <tr> <td> <p>" + result[i].warningType + "</p> </td> <td> <p>" + result[i].warningLevel + "</p> </td> <td> <p>" + result[i].warningyear + "</p> </td> <td> <p>" + result[i].warningSemester + "</p> </td> <td> <p>" + formatDate(result[i].waringDate) + "</p> </td> </tr>");
        }
    }
});
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/creditwarn/" + $("#studentid").val(),

    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("#creditwarn").append(" <tr> <td> <p>" + result[i].warningType + "</p> </td> <td> <p>" + result[i].warningLevel + "</p> </td> <td> <p>" + result[i].warningyear + "</p> </td> <td> <p>" + result[i].warningSemester + "</p> </td> <td> <p>" + formatDate(result[i].waringDate) + "</p> </td> </tr>");
        }
    }
});
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/otherwarning/" + $("#studentid").val(),

    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("#otherwarn").append(" <tr> <td> <p>" + result[i].warningType + "</p> </td> <td> <p>" + result[i].warningLevel + "</p> </td> <td> <p>" + result[i].warningyear + "</p> </td> <td> <p>" + result[i].warningSemester + "</p> </td> <td> <p>" + formatDate(result[i].waringDate) + "</p> </td> </tr>");
        }
    }
});
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/spetswarning/" + $("#studentid").val(),

    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("#spetswarn").append(" <tr> <td> <p>" + result[i].warningType + "</p> </td> <td> <p>" + result[i].warningLevel + "</p> </td> <td> <p>" + result[i].warningyear + "</p> </td> <td> <p>" + result[i].warningSemester + "</p> </td> <td> <p>" + formatDate(result[i].waringDate) + "</p> </td> </tr>");
        }
    }
});


/**
 * 过程性预警模块
 * 缺勤类
 * 缺考类
 * 平时考核类
 */
$.getJSON("/processwarning", {"studentid": $("#studentid").val()}, function (data) {
    var usual = data.usual;

    for (var i in usual) {

        $("  <tr> <td> <p>" + usual[i].warncourse + "</p> </td> <td> <p>" + usual[i].warncontent + "</p> </td> <td> <p>" + usual[i].warnlevel + "</p> </td> <td> <p>" + formatDate(usual[i].warndate) + "</p> </td> </tr>")
            .appendTo("#usual");
    }
    var course = data.course;
    for (var j in course) {
        $("  <tr> <td> <p>" + course[j].course + "</p> </td> <td> <p>" + course[j].absenttimes + "</p> </td> <td> <p>" + course[j].warnlevel + "</p> </td> <td> <p>" + formatDate(course[j].date) + "</p> </td> </tr>")
            .appendTo("#course");
    }

    var exam = data.exam;
    for (var k in exam) {
        $("  <tr> <td> <p>" + exam[k].course + "</p> </td> <td> <p>" + exam[k].year + "</p> </td> <td> <p>" + exam[k].semester + "</p> </td> <td> <p>" + formatDate(exam[k].date) + "</p> </td> </tr>")
            .appendTo("#exam");
    }

});


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