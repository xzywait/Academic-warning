$.getJSON("url", function (schoolallhelping) {
    $.each(schoolallhelping, function (i, helping) {
        $("#helprank").append("<tr><td style=\"width: 25%;\"><p>" + helping.facultyname + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolredhelping) {
    $.each(schoolredhelping, function (i, helping) {
        $("#redrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.facultyname + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolcredithelping) {
    $.each(schoolcredithelping, function (i, helping) {
        $("#creditrank").append("<tr><td style=\"width: 25%;\"><p>" + helping.facultyname + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolscorehelping) {
    $.each(schoolscorehelping, function (i, helping) {
        $("#scorerank").append("<tr><td style=\"width: 25%;\"><p>" + helping.facultyname + "</p></td><td style=\"width: 25%;\"><p>" + helping.successnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.failnum + "</p></td><td style=\"width: 25%;\"><p>" + helping.ongoingnum + "</p></td></tr>");
    });
});
