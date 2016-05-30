<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

    <title>Elève - Témoignage</title>
<link href="resources/css/temoignage.css" rel="stylesheet">

    <div class="container">
            <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Témoignages
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->
<div class="row">
    	<div id="topin" class="col-sm-12 col-md-12">
		<span class="form-group col-sm-12 col-md-12">
			<select class="col-sm-4 col-md-4" name="tsearch">
			    <option value="Parcours">Tous les parcours</option>
			    <c:forEach var="parcours" items="${parcours}" >
            		<option value="${parcours.getNomparcours()}">${parcours.getNomparcours()}</option>
            	</c:forEach>
			</select>
			<a id="DepotTemoignage" class="pull-right btn btn-primary btn-lg active" role="button" href="eleve_parcours_temoignage_new">Déposer un Témoignage</a>
		</span>
		</div>
		<div   class="allBlock col-sm-12 col-md-12">
	<c:forEach var="temoignage" items="${temoignage}" >	
		<div   class="Block col-sm-12 col-md-12" style="display:none">
		<div class="bigblock"><h3 class="parcours">${temoignage.getNomparcours()}</h3> <h3 class="etpromo">${user.getNom()}, promo 2017</h3>
		</div>
		<p class="info">${temoignage.getDescriptem()}</p>
		</div>
	</c:forEach>
		</div>

    </div>
    </div>
    <!-- /.container -->
    <script src="resources/js/temoignage.js"></script>