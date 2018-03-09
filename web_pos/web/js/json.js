/* global url, modelo */
$.ajax({
    type: 'POST',
    contentType: 'application/json;',
    url: url,
    dataType: "json",
    data: modelo,
    success: function (data, textStatus, jqXHR) {
        console.log(jqXHR);
        $('#table').bootstrapTable({
            data: jqXHR.responseJSON
        });
        $('#table').on('dbl-click-row.bs.table', function (event, row, $element) {
            alert(JSON.stringify(row));
        });
    },
    error: function (jqXHR, textStatus, errorThrown) {
        alert('error: ' + textStatus);
    }

});