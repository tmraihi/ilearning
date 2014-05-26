<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <jsp:body>


		<div>
			<c:if test="${not empty monmessage}">
				<div class="btn btn-lg btn-danger">${monmessage}</div>
			</c:if>
			<i class="glyphicon-dashboard"></i>
			<label>Nom : </label>
			<div class="input-append">
			<input type="text" value='titi'><span class="add-on">
			</span></div>

		</div>


    </jsp:body>
</t:layout>


