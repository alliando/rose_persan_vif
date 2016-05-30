<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<title>Elève - Universités</title>
    <!-- Page Content -->
    <div class="container">

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Universités
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->
<!--style="border: 2px solid;"-->
   <div class="row">
    <input type="text" class="form-control" id="search">
        <div id="unilist" class="col-sm-12 col-md-12">
        <table class="table table-striped">

        <c:forEach var="universite" items="${universites}" >
            <tr>
                <td><blockquote><h3 id="parcours">${universite.getNomuniv()}</h3><a href="${universite.getLienuniv()}">Lien vers les cours</a></blockquote></td>
             </tr>   
            </c:forEach>
       <!--  <tr>
        <td>
            <blockquote>
			<h3 id="parcours">École polytechnique de Montréal</h3>
            <button type="button" class="btn btn-link">Liens vers les cours</button>
            </blockquote>
        </td>
        </tr>
        <tr>
        <td>
            <blockquote>
			<h3 id="parcours">Université Catholique de Louvain</h3>
            <button type="button" class="btn btn-link">Liens vers les cours</button>
            </blockquote>
         </td>
         </tr>
        <tr>
        <td>
            <blockquote>
			<h3 id="parcours">Institut</h3>
            <button type="button" class="btn btn-link">Liens vers les cours</button>
            </blockquote>
         </td>
         </tr>
         --> 
        </table>
        </div>
        </div>
 
        <!-- /.row -->
    </div>
    <!-- /.container -->

    <!-- JavaScript -->
    <script src="resources/js/universite.js"></script>

