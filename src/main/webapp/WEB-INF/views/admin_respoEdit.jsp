<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin Responsables</title>

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

    <!-- Navigation -->
    <!-- <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            Brand and toggle get grouped for better mobile display
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="admin_accueil.jsp">Speakisep Admin</a>
            </div>
            Collect the nav links, forms, and other content for toggling
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
	                <li>
	                    <a href="#">About</a>
	                </li>
	                <li>
	                    <a href="#">Services</a>
	                </li>
	                <li>
	                    <a href="#">Contact</a>
	                </li>
                    <li>
                        <a href="#">Parcours</a>
                    </li>
                    <li>
                        <a href="admin_universities.jsp">Universit�s</a>
                    </li>
                    <li>
                        <a href="#">El�ves</a>
                    </li>
                </ul>
            </div>
            /.navbar-collapse
        </div>
        /.container
    </nav> -->
    <jsp:include page="\jspf/header.jspf"/>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Editer un responsable
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

		<!-- Projects Row -->
        <div class="row">
        	<form>
	            <div class="col-sm-4 col-md-4">
	            	<div class="form-group">
		    			<label for="inputUniversity">Nom du responsable: </label>
		    			<input type="text" class="form-control" id="inputRespo" placeholder="Responsable">
		  			</div>
		  			<div class="form-group">
		    			<label for="inputUnivWeb">Parcours pris en charge: </label>
		    			<input type="text" class="form-control" id="inputParcours" placeholder="Parcours">
		  			</div>
		  			<button type="submit" class="btn btn-default btn-lg btn-block active">Sauvegarder le responsable</button>
	            </div>
            </form>
        </div>
        <!-- /.row -->   
        
        <hr>

        <!-- Footer -->
      	 <footer>
            <!-- <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Speakisep 2016</p>
                </div>
            </div> -->
            <jsp:include page="\jspf/footer.jspf"/>
            <!-- /.row -->
        </footer> 

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>

</html>