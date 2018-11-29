$(function () {
    $("#searchsend").click(function () {
        //alert($("#leftup #classname").val());
        stu.gradename = $("#leftup #gyear").val();
    });
});

$.getJSON("url", function (majorallhelping) {
    $.each(majorallhelping, function (i, helping) {
        $("#helprank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorredhelping) {
    $.each(majorredhelping, function (i, helping) {
        $("#redrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorcredithelping) {
    $.each(majorcredithelping, function (i, helping) {
        $("#creditrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorscorehelping) {
    $.each(majorscorehelping, function (i, helping) {
        $("#scorerank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

