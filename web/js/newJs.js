/**
 * Created with Intellij IDEA.
 * Project name: cashTestConverter.
 * User: Partizanin.
 * Date: 29.03.2015.
 * Time:  15:04.
 * To change this template use File|Setting|Editor|File and Code Templates.
 */


$(window).load(function() {
    callToServer("onLoad").then(function (responseData) {
        $('body').html(responseData.text);
    });

});


function callToServer(request) {
    var myData = {"operationCall": request};
    var defer = $.Deferred();
    $.ajax({
        type: "GET",
        url: "/Servlet",
        data: {jsonData: JSON.stringify(myData)},
        contentType:"application/json; charset=utf-8",
        dataType: "json",

        //if received a response from the server
        success: function (jsonData) {

        },

        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus, errorThrown);
        },

        complete: function () {
        }

    }).done(function (data) {
        defer.resolve(data);
    }).fail(function (xhr, status, errorThrown) {
        alert("Sorry, there was a problem!");
        console.log("Error: " + errorThrown);
        console.log("Status: " + status);
        console.dir(xhr);
    });

    return defer.promise();
}


