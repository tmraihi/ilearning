<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<style>
 
.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}
 
#login-box {
	width: 400px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>
 
	<h1>I LEARNING : PFE </h1>
 
	<div id="login-box">
 
		<h3>Veuillez vous authentifier ... </h3>
 
		<c:if test="${not empty error}">
			<div class="btn btn-lg btn-danger">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
 
		<form name='loginForm' action="<c:url value='/authentification' />" method='POST'>
 
		  <table>
			<tr>
				<td>Email :</td>
				<td><input type='text' name='login' value=''></td>
			</tr>
			<tr>
				<td>Mot de passe :</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2' align="right">
				<input class="btn btn-primary btn-xs" type="submit" value="connexion">
				</td>
			</tr>
		  </table>
		</form>
	</div>
 
</body>
</html>