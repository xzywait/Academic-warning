$.getJSON("url", function (facultywarning) {
    $("#facultywarnallnum tr td p").text(facultywarning.allwarnum);

    $("#facultywarnlevelnum tr:eq(0) td p").text(facultywarning.yellownum);
    $("#facultywarnlevelnum tr:eq(1) td p").text(facultywarning.orangenum);
    $("#facultywarnlevelnum tr:eq(2) td p").text(facultywarning.rednum);

    $("#facultywarntypenum tr:eq(0) td p").text(facultywarning.scorenum);
    $("#facultywarntypenum tr:eq(1) td p").text(facultywarning.gradenum);
    $("#facultywarntypenum tr:eq(2) td p").text(facultywarning.othernum);

});

$.getJSON("url", function (gradewarning) {

    $("#gradewarnmax tr:eq(0) td p").text(gradewarning.firstonedname);
    $("#gradewarnmax tr:eq(1) td p").text(gradewarning.firsttwodname);
    $("#gradewarnmax tr:eq(2) td p").text(gradewarning.firsttwodname);


});

$.getJSON("url", function (majorwarning) {

    $("#majorwarnmax tr:eq(0) td p").text(majorwarning.firstonedname);
    $("#majorwarnmax tr:eq(1) td p").text(majorwarning.firsttwodname);
    $("#majorwarnmax tr:eq(2) td p").text(majorwarning.firsttwodname);

});

$.getJSON("url", function (facultyhelping) {
    $("#facultyhelpallnum tr td p").text(facultyhelping.allhelpum);

    $("#facultyhelpresultnum tr:eq(0) td p").text(facultyhelping.successnum);
    $("#facultyhelpresultnum tr:eq(1) td p").text(facultyhelping.failnum);
    $("#facultyhelpresultnum tr:eq(2) td p").text(facultyhelping.ongoingnum);

});