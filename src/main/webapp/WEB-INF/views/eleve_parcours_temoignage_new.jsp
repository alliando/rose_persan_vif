<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>
    <title>Speakisep</title>
    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Déposer un nouveau témoignage
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

   <div class="row">
   	<form>
        <div class="col-sm-7 col-md-7">
              <div class="form-group">
				<select class="col-sm-12 col-md-12" name="parcours" style="margin-bottom:10px">
				    <option value="Parcours">Parcours</option>
				    <option value="Génie Logiciel">Génie Logiciel</option>
				    <option value="Systèmes Embarqués">Systèmes Embarqués</option>
				    <option value="Business Intelligence">Business Intelligence</option>
				    <option value="Numerique et Santé">Numerique et Santé</option>
				</select>
	  		  </div>
           	 <div class="form-group">
    			<textarea style="height:120px" class="form-control" id="Commentaire" placeholder="Témoignage"></TEXTAREA>
  			 </div>
        </div>
        <div class="col-sm-5 col-md-5">
         	<button type="submit" class="btn btn-primary btn-lg btn-block active">Déposer votre témoignage</button>
        </div>
       </form>
   </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->