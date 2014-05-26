<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>PFE : ilearning</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">

<!-- Add custom CSS here -->
<link href="<c:url value="/resources/css/sb-admin.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.min.css" />"
	rel="stylesheet">
<!-- Page Specific CSS -->
<link rel="stylesheet"
	href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
</head>
<body>
	<div id="pageheader">
		<jsp:invoke fragment="header" />
	</div>
	<div id="wrapper">

      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index">I_Learning : ${name}</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav side-nav">
            <li class="active"><a href="/ilearning-webapp/profil"><i class="fa fa-wrench"> ${name}</i></a></li>
         	<li><a href="/ilearning-webapp/cours/etudiant"><i class="fa fa-font"></i> Mes cours etudiant 2</a></li>
         	<li><a href="/ilearning-webapp/quizz"><i class="fa fa-font"></i> Quiz et Examens</a></li>
         	<li><a href="/ilearning-webapp/note"><i class="fa fa-bar-chart-o"></i> Mes notes</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </nav>

      <div id="page-wrapper">
		<div id="body">
			<jsp:doBody />
		</div>
      </div><!-- /#page-wrapper -->
    </div><!-- /#wrapper -->

	<div id="pagefooter">
		<jsp:invoke fragment="footer" />
	</div>
	<!-- JavaScript -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.js"></script>

	<!-- Page Specific Plugins -->
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
	<script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
	<script
		src="<c:url value="/resources/js/morris/chart-data-morris.js"/>"></script>
	<script
		src="<c:url value="/resources/js/tablesorter/jquery.tablesorter.js" />"></script>
	<script src="<c:url value="/resources/js/tablesorter/tables.js" />"></script>
</body>
</html>