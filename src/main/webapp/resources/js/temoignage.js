var $rows = $("div");
$('div.temoignage').show();
$('select[name="tsearch"]').change(function(){
    
    // Je créer l'id du div qui va être affiché
    var id = $(this).val();
    // Je cache toutes les divs grâce à une classe qui va sélectionner le tout
    $('div.temoignage').hide();
    // j'affiche tout les divs si c'est ALL
    if (id == 'Parcours')
    	$('div.temoignage').show();
    else
    // Et j'affiche seulement les Div que je souhaite
    	
      $rows.has("h3:contains(" + id + ")").show();
});