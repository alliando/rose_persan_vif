<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<title>Admin - Responsables</title>

<!-- Page Content -->
<div class="container">

	<!-- Page Header -->
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				Responsables de parcours <small></small>
			</h1>
		</div>
	</div>
	<!-- /.row -->

	<!-- Projects Row -->
	<div class="row">
		<div class="col-md-6 portfolio-item">
			<a href="admin_respoEdit"><button type="button"
					class="btn btn-default">Ajouter un responsable</button></a>
		</div>
	</div>
	<!-- /.row -->

	<!-- Projects Row -->
	<div class="row">
		<table class="table">
			<thead>
				<tr>
					<th>Nom du responsable</th>
					<th>Parcours</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Mr. Busy</td>
					<td>BI</td>
					<td><a href="#" class="glyphicon glyphicon-edit"></a><a
						href="#" class="glyphicon glyphicon-remove"
						style="margin-left: 30px"></a></td>
				</tr>
				<tr>
					<td>Mr. Logi</td>
					<td>G�nie Logiciel</td>
					<td><a href="#" class="glyphicon glyphicon-edit"></a><a
						href="#" class="glyphicon glyphicon-remove"
						style="margin-left: 30px"></a></td>
				</tr>
				<tr>
					<td>Mr. Sysem</td>
					<td>Syst�mes embarqu�s</td>
					<td><a href="#" class="glyphicon glyphicon-edit"></a><a
						href="#" class="glyphicon glyphicon-remove"
						style="margin-left: 30px"></a></td>
				</tr>
				<tr>
					<td>Mr. Medic</td>
					<td>Num�rique et Sant�</td>
					<td><a href="#" class="glyphicon glyphicon-edit"></a><a
						href="#" class="glyphicon glyphicon-remove"
						style="margin-left: 30px"></a></td>
				</tr>
			</tbody>
			<tbody>
			</tbody>
		</table>
	</div>
	<!-- /.row -->

</div>
<!-- /.container -->

<!-- jQuery -->
<script src="resources/js/jquery.js" type="text/javascript"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>

<body></body>

<html></html>