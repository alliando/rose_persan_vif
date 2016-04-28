<%--
  Created by IntelliJ IDEA.
  User: Gauth
  Date: 27/04/2016
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Speakisep</title>
    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/2-col-portfolio.css" rel="stylesheet">
    <link href="resources/css/main.css" rel="stylesheet">

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
            <a class="navbar-brand" href="#">Speakisep</a>
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
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>
<!-- Page Content -->
<div class="container">
    <div class="element btn-group btn-group-lg">
        <button class="btn btn-success href_button" onclick="self.location.href='/admin//universite'"><h1>Université</h1><h5>Valider, modifier, supprimer</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='/admin/temoignage'"><h1>Témoignage</h1><h5>Valider, modifier, supprimer</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='/admin/eleve'"><h1>Elèves</h1><h5>Ajouter</h5></button>
         <button class="btn btn-success href_button" onclick="self.location.href='/admin/parcours'" ><h1>Parcours</h1><h5>Modifier, supprimer</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='/admin/respo'"><h2>Responsable de parcours</h2><h5>Valider, modifier, supprimer</h5></button>
    </div>
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
</body>
</html>
