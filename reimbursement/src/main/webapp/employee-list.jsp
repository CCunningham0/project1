<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Reimbursement System</title>

<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$.ajax(
			{url: "http://localhost:8080/reimbursement/EmployeeServlet?action=getall", 
				success: function(result){
					//response = $.parseJSON(result);
					console.log(result);
					var tr ='';
					$.each(result,function(i,item){
						console.log(item.name);
 						tr += '<tr><td>' + item.id + '</td>';
						tr += '<td>' + item.name + '</td>';
						tr += '<td>' + item.email + '</td>';
						tr += '<td>' + 'add a link to the ticket table' + '</td>'
						tr += '<td>' + 'Action' + '</td></tr>'; 
 
 						  var $tr = $('<tr>').append(
								$('<td>').text(item.id),
								$('<td>').text(item.name),
								$('<td>').text(item.email),
								$('<td>').text('link'),
								$('<td>').text('')) ;  
						$('#employee').append(tr); 
					}); 
				}
			});});

</script>

</head>
<body>
<center>
  <h1>Expense Reimbursement System</h1>
        <h3>
         <a href="employee-form.jsp">Add New Employee</a> &nbsp
<!--          <a href="/delete">Delete Employee</a> -->

         &nbsp;&nbsp;&nbsp;
<!--          <a href="employee-list.jsp">List All Employees</a> -->
         
        </h2>
 </center>
 <div  align="center">
        <table id="employee" border="1" cellpadding="5">
            <caption><h2>List of All Employees</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Tickets Info</th>
                <th>Action</th>
            </tr>
            
      <!--       <tr>
            <td>''</td>
            
            </tr>
            
            <tr>
            	<td>''</td>
            </tr>
            
            <tr>
            	<td>''</td>
            </tr>
            
            <tr>
            	<td>
            	<a href="/delete">Delete Employee</a>
            	<a href="employee-form.jsp">Edit Employee</a>
            	 </td>
            </tr> -->
            
        </table>
    </div> 

</body>
</html>