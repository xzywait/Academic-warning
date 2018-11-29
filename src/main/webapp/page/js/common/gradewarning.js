$(function () {
    $("#searchsend").click(function () {
        //alert($("#leftup #classname").val());
        stu.gradename = $("#leftup #gyear").val();
    });
});

$.getJSON("url", function (majorallwarning) {
    $.each(majorallwarning, function (i, warning) {
        $("#warnrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorredwarning) {
    $.each(majorredwarning, function (i, warning) {
        $("#redrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorcreditwarning) {
    $.each(majorcreditwarning, function (i, warning) {
        $("#creditrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (majorscorewarning) {
    $.each(majorscorewarning, function (i, warning) {
        $("#scorerank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});