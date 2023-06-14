<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD - Java Atualizar cliente</title>

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
        <li class="nav-item">
          <a class="nav-link" href="#">Lista de Vendedores</a>
        </li>
      </ul>
      <form action="CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o nome ou ID" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
		<hr>
		<h3>Atualizar Cliente</h3>
		<hr>
		<form action="CustomerUpdate" method="POST">
		<input value="${customer.id}" name="id" type="number" style="visibility:hidden">
		
		<div class="form-floating mb-3">
						<input value="${customer.name}" name="name" maxlength="50" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${customer.city}" name="city" maxlength="40" type="text" class="form-control"> 
						<label>Cidade</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${customer.grade}" name="grade" type="text" class="form-control" placeholder="Nota">
						<label>Nota</label>
					</div>
					<select name="salesman" class="form-select mb-3" aria-label="Default select example">
						<option selected>-- Selecione o vendedor</option>
						<option value="1"> Vendedor 1</option>
						<option value="2">Vendedor 2</option>
					</select>
					<button class="btn btn-success" type="submit">Atualizar Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar Formulário</button>
		</form>	
		<br>
		</div>
		
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>