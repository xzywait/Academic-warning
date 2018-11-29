/**
 * Created by xzy on 2017/5/31.
 */
/**
 * 用户管理模块
 * 新增
 */
$("#newUserconfirm").click(function () {
    $.ajax({
        type: "GET",
        contentType: "application/json;charset=utf-8",
        url: "/user/add",
        data: {
            "username": $("#newUsername").val(),
            "password": $("#newUserPassword").val(),
            "roleid": $("#newUserRole :selected").val()
        },
        dataType: "json",
        success: function (result) {
            if (result == 1) {
                alert("添加成功！！");
            } else {
                alert("操作失败！！");
            }
        }
    });
});
