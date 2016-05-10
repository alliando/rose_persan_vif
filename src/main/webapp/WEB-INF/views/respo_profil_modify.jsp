<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>

    <title>Modifier sa fiche</title>
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
            </div>
            <div class="col-sm-4 col-md-4">
                <div class="form-group">
                    <label for="name"> Nom et prénom :</label>
                    <input type="text" class="form-control" id="inputName" placeholder="Nom, prénom">
                </div>
                <div class="form-group">
                    <label for="inputEmail">Adresse mail ISEP :</label>
                    <input type="email" class="form-control" id="inputEmail" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="inputParcours">Responsable du parcours ...</label>
                    <input type="text" class="form-control" id="inputParcours" placeholder="Responsable de quel parcours?">
                </div>
                <div class="form-group">
                    <label for="inputBureau">Bureau :</label>
                    <input type="text" class="form-control" id="inputBureau" placeholder="Salle n°">
                </div>
            </div>
            <div class="col-sm-4 col-md-4">
                <button type="submit" class="btn btn-primary btn-lg btn-block active">Sauvegarder ma fiche</button>
            </div>
        </form>
    </div>
    <!-- /.row -->
</div>