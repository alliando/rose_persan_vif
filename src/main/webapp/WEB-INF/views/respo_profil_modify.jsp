<%@ page contentType="text/html;charset=UTF-8" language="java"  %>

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
        <form>
            <div class="col-sm-4 col-md-4">
                <div class="form-group">
                    <label class="control-label">Choisissez votre photo</label>
                    <input id="inputPhoto" type="file" class="file">
                </div>
            </div>
            <div class="col-sm-4 col-md-4">
                <div class="form-group">

                    <label for="inputParcours">Responsable du parcours ...</label>

                    <input type="text" class="form-control" list="inputParcours" placeholder="Responsable de quel parcours?">
                    <datalist id="inputParcours">
                        <c:forEach var="parcour" items="${parcours}" >
                            <option value="${parcour.getNomparcours()}">

                            </c:forEach>
                    </datalist>

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