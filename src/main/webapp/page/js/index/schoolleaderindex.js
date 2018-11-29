$.getJSON("url", function (schoolwarning) {
    $("#schoolwarnallnum tr td p").text(schoolwarning.allwarnum);

    $("#schoolwarnlevelnum tr:eq(0) td p").text(schoolwarning.yellownum);
    $("#schoolwarnlevelnum tr:eq(1) td p").text(schoolwarning.orangenum);
    $("#schoolwarnlevelnum tr:eq(2) td p").text(schoolwarning.rednum);

    $("#schoolwarntypenum tr:eq(0) td p").text(schoolwarning.scorenum);
    $("#schoolwarntypenum tr:eq(1) td p").text(schoolwarning.gradenum);
    $("#schoolwarntypenum tr:eq(2) td p").text(schoolwarning.othernum);
});

$.getJSON("url", function (facultywarning) {

    $("#facultywarnmax tr:eq(0) td p").text(facultywarning.firstonedname);
    $("#facultywarnmax tr:eq(1) td p").text(facultywarning.firsttwodname);
    $("#facultywarnmax tr:eq(2) td p").text(facultywarning.firsttwodname);

    $("#facultywarnmin tr:eq(0) td p").text(facultywarning.lastonedname);
    $("#facultywarnmin tr:eq(1) td p").text(facultywarning.lasttwodname);
    $("#facultywarnmin tr:eq(2) td p").text(facultywarning.lasttwodname);

});

$.getJSON("url", function (schoolhelping) {
    $("#schoolhelpallnum tr td p").text(schoolhelping.allhelpum);

    $("#schoolhelpresultnum tr:eq(0) td p").text(schoolhelping.successnum);
    $("#schoolhelpresultnum tr:eq(1) td p").text(schoolhelping.failnum);
    $("#schoolhelpresultnum tr:eq(2) td p").text(schoolhelping.ongoingnum);

});