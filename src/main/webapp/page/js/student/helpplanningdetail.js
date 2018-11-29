/**
 * Created by xzy on 2017/5/17.
 */
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/helpdetail/" + $("#studentid").val(),
    data: {
        "helpid": $("#helpid").val(),
    },
    dataType: "json",
    success: function (result) {
        $("#helppeoplename").text(result.helppeoplename);
        $("#warningtypename").text(result.warningtypename);
        $("#warninglevelname").text(result.warninglevelname);
        $("#helpplan").text(result.helpplan);
        $("#helpmeasure").text(result.measures);
        $("#helpyear").text(result.yearname);
        $("#helpsemester").text(result.semestername);
        $("#helpplace").text(result.helpplace);
        $("#helpresult").text(result.helpresult);
    }

});

function showAtRight(url) {
    $.get(url, function (data) {
        $("#content").html(data);
    });
}

$(".personalinformation").click(function () {
    $("#helpid").val($(this).attr("helpid"));
    showAtRight($(this).attr("href"));
    return false;
});