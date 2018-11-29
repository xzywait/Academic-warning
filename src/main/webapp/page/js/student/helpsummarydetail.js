/**
 * Created by xzy on 2017/5/17.
 */
$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/helpsummarydetail/" + $("#studentid").val(),
    data: {
        "helpsummaryid": $("#helpsummaryid").val(),
    },
    dataType: "json",
    success: function (result) {
        $("#helppeoplename").text(result.helppeoplename);
        $("#warningtypename").text(result.warningtypename);
        $("#warninglevelname").text(result.warninglevelname);
        $("#yearname").text(result.yearname);
        $("#semestername").text(result.semestername);
        $("#helpprocess").text(result.helpprocess);
        $("#helpresult").text(result.helpresult);
        $("#helpsummary").text(result.helpsummary);

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