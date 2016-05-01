var $rows = $("tr");

$("#search").keyup(function() {
    var val = $.trim(this.value);
    if (val === "")
        $rows.show();
    else {
        $rows.hide();
        $rows.has("td:contains(" + val + ")").show();
    }
});
//à ameliorer pour qu'il marche pour les accents et Majuscules