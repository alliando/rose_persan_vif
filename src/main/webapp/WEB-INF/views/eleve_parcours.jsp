<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Parcours</title>
    <!-- Bootstrap Core CSS -->
    <%@ include file="header.jsp" %>

    <%@ include file="footer.jsp" %>
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
        <button class="btn btn-success href_button" onclick="self.location.href='eleve_parcours_liste'"><h1>Liste des parcours</h1><h5>tableau comparatif</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='eleve_parcours_responsable'" ><h2>Responsable de parcours</h2><h5>nom, contact</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='eleve_parcours_temoignage'"><h1>Témoignages</h1><h5>d'anciens élèves</h5></button>
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
