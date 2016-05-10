<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>


<title>Editer Université</title>
    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Editer une université
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
		    			<label for="inputUniversity">Nom de l'université: </label>
		    			<input type="text" class="form-control" id="inputUniversity" placeholder="Université">
		  			</div>
		  			<div class="form-group">
		    			<label for="inputUnivWeb">Lien vers les cours proposés par l'université: </label>
		    			<input type="text" class="form-control" id="inputUnivWeb" placeholder="Lien">
		  			</div>
		  			<button type="submit" class="btn btn-default btn-lg btn-block active">Sauvegarder l'université</button>
	            </div>
            </form>
        </div>
        <!-- /.row -->   

    </div>
    <!-- /.container -->