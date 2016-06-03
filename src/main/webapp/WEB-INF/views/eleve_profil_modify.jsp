<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

<title>Elève - Modifier profil</title>
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
   	<form action="eleve_modifierProfil" method="POST">
        <div class="col-sm-4 col-md-4">
        	  <div class="form-group">
            	<label class="control-label">Choisissez votre photo</label>
				<input id="inputPhoto" type="file" class="file">
			  </div>
			  <div class="form-group">
    			<label for="inputName"> Prénom et Nom :</label>
    			<input type="text" class="form-control" id="inputName" placeholder="Nom, prénom" value="${user.nom}">
  			  </div>
  			   <div class="form-group">
    			<label for="inputNumero"> Numéro ISEP :</label>
    			<input type="text" class="form-control" id="inputNumero" placeholder="Numéro ISEP" value="${user.getNumber()}">
  			  </div>
  			  <div class="form-group">
    			<label for="inputEmail">Adresse mail ISEP :</label>
    			<input type="email" class="form-control" id="inputEmail" placeholder="Email" value="${user.mail}">
  			 </div>
  			 <div class="form-group">
            	<label class="control-label">CV</label>
				<input id="inputCV" type="file" class="file" multiple class="file-loading">
				
			  </div>
			   <div class="form-group">
            	<label class="control-label">Lettres de motivation</label>
				<input id="lmotiv" type="file" name="lmotiv" class="file" multiple class="file-loading">
			  </div>
        </div>
        <div class="col-sm-4 col-md-4">
             <div class="form-group">
    			<label for="apprenti">Cursus actuel :</label>
    			<input type="text" name="apprenti" class="form-control" id="apprenti" placeholder="Année, spécialité ...">
  			 </div>
             <div class="form-group">
    			<label for="adresse">Adresse :</label>
    			<input type="text" class="form-control" name="adresse" id="adresse" placeholder="Adresse postale">
  			 </div>
  			 <div class="form-group">
  			 	<label for="actextra">Activités extrascolaires :</label>
  			 	<textarea class="form-control" id="actextra" name="actextra" placeholder="Activités extrascolaires" rows="3"></textarea>
  			 </div>
  			 <div class="form-group">
  			 	<label for="competences">Compétences de stage :</label>
  			 	<textarea class="form-control" id="competences" name="competences" placeholder="Compétences de stage" rows="4"></textarea>
  			 </div>
        </div>
        <div class="col-sm-4 col-md-4">
        	 <div class="form-group">
  			 	<label for="notes">Notes :</label>
  			 	<textarea class="form-control" id="notes" name="notes" placeholder="Notes" rows="6"></textarea>
  			 </div>
         	<button type="submit" class="btn btn-primary btn-lg btn-block active">Sauvegarder ma fiche</button>
        </div>
       </form>
   </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->