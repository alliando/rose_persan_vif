window.onload=function()
{
    load.script("resources/js/respo_eleve.js");
};
var $rows = $("tr").has("td");
$("#eleveSearch").keyup(function() {
    var val = $.trim(this.value);
    if (val === "")
        $rows.show();

    else {
        $rows.hide();
        $rows.has("td:contains(" + val + ")").show();
    }
});
$("#eleveSearchc").keyup(function() {
    var val = $.trim(this.value);
    if (val === "")
        $rows.show();

    else {
        $rows.hide();
        $rows.has("td:contains(" + val + ")").show();
        //$(".success").show();
    }
}
);

