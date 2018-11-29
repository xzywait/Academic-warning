//$("#warnrank").append("<tr><td style=\"width: 40%;\"><p>大一</p></td><td style=\"width: 60%;\"><p>50</p></td></tr>");

$(function () {
    $("#searchsend").click(function () {
        //alert($("#leftup #classname").val());
        stu.facultyname = $("#leftup #facultyname").val();
    });
});

$.getJSON("url", function (gradesallwarning) {
    $.each(gradesallwarning, function (i, warning) {
        $("#warnrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradesredwarning) {
    $.each(gradesredwarning, function (i, warning) {
        $("#redrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradescreditwarning) {
    $.each(gradescreditwarning, function (i, warning) {
        $("#creditrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (gradesscorewarning) {
    $.each(gradesscorewarning, function (i, warning) {
        $("#scorerank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});