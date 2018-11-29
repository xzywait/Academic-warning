$.getJSON("url", function (helpstandard) {

    $("#facultyname").append("<h2 >" + helpstandard.facultyname + "院本科生学业帮扶工作实施办法</h2>");
    $("#standardtable tr:eq(0) td p").text(helpstandard.process);
    $("#standardtable tr:eq(1) td p").text(helpstandard.checkstandard);
    $("#standardtable tr:eq(2) td p").text(helpstandard.urladdress);
    $("#standardtable tr:eq(3) td p").text(helpstandard.updatetime);

});