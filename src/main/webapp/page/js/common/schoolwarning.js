$.getJSON("url", function (schoolallwarning) {
    $.each(schoolallwarning, function (i, warning) {
        $("#warnrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolredwarning) {
    $.each(schoolredwarning, function (i, warning) {
        $("#redrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolcreditwarning) {
    $.each(schoolcreditwarning, function (i, warning) {
        $("#creditrank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});

$.getJSON("url", function (schoolscorewarning) {
    $.each(schoolscorewarning, function (i, warning) {
        $("#scorerank").append("<tr><td style=\"width: 40%;\"><p>" + warning.gradename + "</p></td><td style=\"width: 60%;\"><p>" + warning.gradenum + "</p></td></tr>");
    });
});