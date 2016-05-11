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
    //Si nul montre tout
        if (val === "")
            $rows.show();

       
        //Si c'est le premier mot match
           
        else if((val).indexOf(" ")==-1){
            vall=val;
            $rows.hide();
            $rows.has("td:contains(" + vall + ")").show();
        }
            //Si c'est le 2ème mots
        else if((val).indexOf(" ")!=-1) {
            val=$.trim(val.substring(val.indexOf(" "),val.length));
            console.log($("tr:contains(bonsoir)").length);
            $rows.hide();
            var john=$("tr:contains(John)");
            console.log($("tr:contains("+vall+")").has("td:contains("+val+")"));
            $("tr:contains("+vall+")").has("td:contains("+val+")").show();
            console.log("cc :"+john.has("DoeDoe").length);
            console.log($rows.has("td:contains("+vall+")"&&"td:contains("+val+")"));
            console.log(val);
            console.log(vall);
            $rows.hide($rows);
            //$rows.has("td:contains("+vall+")"||"td:contains("+val+")").show();
            //$rows.has("td:contains(" + val + ")").show();
        }
if ((val).indexOf(" ")!=-1){
}

}
);

