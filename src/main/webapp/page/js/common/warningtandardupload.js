$(function () {
    $("#send").click(function () {
        user.fileurl = $("#fileurl").val();
    });
    $("#cancel").click(function () {
        $("#fileurl").val("");
    });
});