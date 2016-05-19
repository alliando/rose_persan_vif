<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <title>Admin - Editer Responsables</title>

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

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>

</html>