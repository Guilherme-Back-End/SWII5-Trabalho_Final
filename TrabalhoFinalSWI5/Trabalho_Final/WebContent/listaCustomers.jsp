<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD JAVA - Lista de Clientes</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</link>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Menu Principal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="clientes.html">Cadastro de Clientes</a>
        </li>
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="vendedores.html">Cadastro de Vendedores</a>
        </li>
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="pedidos.html">Cadastro de Pedidos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Lista de Clientes</a>
        </li>
      </ul>
      <form action="CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o nome ou ID" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
		<hr>
		<h3>Clientes cadastrados</h3>
		<hr>
		
		<table class="table">
		
		<thead>
			<tr>
				<th>#</th>
				<th>Nome</th>
				<th>Cidade</th>
				<th>Nota</th>
				<th>Vendedor</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${customers}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.city}</td>
			<td>${customer.grade}</td>
			<td>${customer.salesman}</td>
			<td>
			<a href="CustomerDelete?customerId=${customer.id}">deletar</a>
			<a href="CustomerUpdate?customerId=${customer.id}">atualizar</a>
						
			</td>
		
		</tr>
		</c:forEach>
						
		</tbody>
		</table>
		
		<h5><a href="clientes.html">Voltar para o cadastro de clientes</a></h5>
		
		<br>
		</div>
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>