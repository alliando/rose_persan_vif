<%@ page contentType="text/html;charset=UTF-8" language="java"
		 pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<link href="resources/css/temoignage.css" rel="stylesheet">
<title>Elève - Les Responsables</title>
<!-- Page Content -->
<div class="container">
	<!-- Page Header -->
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">
				Les Responsables de parcours <small></small>
			</h1>
		</div>
	</div>
	<!-- /.row -->

	<table class="table table-bordered">


		<thead>

		<tr>
			<th>Parcours 					<th>Professeur associé
		<tbody>
		<c:forEach var="parc" items="${parcoursFound}">
		<c:forEach var="respo" items="${respoFound}">
		<c:if test="${(parc.getId()).equals(respo.getIdParcours())}">

		<tr>
			<td>${parc.getNomparcours()}		<td><a  onclick="self.location.href='eleve_profilRespo?id=${respo.getId()}'">${respo.getNom()}</a>

			</c:if>
			</c:forEach>
			</c:forEach>

	</table>

</div>
