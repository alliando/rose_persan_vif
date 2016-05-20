<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <title>Admin - Parcours</title>

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
            	<a href="admin_parcours_edit"><button type="button" class="btn btn-default">Ajouter un parcours</button></a> 
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

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>

</html>