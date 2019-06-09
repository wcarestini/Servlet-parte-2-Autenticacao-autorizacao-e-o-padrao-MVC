<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/listaempresas" var="linkListaEmpresas"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title</title>
</head>
<body>

	<c:if test="${not empty nomeEmpresa}">
			Empresa ${ nomeEmpresa } cadastrada com sucesso!
	</c:if>
		
	<hr>
	
	Lista de empresas: <hr />
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a>
				<a href="entrada?acao=RemoveEmpresa&id=${empresa.id}">remove</a>
			</li>
		</c:forEach>
	</ul>
	

</body>
</html>