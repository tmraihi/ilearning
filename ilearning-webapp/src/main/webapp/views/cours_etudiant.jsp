<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:layout>
	<jsp:body>
		Liste des cours : 
		<table class="table  table-hover">
		<tr>
		<c:forEach items="${myList}" var="element"> 
		    <td>${element}</td>
		</c:forEach>
		</tr>
		</table>
    </jsp:body>
</t:layout>