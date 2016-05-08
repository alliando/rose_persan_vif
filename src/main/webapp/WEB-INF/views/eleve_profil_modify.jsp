<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

<title>Modifier profil</title>
    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Modifier ma fiche
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

   <div class="row">
   	<form>
        <div class="col-sm-4 col-md-4">
        	  <div class="form-group">
            	<label class="control-label">Choisissez votre photo</label>
				<input id="inputPhoto" type="file" class="file">
			  </div>
			  <div class="form-group">
    			<label for="inputName"> Nom et prénom :</label>
    			<input type="text" class="form-control" id="inputName" placeholder="Nom, prénom">
  			  </div>
  			   <div class="form-group">
    			<label for="inputNumero"> Numéro ISEP :</label>
    			<input type="text" class="form-control" id="inputNumero" placeholder="Numéro ISEP">
  			  </div>
  			  <div class="form-group">
    			<label for="inputEmail">Adresse mail ISEP :</label>
    			<input type="email" class="form-control" id="inputEmail" placeholder="Email">
  			 </div>
  			 <div class="form-group">
            	<label class="control-label">CV</label>
				<input id="inputCV" type="file" class="file" multiple class="file-loading">
				
			  </div>
			   <div class="form-group">
            	<label class="control-label">Lettres de motivation</label>
				<input id="inputLettreMotiv" type="file" class="file" multiple class="file-loading">
			  </div>
        </div>
        <div class="col-sm-4 col-md-4">
             <div class="form-group">
    			<label for="inputCursus">Cursus actuel :</label>
    			<input type="text" class="form-control" id="inputCursus" placeholder="Année, spécialité ...">
  			 </div>
             <div class="form-group">
    			<label for="inputAdresse">Adresse :</label>
    			<input type="text" class="form-control" id="inputAdresse" placeholder="Adresse postale">
  			 </div>
  			 <div class="form-group">
  			 	<label for="inputActivites">Activités extrascolaires :</label>
  			 	<textarea class="form-control" placeholder="Activités extrascolaires" rows="3"></textarea>
  			 </div>
  			 <div class="form-group">
  			 	<label for="inputCompetences">Compétences de stage :</label>
  			 	<textarea class="form-control" placeholder="Compétences de stage" rows="4"></textarea>
  			 </div>
        </div>
        <div class="col-sm-4 col-md-4">
        	 <div class="form-group">
  			 	<label for="inputCompetences">Notes :</label>
  			 	<textarea class="form-control" placeholder="Notes" rows="6"></textarea>
  			 </div>
         	<button type="submit" class="btn btn-primary btn-lg btn-block active">Sauvegarder ma fiche</button>
        </div>
       </form>
   </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->