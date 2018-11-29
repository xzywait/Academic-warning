$(function () {
    $("#searchsend").click(function () {
        //alert($("#leftup #classname").val());
        stu.facultyname = $("#leftup #facultyname").val();
    });
});

$.getJSON("url", function (gradesallhelping) {
    $.each(gradesallhelping, function (i, helping) {
        $("#helprank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradesredhelping) {
    $.each(gradesredhelping, function (i, helping) {
        $("#redrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradescredithelping) {
    $.each(gradescredithelping, function (i, helping) {
        $("#creditrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradesscorehelping) {
    $.each(gradesscorehelping, function (i, helping) {
        $("#scorerank").append("<tr><td style=\"width: 25%;\"><p>" + helping.gradename + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

