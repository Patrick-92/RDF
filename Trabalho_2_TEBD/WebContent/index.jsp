<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>

<!-- CSS Bootstrap -->
<link rel="stylesheet" href="template/css/bootstrap.css">
<link rel="stylesheet" href="template/css/bootstrap-grid.css">

<!-- Script Bootstrap -->
<script src="template/js/bootstrap.js"></script>

<!-- Java -->
<%@page language="java" import="java.util.ArrayList"%>
<%@page language="java" import="modelo.Ator"%>

<%
	ArrayList<Ator> atores = null;

	if (request.getAttribute("atores") == null) {
%>
<meta http-equiv="Refresh"
	content="1; url=http://localhost:8080/Trabalho_2_TEBD/LeituraAtor">
<%
	} else {
		atores = (ArrayList<Ator>) request.getAttribute("atores");
	}
%>

</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Atores</h3>
			</div>
			<ul class="list-group">
				<li class="list-group-item">
					<div class="row toggle" id="dropdown-detail-1"
						data-toggle="detail-1">
						<div class="col-xs-20">Lista</div>
						<div class="col-xs-2">
							<i class="fa fa-chevron-down pull-right"></i>
						</div>
					</div>
					<div id="detail-1">
						<hr></hr>

						<%
							if (request.getAttribute("atores") != null) {
								for (Ator listaAtores : atores) {
						%>
						<div class="container">
							<div class="fluid-row">
								<div class="col-xs-2">
									<%=listaAtores.getNome()%>
								</div>
								<div class="col-xs-2">
									<%=listaAtores.getConjuge()%></div>
								<div class="col-xs-2">
									<%=listaAtores.getFilho()%></div>
								<div class="col-xs-2">
									<%=listaAtores.getNascimento()%></div>
								<div class="col-xs-2">
									<%=listaAtores.getNacionalidade()%>
								</div>
								<div class="col-xs-2">
									<%=listaAtores.getEnderecoAtual()%>
								</div>
								<div class="col-xs-1">
									<%
										for (String listaFilmes : listaAtores.getFilmes()) {
									%>
									<a href="LeituraFilme?nomeFilme=<%=listaFilmes%>"
										class="btn btn-link"><%=listaFilmes%></a>
								</div>
								<%
									}
										}
									}
								%>
							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>