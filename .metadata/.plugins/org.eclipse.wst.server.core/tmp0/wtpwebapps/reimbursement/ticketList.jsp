
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket List</title>

<link rel="stylesheet" href="styles.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />

<script type="text/javascript" language="javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax(
				{url: "http://localhost:8080/project1/ListTicketsServlet?action=getTickets", 
					success: function(result){
						
						console.log(result);
						var tr ='';
						$.each(result,function(i,item){
							console.log(item.name);
							tr ='';
	 						tr += '<tr class="row-'+item.id+'"><td>' + item.id + '</td>';
							tr += '<td>' + item.userId + '</td>';
							tr += '<td>' + item.type + '</td>';
							tr += '<td>' + 'link to the ticket table' + '</td></tr>'
							//tr += '<td>' + '<a href="#" onclick="deleteRow($(this),'+item.id+')">Delete</a>&nbsp<a href="employee-form.jsp">Edit</a>' + '</td></tr>'; 
	  
							$('#employee').append(tr); 
						}); 
					}
				});});
		
	
	
	
	</script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link" href="addTicket.jsp">Add Ticket</a> <a
						class="nav-link disabled" href="updateTicket.jsp">Update
						Ticket</a> <a class="nav-link" href="ticketList.jsp">Ticket List</a>
				</div>
			</div>
		</div>
	</nav>


	<form class="form-signin" action="listTickets" method="post">
		<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
	</form>



	<div align="center">
		<table id="employee" border="1" cellpadding="5">
			<caption>
				<h3>List of All Employees</h3>
			</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Tickets Info</th>
				<th>Action</th>
			</tr>
		</table>
	</div>

</body>
</html>