<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>

<head>
<link href="resources/css/temoignage.css" rel="stylesheet">
    <title>Témoignage</title>
</head>
<body>
        <!-- Page Content -->
    <div class="container">
            <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Témoignages
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->
<div class="row">
		<span class="form-group">
			<select class="col-sm-4 col-md-4" name="tsearch">
			    <option value="Parcours">Parcours</option>
			    <option value="Génie Logiciel">Génie Logiciel</option>
			    <option value="Systèmes Embarqués">Systèmes Embarqués</option>
			    <option value="Business Intelligence">Business Intelligence</option>
			    <option value="Numerique et Santé">Numerique et Santé</option>
			</select>
			<a href="#" id="DepotTemoignage" class="pull-right btn btn-primary btn-lg active" role="button" href="DepotTemoignage.jsp">Déposer un Témoignage</a>	
		</span>

		<div id="Block"  class="temoignage col-sm-12 col-md-12" style="display:none">
		<div id="bigblock"><h3 id="parcours">Génie Logiciel</h3> <h3 id="etpromo">Tintin Haddock, promo 2017</h3>
		</div>
		<p id="info">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
		</div>
		
		<div id="Block"  class="temoignage col-sm-12 col-md-12" style="display:none">
		<div id="bigblock"><h3 id="parcours">Systèmes Embarqués</h3> <h3 id="etpromo">Johny John, promo 2015</h3>
		</div>
		<p id="info">Nihil est enim virtute amabilius, nihil quod magis adliciat ad diligendum, quippe cum propter virtutem et probitatem etiam eos, quos numquam vidimus, quodam modo diligamus. Quis est qui C. Fabrici, M'. Curi non cum caritate aliqua benevola memoriam usurpet, quos numquam viderit? quis autem est, qui Tarquinium Superbum, qui Sp. Cassium, Sp. Maelium non oderit? Cum duobus ducibus de imperio in Italia est decertatum, Pyrrho et Hannibale; ab altero propter probitatem eius non nimis alienos animos habemus, alterum propter crudelitatem semper haec civitas oderit.</p>
		</div>
		
		<div id="Block" class="temoignage col-sm-12 col-md-12" style="display:none">
		<div id="bigblock"><h3 id="parcours">Génie Logiciel</h3> <h3 id="etpromo">Franky Vincent, promo 2017</h3>
		</div>
		<p id="info">Iamque lituis cladium concrepantibus internarum non celate ut antea turbidum saeviebat ingenium a veri consideratione detortum et nullo inpositorum vel conpositorum fidem sollemniter inquirente nec discernente a societate noxiorum insontes velut exturbatum e iudiciis fas omne discessit, et causarum legitima silente defensione carnifex rapinarum sequester et obductio capitum et bonorum ubique multatio versabatur per orientales provincias, quas recensere puto nunc oportunum absque Mesopotamia digesta, cum bella Parthica dicerentur, et Aegypto, quam necessario aliud reieci ad tempus.</p>
		</div>

 </div>
    </div>
    <!-- /.container -->

        <script src="resources/js/temoignage.js"></script>

</body>