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

    <title>Admin Parcours</title>

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
                <a class="navbar-brand" href="admin_accueil.jsp">Speakisep Admin</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
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
                        <a href="admin_parcours.jsp">Parcours</a>
                    </li>
                    <li>
                        <a href="admin_universities.jsp">Universités</a>
                    </li>
                    <li>
                        <a href="#">Elèves</a>
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
                <h1 class="page-header">Parcours
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

		<!-- Projects Row -->
        <div class="row">
            <div class="col-md-6 portfolio-item">
            	<a href="admin_parcoursEdit.jsp"><button type="button" class="btn btn-default">Ajouter un parcours</button></a> 
            </div>
        </div>
        <!-- /.row --> 
        
        <!-- Projects Row -->
        <div class="row">
        	<table class="table">
        		<thead>
        			<tr>
        				<th>Parcours</th>
        				<th>Actions</th>
       				</tr>
        		</thead>
        		<tbody>
        			<tr>
		                <td><a href="#">Génie Logiciel</a></td>
		                <td><a href="#" class="glyphicon glyphicon-edit"></a><a href="#" class="glyphicon glyphicon-remove" style="margin-left:30px"></a></td>
		            </tr>
		            <tr>
		                <td><a href="#">Systèmes Embarqués</a></td>
		                <td><a href="#" class="glyphicon glyphicon-edit"></a><a href="#" class="glyphicon glyphicon-remove" style="margin-left:30px"></a></td>
		            </tr>
		            <tr>
		                <td><a href="#">Business Intelligence</a></td>
		                <td><a href="#" class="glyphicon glyphicon-edit"></a><a href="#" class="glyphicon glyphicon-remove" style="margin-left:30px"></a></td>
		            </tr>
		            <tr>
		                <td><a href="#">Numérique et Santé</a></td>
		                <td><a href="#" class="glyphicon glyphicon-edit"></a><a href="#" class="glyphicon glyphicon-remove" style="margin-left:30px"></a></td>
		            </tr>
	            <tbody>
	    	</table>
        </div>
        <!-- /.row -->     
        
        <hr>

        <!-- Footer -->
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

</body>

</html>