<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Reimbursement System</title>
<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">

function deleteRow(elm, item){
	if (!confirm('Are you sure?')){
		return;	
}
	
	$.ajax(
			{
				url:"http://localhost:8080/reimbursement/EmployeeServlet?action=delete&id="+item,
				success: function(result){
					$("tr.row-"+item).remove();
					}});}


/* $(document).ready(function() {	
	$.ajax(
			{
				url:"http://localhost:8080/reimbursement/EmployeeServlet?action=update",
				success:function(result){
					
	
}});} */

$(document).ready(function() {
	$.ajax(
			{url: "http://localhost:8080/reimbursement/EmployeeServlet?action=getall", 
				success: function(result){
					
					console.log(result);
					var tr ='';
					$.each(result,function(i,item){
						console.log(item.name);
						tr ='';
 						tr += '<tr class="row-'+item.id+'"><td>' + item.id + '</td>';
						tr += '<td>' + item.name + '</td>';
						tr += '<td>' + item.email + '</td>';
						tr += '<td>' + '<a href="<a ticketList.jsp">Ticket Status</a>' + '</td>';
						tr += '<td>' + '<a href="#" onclick="deleteRow($(this),'+item.id+')">Delete</a>&nbsp<a href="employee-form.jsp">Edit</a>' + '</td></tr>'; 
  
						$('#employee').append(tr); 
					}); 
				}
			});});

</script>

</head>
<body style="background-color: #BDBDBD;">
<center>
  <h1>Expense Reimbursement System</h1>
        <h2>
         <a href="employee-form.jsp">Add New Employee</a> &nbsp
         &nbsp;&nbsp;&nbsp;
        </h2>
 </center>
 <div  align="center">
        <table id="employee" border="1" cellpadding="5">
            <caption><h3>List of All Employees</h3></caption>
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