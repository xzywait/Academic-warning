//$("#leftup table tbody").append("<tr><td><p>xx</p></td><td><p>xx</p></td><td><p>xx</p></td><td><p>xx</p></td><td><p>xx</p></td><td><p><a id='personalinformation' href='../common/helpworkupload.jsp'>链接</a></p></td></tr>");

$(function () {
    $("#searchsend").click(function () {
        //alert($("#leftup #classname").val());
        help.typename = $("#leftup #htype").val();
        help.time = $("#leftup #htime").val();
    });
});

$.getJSON("url", function (stuwarning) {
    $.each(stuwarning, function (i, warning) {
        $("#leftup table tbody").append("<tr><td><p>" + warning.stuname + "</p></td><td><p>" + warning.type + "</p></td><td><p>" + warning.level + "</p></td><td><p>" + warning.counselform + "</p></td><td><p>" + warning.time + "</p></td><td><p><a id='personalinformation' href='../common/helpworkupload.jsp'>链接</a></p></td></tr>");
    });
});