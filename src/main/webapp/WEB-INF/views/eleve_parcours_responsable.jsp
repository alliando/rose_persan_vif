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

		<!-- à modifier pour windows (ports + root) -->
		<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
			url="jdbc:mysql://localhost:8889/speakisep" user="root"
			password="root" />

		<sql:query dataSource="${snapshot}" var="result">
		SELECT * from parcours INNER JOIN user WHERE parcours.IDPARCOURS=user.IDPARCOURS AND user.type="respo";
		</sql:query>

		<!--  <thead>
      <tr>
        <th>Parcours</th>
        <th>Professeur associé</th>
      </tr>
    </thead>
    	
        <tr>	<td> Ingénieur Architecte des Systèmes d'Information </td>
        		<td><a href="eleve_profilRespo"> Zakia KAZI-AOUL</a> </td> </tr>
        <tr>	<td> Ingénieur Architecte Réseaux et Services </td>
        		<td> <a href="eleve_profilRespo">Yousra CHABCHOUB</a> </td> </tr>
         <tr>	<td> Ingénieur Logiciel </td>
        		<td> <a href="eleve_profilRespo">Sylvain LEFEBVRE</a> </td> </tr>  
          <tr>	<td> Ingénieur Numérique et Santé </td>
        		<td><a href="eleve_profilRespo"> Maria TROCAN</a> </td> </tr>   
        		-->
		<thead>
			<tr>
				<th>Parcours</th>
				<th>Professeur associé <c:forEach var="row"
						items="${result.rows}">
						<tr>
							<td><c:out value="${row.NOMPARCOURS}" /></td>
							<td><a href="eleve_profilRespo"><c:out
										value="${row.nom}" /></a></td>
						</tr>
					</c:forEach>
					
		<!--  <tbody>
            <c:forEach var="user" items="${eleves}" >
            <c:if test="${(user.type).equals('respo')}">
            	<c:forEach var="parcours" items="${parcours}" >
            <tr>
                <td>${parcours.getNomparcours()}       <td><a href="eleve_profilRespo">${user.getNom()}</a>   <td class="hide">${user.getIdParcours()}</td>
                </c:forEach>
                </c:if>
            </c:forEach>-->
				</th>
			</tr>
		</thead>
	</table>

</div>
