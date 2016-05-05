
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java"  %>
<%@ include file="header.jsp" %>
<body>
    <div class="container">
    <div class="element btn-group btn-group-lg">
        <button class="btn btn-success href_button" onclick="self.location.href='/respo_eleve'"><h1>Elèves</h1><h5>Fiches, infos</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='/respo_profil'" ><h1>Ma fiche</h1><h5>&nbsp;</h5></button>
        <button class="btn btn-success href_button" onclick="self.location.href='/eleves/international'"><h1>International</h1><h5>Université, cours</h5></button>
    </div>
</div>
</body>
<%@ include file="footer.jsp" %>
