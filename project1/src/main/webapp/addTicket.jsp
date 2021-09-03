<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<form class="form-signin" action="addTicket" method="post">
		<img class="mb-4" src="img/ticket.jpg" alt="ticket image" width="200"
			height="150">
		<h1 class="h3 mb-3 font-weight-normal">Submit Ticket</h1>
		<input type="number" name="reimbursement_amount" class="form-control"
			placeholder="Reimbursement amount" min="0.01" step="0.01" required
			autofocus="">
		<textarea name="ticket_description" class="form-control scroll"
			placeholder="Description" style="height: 100px" required></textarea>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		<p class="mt-5 mb-3 text-muted">© 2021 - All time</p>
	</form>
</body>
</html>
