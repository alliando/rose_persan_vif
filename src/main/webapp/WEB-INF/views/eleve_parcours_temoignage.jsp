<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/css/temoignage.css" rel="stylesheet">
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Témoignage</title>
        <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/2-col-portfolio.css" rel="stylesheet">
    <link href="resources/css/main.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<a id="deco" href="deconnexion.php"><input type="button" value="Déconnexion"></a>
 <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Speakisep</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">Ma fiche</a>
                    </li>
                    <li>
                        <a href="#">Parcours</a>
                    </li>
                    <li>
                        <a href="#">International</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
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
<span class="box">
	<select name="tsearch">
	    <option value="Parcours">Parcours</option>
	    <option value="Génie Logiciel">Génie Logiciel</option>
	    <option value="Systèmes Embarqués">Systèmes Embarqués</option>
	    <option value="Business Intelligence">Business Intelligence</option>
	    <option value="Numerique et Santé">Numerique et Santé</option>
	</select>
	<a id="DepotTemoignage" href="DepotTemoignage.jsp"><input type="button" value="Déposer un Témoignage"></a>
</span>

<div id="Block" class="temoignage" style="display:none">
<div id="bigblock"><h3 id="parcours">Génie Logiciel</h3> <h3 id="etpromo">Tintin Haddock, promo 2017</h3>
</div>
<p id="info">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
</div>

<div id="Block" class="temoignage" style="display:none">
<div id="bigblock"><h3 id="parcours">Systèmes Embarqués</h3> <h3 id="etpromo">Johny John, promo 2015</h3>
</div>
<p id="info">Nihil est enim virtute amabilius, nihil quod magis adliciat ad diligendum, quippe cum propter virtutem et probitatem etiam eos, quos numquam vidimus, quodam modo diligamus. Quis est qui C. Fabrici, M'. Curi non cum caritate aliqua benevola memoriam usurpet, quos numquam viderit? quis autem est, qui Tarquinium Superbum, qui Sp. Cassium, Sp. Maelium non oderit? Cum duobus ducibus de imperio in Italia est decertatum, Pyrrho et Hannibale; ab altero propter probitatem eius non nimis alienos animos habemus, alterum propter crudelitatem semper haec civitas oderit.</p>
</div>

<div id="Block" class="temoignage" style="display:none">
<div id="bigblock"><h3 id="parcours">Génie Logiciel</h3> <h3 id="etpromo">Franky Vincent, promo 2017</h3>
</div>
<p id="info">Iamque lituis cladium concrepantibus internarum non celate ut antea turbidum saeviebat ingenium a veri consideratione detortum et nullo inpositorum vel conpositorum fidem sollemniter inquirente nec discernente a societate noxiorum insontes velut exturbatum e iudiciis fas omne discessit, et causarum legitima silente defensione carnifex rapinarum sequester et obductio capitum et bonorum ubique multatio versabatur per orientales provincias, quas recensere puto nunc oportunum absque Mesopotamia digesta, cum bella Parthica dicerentur, et Aegypto, quam necessario aliud reieci ad tempus.</p>
</div>

      	 <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Speakisep 2016</p>
                </div>
            </div>
            <!-- /.row -->
        </footer> 
    </div>      
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>
    <!-- JavaScript -->
    <script src="resources/js/temoignage.js"></script>
</body>
</html>