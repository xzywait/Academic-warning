/**
 * Created by xzy on 2017/5/17.
 */

$("#send").click(function () {
    $.ajax({
        type: "GET",
        contentType: "application/json;charset=utf-8",
        url: "/helpsummary/add",
        data: {
            "helpid": $("#helpid").val(),
            "helpprocess": $("#helpprocess").val(),
            "helpresult": $("#helpresult").val(),
            "helpsummary": $("#helpsummary").val()
        },
        dataType: "json",
        success: function (data) {
            if (data == 1) alert("保存成功");
        }
    })
    return false;
});