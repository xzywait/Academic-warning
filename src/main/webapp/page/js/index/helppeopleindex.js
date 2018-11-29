$.getJSON("url", function (people) {
    $("#peoindeximg").attr("src", people.img);
    $(":header:eq(3)").text(people.peoname);
    $("#leftmid>li:eq(0)").text(people.dname);
    $("#leftmid>li:eq(1)").text(people.mname);
    $("#leftmid>li>a").text(people.teatelephone);
});

$.getJSON("url", function (stus) {
    $("#leftdown>li:eq(0) div div").attr("data-transitiongoal", stus.hascounsel);
    $("#leftdown>li:eq(1) div div").attr("data-transitiongoal", stus.notcounsel);
});

$.getJSON("url", function (stuswarning) {
    $("#stuswarnallnum tr td p").text(stuswarning.allwarnum);

    $("#stuswarnlevelnum tr:eq(0) td p").text(stuswarning.yellownum);
    $("#stuswarnlevelnum tr:eq(1) td p").text(stuswarning.orangenum);
    $("#stuswarnlevelnum tr:eq(2) td p").text(stuswarning.rednum);

    $("#stuswarntypenum tr:eq(0) td p").text(stuswarning.scorenum);
    $("#stuswarntypenum tr:eq(1) td p").text(stuswarning.stusnum);
    $("#stuswarntypenum tr:eq(2) td p").text(stuswarning.othernum);

    $("#stushelpresult tr:eq(0) td p").text(stuswarning.successnum);
    $("#stushelpresult tr:eq(1) td p").text(stuswarning.failnum);
    $("#stushelpresult tr:eq(2) td p").text(stuswarning.ongoingnum);

});

$.getJSON("url", function (helpplan) {
    $("#checkplaninfor tr:eq(0) td p").text(helpplan.allnum);
    $("#checkplaninfor tr:eq(1) td:eq(0) p").text(helpplan.haschecknum);
    $("#checkplaninfor tr:eq(1) td:eq(1) p").text(helpplan.notchecknum);
    $("#checkplaninfor tr:eq(2) td:eq(0) p").text(helpplan.passnum);
    $("#checkplaninfor tr:eq(2) td:eq(1) p").text(helpplan.failnum);
});

$.getJSON("url", function (stushelping) {
    $("#stushelpallnum tr td:eq(0) p").text(stushelping.allhelpnum);
    $("#stushelpallnum tr td:eq(1) p").text(stushelping.allhaschecknum);
    $("#stushelpallnum tr td:eq(2) p").text(stushelping.allnotchecknum);

    $("#stuspsychologicalnum tr:eq(0) td p").text(stushelping.psychohelpnum);
    $("#stuspsychologicalnum tr:eq(1) td p").text(stushelping.psychohaschecknum);
    $("#stuspsychologicalnum tr:eq(2) td p").text(stushelping.psychonotchecknum);

    $("#stusprofessionalnum tr:eq(0) td p").text(stushelping.profeshelpnum);
    $("#stusprofessionalnum tr:eq(1) td p").text(stushelping.profeshaschecknum);
    $("#stusprofessionalnum tr:eq(2) td p").text(stushelping.profesnotchecknum);

    $("#stustelephonenum tr:eq(0) td p").text(stushelping.telphelpnum);
    $("#stustelephonenum tr:eq(1) td p").text(stushelping.telphaschecknum);
    $("#stustelephonenum tr:eq(2) td p").text(stushelping.telpnotchecknum);

    $("#stusothernum tr:eq(0) td p").text(stushelping.othhelpnum);
    $("#stusothernum tr:eq(1) td p").text(stushelping.othhaschecknum);
    $("#stusothernum tr:eq(2) td p").text(stushelping.othnotchecknum);

});
