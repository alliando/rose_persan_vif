<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>
    <title>Speakisep</title>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Connexion
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Projects Row -->
        <div class="row">
            <div class="col-md-6 portfolio-item">
				${loginError}
				<div class="form-group form">
					<form action='login' method="post">
						<div>
							<label>Numéro ISEP :</label>
							<input type="text" id="userId" name="userId" placeholder="Numéro ISEP" class="form-control"/>
						</div>
						<br>
						<div>
							<label>Mot de passe :</label>
							<input type="password" id="password" name="password" placeholder="Mot de passe" class="form-control"/>
						</div>
							<br><button id="loginButton" class="form-control">Login</button>
					</form>
				</div>            
            </div>
            <div class="col-md-6 portfolio-item">

                <a href="#">
                    <!-- <img class="img-responsive" src="http://placehold.it/700x400" alt=""> -->
                </a>
                <h3 class="lien_parcours">
                    <a href="http://www.isep.fr/parcours/index.html" target="_blank" >Lien vers les parcours</a>
                </h3>
                <p></p>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->