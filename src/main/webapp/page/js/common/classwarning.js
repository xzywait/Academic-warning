$(function () {
    $("#searchsend").click(function () {

        $.getJSON("/teacher/getWarningStudent", {
            "classid": $("#leftup select :selected").val(),
            "studentname": $("#leftup #stuname").val()
        }, function (classeswarning) {
            $(".profile_details").remove();
            $.each(classeswarning, function (i, warning) {
                $("#classeslist").append("<div class=\"col-md-4 col-sm-4 col-xs-12 profile_details\"> <div class=\"well profile_view\"> <div class=\"col-sm-12\"> <h4 class=\"brief\"><i>" + $("#leftup select :selected").text() + "</i></h4> <div class=\"left col-xs-7\"> <h2>" + warning.studentname + "</h2> <p><strong>学号: </strong> " + warning.studentnumber + " </p> <p><strong>性别: </strong> " + warning.sex + " </p> <ul class=\"list-unstyled\"> <li><i class=\"fa fa-building\"></i> Address:&nbsp;&nbsp;" + warning.email + " </li><li><i class=\"fa fa-phone\"></i> Phone #: &nbsp;&nbsp;" + warning.telephone + " </li> </ul> </div> <div class=\"right col-xs-5 text-center\"> <img src=\"http://q.qlogo.cn/headimg_dl?dst_uin=" + warning.qq + "&spec=640&img_type=jpg\" width='120' height='120' class=\"img-circle img-responsive\"/>	</div>	</div> <div class=\"col-xs-12 bottom text-center\"> <div class=\"col-xs-12 col-sm-6 emphasis\"> </div> <div class=\"col-xs-12 col-sm-6 emphasis\"> <a class=\"btn btn-success\" href=\"../common/student.jsp\"><i class=\"fa fa-user\"> </i>查看主页</a> </div> </div> </div> </div>");
            });
        });
    });
});

$.getJSON("/teacher/getWarningStudent", {"classid": $("#leftup select :selected").val()}, function (classeswarning) {
    $.each(classeswarning, function (i, warning) {
        $("#classeslist").html("<div class=\"col-md-4 col-sm-4 col-xs-12 profile_details\"> <div class=\"well profile_view\"> <div class=\"col-sm-12\"> <h4 class=\"brief\"><i>" + $("#leftup select :selected").val() + "</i></h4> <div class=\"left col-xs-7\"> <h2>" + warning.studentname + "</h2> <p><strong>学号: </strong>" + warning.studentnumber + "</p> <p><strong>性别: </strong> " + warning.sex + "  </p> <ul class=\"list-unstyled\"> <li><i class=\"fa fa-building\"></i> Address:&nbsp;&nbsp;" + warning.email + " </li><li><i class=\"fa fa-phone\"></i> Phone #: &nbsp;&nbsp;" + warning.telephone + " </li> </ul> </div> <div class=\"right col-xs-5 text-center\"> <img src=\"http://q.qlogo.cn/headimg_dl?dst_uin=" + warning.qq + "&spec=640&img_type=jpg\" width='120'  height='120' class=\"img-circle img-responsive\"/>	</div>	</div> <div class=\"col-xs-12 bottom text-center\"> <div class=\"col-xs-12 col-sm-6 emphasis\"> </div> <div class=\"col-xs-12 col-sm-6 emphasis\"> <a class=\"btn btn-success\" href=\"../common/student.jsp\"><i class=\"fa fa-user\"> </i>查看主页</a> </div> </div> </div> </div>");
    });
});
