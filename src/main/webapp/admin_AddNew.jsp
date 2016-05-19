<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <title>Admin - Ajout profil</title>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Ajout de profil
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

		<!-- Projects Row -->
        <div class="row">
            <div class="col-sm-12 col-md-12 btn btn-default btn-file">
                <label class="control-label">entrer le excel contenant la liste des nouveaux élèves ici</label>
				<input type="file" name="ADD" />
            </div>
         	<button type="submit" class="btn btn-default btn-lg btn-block active">Ajouter la liste</button>
            
        </div>
        <!-- /.row --> 
        

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>

</html>