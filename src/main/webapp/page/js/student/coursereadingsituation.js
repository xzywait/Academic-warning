/**
 * Created by xzy on 2017/5/7.
 */
/**
 * 课程修读情况模块
 * 包含进度条生成
 */
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/courseStudy",
    data: {
        "studentid": $("#studentid").val(),
        "yearname": "",
        "semestername": "",
        "coursenaturename": ""
    },
    dataType: "json",
    success: function (result) {
        $("#zongxuefen").text(result[0].courseTotalCredit);
        $("#zongmenshu").text(result[0].courseTotalNum);
        $("#yixiuxuefen").text(result[1].courseTotalCredit);
        $("#yixiumenshu").text(result[1].courseTotalNum);
        $("#tongguoxuefen").text(result[2].courseTotalCredit);
        $("#tongguomenshu").text(result[2].courseTotalNum);

        var selectedcreditrate = ($("#yixiuxuefen").text() / $("#zongxuefen").text()).toFixed(3) * 100;


        var passedcreditrate = ($("#tongguoxuefen").text() / $("#zongxuefen").text()).toFixed(3) * 100;


        $("#selectetprcess").attr("style", "width:" + selectedcreditrate + "%;");
        $("#passedprcess").attr("style", "width:" + passedcreditrate + "%;");
        $("#selectedcreditrate").text(selectedcreditrate + "%");
        $("#passedcreditrate").text(passedcreditrate + "%");

        var selectednumrate = ($("#yixiumenshu").text() / $("#zongmenshu").text()).toFixed(3) * 100;
        var passednumrate = ($("#tongguomenshu").text() / $("#zongmenshu").text()).toFixed(3) * 100;

        $("#selectednumrate").text(selectedcreditrate + "%");
        $("#passednumrate").text(passednumrate + "%");
        $("#selectetprcess1").attr("style", "width:" + selectednumrate + "%;");
        $("#passedcreditrate2").attr("style", "width:" + passednumrate + "%;");

    }
});
/**
 * 外语考试模块
 * 四六级
 * 专四专八
 */
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/spets",
    data: {"studentid": $("#studentid").val()},
    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("#spets").append("	<tr> <td>" + result[i].spetsname + "</td> <td>" + result[i].spetscore + "</td> <td>" + formatDate(result[i].spetstime) + "</td> </tr>");
        }
    }
});
/**
 * 学期教学计划模块
 * 查询条件：
 * 学年学期课程性质
 */
$("#coursestudysearch").click(function () {
    $.ajax({
        type: "GET",
        contentType: "application/json;charset=utf-8",
        url: "/courseStudy",
        data: {
            "studentid": $("#studentid").val(),
            "yearname": $("#yearname").val(),
            "semestername": $("#semester :selected").val(),
            "coursenaturename": $("#coursenature :selected").val()
        },
        dataType: "json",
        success: function (result) {
            $("#naturename").text($("#coursenature :selected").val());
            $("#TotalNum").text(result[0].courseTotalNum);
            $("#TotalCredit").text(result[0].courseTotalCredit);
            $("#selectedNum").text(result[1].courseTotalNum);
            $("#selectedCredit").text(result[1].courseTotalCredit);
            $("#passedNum").text(result[2].courseTotalNum);
            $("#passedCredit").text(result[2].courseTotalCredit);
            $("#unpassNum").text($("#selectedNum").text() * 1 - $("#passedNum").text() * 1);
            $("#unpassCredit").text($("#selectedCredit").text() * 1 - $("#passedCredit").text() * 1);
            $("#unselectNum").text($("#TotalNum").text() * 1 - $("#selectedNum").text() * 1);
            $("#unselectCredit").text($("#TotalCredit").text() * 1 - $("#selectedCredit").text() * 1);

            var selectedcreditrate = ($("#selectedCredit").text() / $("#TotalCredit").text()).toFixed(3) * 100;
            var passedcreditrate = ($("#passedCredit").text() / $("#TotalCredit").text()).toFixed(3) * 100;

            $("#selectedprogress3").attr("style", "width:" + selectedcreditrate + "%;");
            $("#passedprogress3").attr("style", "width:" + passedcreditrate + "%;");
            $("#yixiuxuefenrate").text(selectedcreditrate + "%");
            $("#tongguoxuefenrate").text(passedcreditrate + "%");


        }
    });
    return false;
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