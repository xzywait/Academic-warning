$.getJSON("url", function (teacher) {
    $("#teaindeximg").attr("src", teacher.img);
    $(":header:eq(3)").text(teacher.teachername);
    $("#leftmid>li:eq(0)").text(teacher.dname);
    $("#leftmid>li:eq(1)").text(teacher.mname);
    $("#leftmid>li>a").text(teacher.teatelephone);
});

$.getJSON("url", function (grade) {
    $("#leftdown>li:eq(0) div div").attr("data-transitiongoal", grade.allwarnum);
    $("#leftdown>li:eq(1) div div").attr("data-transitiongoal", grade.hascounsel);
    $("#leftdown>li:eq(2) div div").attr("data-transitiongoal", grade.notcounsel);
});

$.getJSON("url", function (gradewarning) {
    $("#gradewarnallnum tr td p").text(gradewarning.allwarnum);

    $("#gradewarnlevelnum tr:eq(0) td p").text(gradewarning.yellownum);
    $("#gradewarnlevelnum tr:eq(1) td p").text(gradewarning.orangenum);
    $("#gradewarnlevelnum tr:eq(2) td p").text(gradewarning.rednum);

    $("#gradewarntypenum tr:eq(0) td p").text(gradewarning.scorenum);
    $("#gradewarntypenum tr:eq(1) td p").text(gradewarning.gradenum);
    $("#gradewarntypenum tr:eq(2) td p").text(gradewarning.othernum);

    $("#gradehelpresult tr:eq(0) td p").text(gradewarning.successnum);
    $("#gradehelpresult tr:eq(1) td p").text(gradewarning.failnum);
    $("#gradehelpresult tr:eq(2) td p").text(gradewarning.ongoingnum);

});

$.getJSON("url", function (helpplan) {
    $("#checkplaninfor tr:eq(0) td p").text(helpplan.allnum);
    $("#checkplaninfor tr:eq(1) td:eq(0) p").text(helpplan.haschecknum);
    $("#checkplaninfor tr:eq(1) td:eq(1) p").text(helpplan.notchecknum);
    $("#checkplaninfor tr:eq(2) td:eq(0) p").text(helpplan.passnum);
    $("#checkplaninfor tr:eq(2) td:eq(1) p").text(helpplan.failnum);
});

$.getJSON("url", function (gradehelping) {
    $("#gradehelpallnum tr td:eq(0) p").text(gradehelping.allhelpnum);
    $("#gradehelpallnum tr td:eq(1) p").text(gradehelping.allhaschecknum);
    $("#gradehelpallnum tr td:eq(2) p").text(gradehelping.allnotchecknum);

    $("#gradepsychologicalnum tr:eq(0) td p").text(gradehelping.psychohelpnum);
    $("#gradepsychologicalnum tr:eq(1) td p").text(gradehelping.psychohaschecknum);
    $("#gradepsychologicalnum tr:eq(2) td p").text(gradehelping.psychonotchecknum);

    $("#gradeprofessionalnum tr:eq(0) td p").text(gradehelping.profeshelpnum);
    $("#gradeprofessionalnum tr:eq(1) td p").text(gradehelping.profeshaschecknum);
    $("#gradeprofessionalnum tr:eq(2) td p").text(gradehelping.profesnotchecknum);

    $("#gradetelephonenum tr:eq(0) td p").text(gradehelping.telphelpnum);
    $("#gradetelephonenum tr:eq(1) td p").text(gradehelping.telphaschecknum);
    $("#gradetelephonenum tr:eq(2) td p").text(gradehelping.telpnotchecknum);

    $("#gradeothernum tr:eq(0) td p").text(gradehelping.othhelpnum);
    $("#gradeothernum tr:eq(1) td p").text(gradehelping.othhaschecknum);
    $("#gradeothernum tr:eq(2) td p").text(gradehelping.othnotchecknum);

});
