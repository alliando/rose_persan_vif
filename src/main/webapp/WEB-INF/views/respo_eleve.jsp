<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>

<head><title>Rechercher des élèves</title>
<link href="resources/css/respo_eleve.css" rel="stylesheet">
    </head>
<body>
    <div class="container">
        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Rechercher des élèves
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->
    <div class="row">
        <div class="col-sm-4  col-md-offset-2">
            <form class="form-inline">
                <div class="form-group">
                    <label class="sr-only" for="eleveSearch"></label>
                    <div class="input-group">
                        <div class="input-group-addon"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></div>
                        <input type="text" class="form-control" id="eleveSearch" placeholder="Rechercher un élève">
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-4 col-xs-offset-1 col-sm-push-1 col-md-push-0">
            <label class="checkbox"><input type="checkbox" value="">Seulement mon parcours</label>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-4 col-md-2 col-sm-push-8 col-md-push-10">
            <select class="form-group form-control">
                <option>Promo 2019</option>
                <option>Promo 2018</option>
                <option>Promo 2017</option>
                <option>Promo 2016</option>
                <option>Promo 2017</option>
            </select>
        </div>
        <div class="col-sm-8 col-sm-pull-4 col-md-pull-0 ">
            <table class="table table-condensed table-hover table-bordered" >
                <thead>
                <tr class="success">
                    <th>Firstname</th>
                    <th>Lastname</th>
                    <th>Email</th>
                </tr>
                </thead>

                <tbody>
                <tr onclick="self.location.href='/respo_profilEleve'">
                    <td>John</td>
                    <td>DoeDoeDoeDoeDoeDoeDoe</td>
                    <td><a href="mailto:#">john@example.com</a></td>
                </tr>
                <tr onclick="self.location.href='/respo_profilEleve'">
                    <td>John</td>
                    <td>Doe</td>
                    <td><a href="mailto:#">john@example.com</a></td>
                </tr>
                </tbody>

            </table>
        </div>
    </div>

</div>
</body>
<%@ include file="footer.jsp" %>
