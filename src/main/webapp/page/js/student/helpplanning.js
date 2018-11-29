/**
 * Created by xzy on 2017/5/15.
 */
function showAtRight(url) {
    $.get(url, function (data) {
        $("#content").html(data);
    });
}

$.ajax({
    type: "GET",
    contentType: "application/json;charset=utf-8",
    url: "/help/" + $("#studentid").val(),
    data: {},
    dataType: "json",
    success: function (result) {
        for (var i in result) {
            $("tbody").append("<tr> <td> <p>" + result[i].helppeoplename + "</p> </td> <td> <p>" + result[i].warningtypename + "</p> </td> <td> <p>" + result[i].warninglevelname + "</p> </td> <td> <p>" + result[i].helpplan + "</p> </td> <td> <p>" + result[i].helpresult + "</p> </td> <td> <p> <a helpid='" + result[i].helpid + "' class=\"btn btn-info btn-xs personalinformation\" href=\"../student/helpplanningdetail.jsp\">查看</a> </p> </td><td> <p> <a helpid='" + result[i].helpid + "' class=\"btn btn-success btn-xs personalinformation\" href=\"../student/helpsummaryupload.jsp\">新增</a> </p> </td> </tr>");
        }
        $(".personalinformation").click(function () {
            $("#helpid").val($(this).attr("helpid"));
            showAtRight($(this).attr("href"));
            return false;
        });
    }
});

