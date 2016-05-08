<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Speakisep</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/2-col-portfolio.css" rel="stylesheet">
    <link href="resources/css/main.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

 <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Speakisep</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">Ma fiche</a>
                    </li>
                    <li>
                        <a href="#">Parcours</a>
                    </li>
                    <li>
                        <a href="#">International</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

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

        <hr>
        
                <!-- Footer -->
      	 <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Speakisep 2016</p>
                </div>
            </div>
            <!-- /.row -->
        </footer> 

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

</body>
</html>