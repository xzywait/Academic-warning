$.getJSON("url", function (helpplan) {
    $("#checkplaninfor tr:eq(0) td p").text(helpplan.allnum);
    $("#checkplaninfor tr:eq(1) td:eq(0) p").text(helpplan.haschecknum);
    $("#checkplaninfor tr:eq(1) td:eq(1) p").text(helpplan.notchecknum);
    $("#checkplaninfor tr:eq(2) td:eq(0) p").text(helpplan.passnum);
    $("#checkplaninfor tr:eq(2) td:eq(1) p").text(helpplan.failnum);
});

$.getJSON("url", function (helpwork) {
    $("#checkworkinfor tr:eq(0) td p").text(helpwork.allnum);
    $("#checkworkinfor tr:eq(1) td p").text(helpwork.haschecknum);
    $("#checkworkinfor tr:eq(2) td p").text(helpwork.notchecknum);
});