$(function () {
    $("#send").click(function () {
        user.name = $("#name").val();
        user.telephone = $("#telephone").val();
        user.email = $("#email").val();
    });
    $("#cancel").click(function () {
        $("#name").val("");
        $("#telephone").val("");
        $("#email").val("");
    });
});