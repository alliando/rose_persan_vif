window.onload=function()
{
    load.script("resources/js/respo_eleve.js");
};
var $rows = $("tbody");
$("#eleveSearch").keyup(function() {
    var val = $.trim(this.value);
    console.log(val);
    console.log($rows);
    if (val === "")
        $rows.show();
        
    else {
        $rows.hide();
        $rows.has("td:contains(" + val + ")").show();
    }
});


//à ameliorer pour qu'il marche pour les accents et Majuscules