//alert($("#helpworkuploadform div:eq(0) div input").val());

$(function () {
    $("#send").click(function () {
        help.teachername = $("#helpworkuploadform div:eq(0) div input").val();
        help.studentname = $("#helpworkuploadform div:eq(1) div input").val();
        help.type = $("#helpworkuploadform div:eq(2) #type").val();
        help.level = $("#helpworkuploadform div:eq(3) #level").val();
        help.year = $("#helpworkuploadform div:eq(4) #year").val();
        help.term = $("#helpworkuploadform div:eq(5) #term").val();
        help.time = $("#helpworkuploadform div:eq(6) div input").val();
        help.place = $("#helpworkuploadform div:eq(7) div input").val();
        help.analyse = $("#helpworkuploadform div:eq(8) div input").val();
        help.plan = $("#helpworkuploadform div:eq(9) div textarea").val();
        help.form = $("#helpworkuploadform div:eq(10) div input").val();
        help.measures = $("#helpworkuploadform div:eq(11) div textarea").val();
        help.stageresult = $("#helpworkuploadform div:eq(12) div textarea").val();
        help.effect = $("#helpworkuploadform div:eq(13) div textarea").val();
        help.counselresult = $("#helpworkuploadform div:eq(14) div input").val();
        help.fileurl = $("#helpworkuploadform div:eq(15) div input").val();
        help.hiddentime = $("#helpworkuploadform div:eq(16) div input").val();
    });

    $("#cancel").click(function () {
        $("#helpworkuploadform div:eq(0) div input").val("");
        $("#helpworkuploadform div:eq(1) div input").val("");
        $("#helpworkuploadform div:eq(2) #type").val("");
        $("#helpworkuploadform div:eq(3) #level").val("");
        $("#helpworkuploadform div:eq(4) #year").val("");
        $("#helpworkuploadform div:eq(5) #term").val("");
        $("#helpworkuploadform div:eq(6) div input").val("");
        $("#helpworkuploadform div:eq(7) div input").val("");
        $("#helpworkuploadform div:eq(8) div input").val("");
        $("#helpworkuploadform div:eq(9) div textarea").val("");
        $("#helpworkuploadform div:eq(10) div input").val("");
        $("#helpworkuploadform div:eq(11) div textarea").val("");
        $("#helpworkuploadform div:eq(12) div textarea").val("");
        $("#helpworkuploadform div:eq(13) div textarea").val("");
        $("#helpworkuploadform div:eq(14) div input").val("");
        $("#helpworkuploadform div:eq(15) div input").val("");
        $("#helpworkuploadform div:eq(16) div input").val("");
    });
});