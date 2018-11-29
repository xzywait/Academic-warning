//	$("#leftdown>li:eq(0) div div").attr("data-transitiongoal","15");
//	alert($("#leftdown>li:eq(0) div div").attr("data-transitiongoal"));

$.getJSON("/teacher/" + $("#teacherid").val(), function (data) {
    /**
     * 个人基本信息
     */

    $(":header:eq(3)").append(data.teacher.teachername);

    $("#leftmid>li:eq(0)").append(data.btDepartment.departmentname);
    $("#leftmid>li:eq(1)").append(data.teacher.email);
    $("#leftmid>li:eq(2)").append(data.teacher.telephone);

    /**
     * 班级信息
     */
    $.each(data.btclass, function (i, classi) {
        $("#teacherchooseclass").append("<option classid='" + classi.id + "'>" + classi.classname + "</option>");
    });
});


$.getJSON("url", function (classes) {
    $("#leftdown>li:eq(0) div div").attr("data-transitiongoal", classes.allwarnum);
    $("#leftdown>li:eq(1) div div").attr("data-transitiongoal", classes.hascounsel);
    $("#leftdown>li:eq(2) div div").attr("data-transitiongoal", classes.notcounsel);
});
$.getJSON("url", function (classeswarning) {
    $("#warnallnum tr td p").text(classeswarning.allwarnum);

    $("#warnlevelnum tr:eq(0) td p").text(classeswarning.yellownum);
    $("#warnlevelnum tr:eq(1) td p").text(classeswarning.orangenum);
    $("#warnlevelnum tr:eq(2) td p").text(classeswarning.rednum);

    $("#warntypenum tr:eq(0) td p").text(classeswarning.scorenum);
    $("#warntypenum tr:eq(1) td p").text(classeswarning.gradenum);
    $("#warntypenum tr:eq(2) td p").text(classeswarning.othernum);

    $("#classwarnmax tr:eq(1) td:eq(0) p").text(classeswarning.firstonestunumber);
    $("#classwarnmax tr:eq(1) td:eq(1) p").text(classeswarning.firstonestuname);
    $("#classwarnmax tr:eq(2) td:eq(0) p").text(classeswarning.firsttwostunumber);
    $("#classwarnmax tr:eq(2) td:eq(1) p").text(classeswarning.firsttwostuname);
    $("#classwarnmax tr:eq(3) td:eq(0) p").text(classeswarning.firstthreestunumber);
    $("#classwarnmax tr:eq(3) td:eq(1) p").text(classeswarning.firsttwostuname);

    $("#classwarnmin tr:eq(1) td:eq(0) p").text(classeswarning.lastonestunumber);
    $("#classwarnmin tr:eq(1) td:eq(1) p").text(classeswarning.lastonestuname);
    $("#classwarnmin tr:eq(2) td:eq(0) p").text(classeswarning.lasttwostunumber);
    $("#classwarnmin tr:eq(2) td:eq(1) p").text(classeswarning.lasttwostuname);
    $("#classwarnmin tr:eq(3) td:eq(0) p").text(classeswarning.lastthreestunumber);
    $("#classwarnmin tr:eq(3) td:eq(1) p").text(classeswarning.lasttwostuname);

});

$.getJSON("url", function (teacherhelping) {
    $("#helpallnum tr td:eq(0) p").text(teacherhelping.allhelpnum);
    $("#helpallnum tr td:eq(1) p").text(teacherhelping.allhaschecknum);
    $("#helpallnum tr td:eq(2) p").text(teacherhelping.allnotchecknum);

    $("#psychologicalnum tr:eq(0) td p").text(teacherhelping.psychohelpnum);
    $("#psychologicalnum tr:eq(1) td p").text(teacherhelping.psychohaschecknum);
    $("#psychologicalnum tr:eq(2) td p").text(teacherhelping.psychonotchecknum);

    $("#professionalnum tr:eq(0) td p").text(teacherhelping.profeshelpnum);
    $("#professionalnum tr:eq(1) td p").text(teacherhelping.profeshaschecknum);
    $("#professionalnum tr:eq(2) td p").text(teacherhelping.profesnotchecknum);

    $("#telephonenum tr:eq(0) td p").text(teacherhelping.telphelpnum);
    $("#telephonenum tr:eq(1) td p").text(teacherhelping.telphaschecknum);
    $("#telephonenum tr:eq(2) td p").text(teacherhelping.telpnotchecknum);

    $("#othernum tr:eq(0) td p").text(teacherhelping.othhelpnum);
    $("#othernum tr:eq(1) td p").text(teacherhelping.othhaschecknum);
    $("#othernum tr:eq(2) td p").text(teacherhelping.othnotchecknum);

});
	

