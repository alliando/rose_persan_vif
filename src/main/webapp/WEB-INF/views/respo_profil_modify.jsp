<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<title>Responsable - Modifier sa fiche</title>

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
        <form action="form_modifierProfil" method="POST">
            <div class="col-sm-4 col-md-4">
                <div class="form-group">
                    <label class="control-label">Choisissez votre photo</label>
                    <input id="inputPhoto" type="file" class="file">
                </div>
            </div>
            <div class="col-sm-4 col-md-4">
                <div class="form-group">

                    <label for="nomParcours">Responsable du parcours ...</label>

                    <input type="text" class="form-control" name="nomParcours" list="nomParcours" placeholder="Responsable de quel parcours?">
                    <datalist id="nomParcours">
                        <c:forEach var="parcours" items="${Allparcours}" >
                        <option value="${parcours.getNomparcours()}">
                            </c:forEach>
                    </datalist>

                </div>
                <div class="form-group">
                    <label for="numSalle">Bureau :</label>
                    <input accept-charset="UTF-8" type="text" class="form-control" name="numSalle" id="numSalle" placeholder="Salle n°">
                </div>
            </div>
            <div class="col-sm-4 col-md-4">
                <button type="submit" class="btn btn-primary btn-lg btn-block active">Sauvegarder ma fiche</button>
            </div>
        </form>
    </div>
    <!-- /.row -->
</div>
<script src="resources/js/respo_modifierProfil.js" ></script>