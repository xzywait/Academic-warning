$(function () {
    $("#send").click(function () {
        //alert($("#leftup #classname").val());
        help.year = $("#upsearch #year").val();
        help.major = $("#upsearch #major").val();
    });
});

$.getJSON("url", function (majorwarning) {
    $.each(majorwarning, function (i, warning) {
        $("#majorlist tbody").append("<tr><td>2</td><td><a>大二</a></td><td><a>信管</a></td><td><ul class=\"list-inline\"><li><img src='../images/user.png' class=\"avatar\" alt=\"Avatar\"></li><li><img src='../images/user.png' class=\"avatar\" alt=\"Avatar\"></li><li><img src='../images/user.png' class=\"avatar\" alt=\"Avatar\"></li><li><img src='../images/user.png' class=\"avatar\" alt=\"Avatar\"></li></ul></td><td><button type=\"button\" class=\"btn btn-success btn-xs\">查看</button></td></tr>");
    });
});