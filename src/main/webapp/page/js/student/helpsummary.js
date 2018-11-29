/**
 * Created by xzy on 2017/5/17.
 */
$.ajax({
        type: "GET",
        contentType: "application/json;charset=utf-8",
        url: "/helpsummary/" + $("#studentid").val(),
        data: {},
        dataType: "json",
        success: function (result) {
            for (var i in result) {
                $("tbody").append("<tr > <td> <p>" + result[i].warningtypename + "</p> </td> <td> <p>" + result[i].warninglevelname + "</p> </td> <td> <p>" + formatDate(result[i].summarydate) + "</p> </td> <td> <p>" + result[i].yearname + "</p> </td> <td> <p>" + result[i].semestername + "</p> </td> <td> <p> <a  helpsummaryid='" + result[i].helpSummaryId + "' class=\"btn btn-info btn-xs personalinformation\" href=\"../student/helpsummarydetail.jsp\">查看</a> </p> </td> </tr>");
            }
            $(".personalinformation").click(function () {
                $("#helpsummaryid").val($(this).attr("helpsummaryid"));
                showAtRight($(this).attr("href"));
                return false;
            });
        }
    }
);

function showAtRight(url) {
    $.get(url, function (data) {
        $("#content").html(data);
    });
}

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