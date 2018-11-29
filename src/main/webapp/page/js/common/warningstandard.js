/**
 * Created by xzy on 2017/5/6.
 */
$.getJSON("/warningstandard", {"remark": "上学期"}, function (data) {
    $("#lastterm").append("	<tr> <th> <p>黄色</p> </th> <td> <p>(" + data["黄色"].lowstandard + "%," + data["黄色"].highstandard + "%)</p> </td> </tr> <tr> <th> <p>橙色</p> </th> <td> <p>[" + data["橙色"].lowstandard + "%," + data["橙色"].highstandard + "%)</p> </td> </tr> <tr> <th> <p>红色</p> </th> <td> <p>[" + data["红色"].lowstandard + "%," + data["红色"].highstandard + "%)</p> </td> </tr>");
});
$.getJSON("/warningstandard", {"remark": "累计"}, function (data) {
    $("#allcredit").append("	<tr> <th> <p>黄色</p> </th> <td> <p>(" + data["黄色"].lowstandard + "%," + data["黄色"].highstandard + "%)</p> </td> </tr> <tr> <th> <p>橙色</p> </th> <td> <p>[" + data["橙色"].lowstandard + "%," + data["橙色"].highstandard + "%)</p> </td> </tr> <tr> <th> <p>红色</p> </th> <td> <p>[" + data["红色"].lowstandard + "%," + data["红色"].highstandard + "%)</p> </td> </tr>")
});
$.getJSON("/warningstandard", {"remark": "总学分"}, function (data) {
    $("#creditgrade").append("<tr> <th> <p>黄色</p> </th> <td> <p>[" + data["黄色"].lowstandard + "," + data["黄色"].highstandard + ")</p> </td> </tr> <tr> <th> <p>橙色</p> </th> <td> <p>[" + data["橙色"].lowstandard + "," + data["橙色"].highstandard + ")</p> </td> </tr> <tr> <th> <p>红色</p> </th> <td> <p>(" + data["红色"].lowstandard + "," + data["红色"].highstandard + ")</p> </td> </tr>");
});