<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<title>Admin - Témoignages</title>

<!-- Page Content -->
<div class="container">

	<!-- Page Header -->
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				Témoignages <small></small>
			</h1>
		</div>
	</div>
	<!-- /.row -->

	<!-- Projects Row -->
	<p>Cliquez sur une ligne pour afficher le témoignage</p>
	<table class="table">
		<thead>
			<tr>
				<th>Parcours</th>
				<th>Eleve</th>
				<th>Promotion</th>
				<th>Etat</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<tr class="accordion-toggle" data-toggle="collapse"
				data-target="#collapse1">
				<td>Génie Logiciel</td>
				<td>Tintin Haddock</td>
				<td>2017</td>
				<td>Validé</td>
				<td><a href="#" class="glyphicon glyphicon-ok"></a><a href="#"
					class="glyphicon glyphicon-remove" style="margin-left: 30px"></a></td>
			</tr>
			<tr id="collapse1" class="collapse out">
				<td></td>
				<td colspan="4">
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Sed non risus. Suspendisse lectus tortor, dignissim sit amet,
							adipiscing nec, ultricies sed, dolor. Cras elementum ultrices
							diam. Maecenas ligula massa, varius a, semper congue, euismod
							non, mi. Proin porttitor, orci nec nonummy molestie, enim est
							eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
					</div>
				</td>
			</tr>
			<tr class="accordion-toggle" data-toggle="collapse"
				data-target="#collapse2">
				<td>Systèmes Embarqués</td>
				<td>Johny John</td>
				<td>2015</td>
				<td>Validé</td>
				<td><a href="#" class="glyphicon glyphicon-ok"></a><a href="#"
					class="glyphicon glyphicon-remove" style="margin-left: 30px"></a></td>
			</tr>
			<tr id="collapse2" class="collapse out">
				<td></td>
				<td colspan="4">
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Sed non risus. Suspendisse lectus tortor, dignissim sit amet,
							adipiscing nec, ultricies sed, dolor. Cras elementum ultrices
							diam. Maecenas ligula massa, varius a, semper congue, euismod
							non, mi. Proin porttitor, orci nec nonummy molestie, enim est
							eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
					</div>
				</td>
			</tr>
			<tr class="accordion-toggle" data-toggle="collapse"
				data-target="#collapse3">
				<td>Génie Logiciel</td>
				<td>Franky Vincent</td>
				<td>2017</td>
				<td>Validé</td>
				<td><a href="#" class="glyphicon glyphicon-ok"></a><a href="#"
					class="glyphicon glyphicon-remove" style="margin-left: 30px"></a></td>
			</tr>
			<tr id="collapse3" class="collapse out">
				<td></td>
				<td colspan="4">
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Sed non risus. Suspendisse lectus tortor, dignissim sit amet,
							adipiscing nec, ultricies sed, dolor. Cras elementum ultrices
							diam. Maecenas ligula massa, varius a, semper congue, euismod
							non, mi. Proin porttitor, orci nec nonummy molestie, enim est
							eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
					</div>
				</td>
			</tr>
			<tr class="accordion-toggle" data-toggle="collapse"
				data-target="#collapse4">
				<td>Business Intelligence</td>
				<td>Marvin Gaye</td>
				<td>2017</td>
				<td>Non Valid�</td>
				<td><a href="#" class="glyphicon glyphicon-ok"></a><a href="#"
					class="glyphicon glyphicon-remove" style="margin-left: 30px"></a></td>
			</tr>
			<tr id="collapse4" class="collapse out">
				<td></td>
				<td colspan="4">
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Sed non risus. Suspendisse lectus tortor, dignissim sit amet,
							adipiscing nec, ultricies sed, dolor. Cras elementum ultrices
							diam. Maecenas ligula massa, varius a, semper congue, euismod
							non, mi. Proin porttitor, orci nec nonummy molestie, enim est
							eleifend mi, non fermentum diam nisl sit amet erat. Duis semper.</p>
					</div>
				</td>
			</tr>
		</tbody>
		<tbody>
		</tbody>
	</table>
</div>
<!-- /.row -->

<!-- /.container -->

<!-- jQuery -->
<script src="resources/js/jquery.js" type="text/javascript"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>

<body></body>

<html></html>