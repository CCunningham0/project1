<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Reimbursement System</title>
</head>
<body>
<center>
  <h1>Expense Reimbursement System</h1>
        <h3>
         <a href="employee-form.jsp">Add New Employee</a>
         &nbsp;&nbsp;&nbsp;
<!--          <a href="employee-list.jsp">List All Employees</a> -->
         
        </h2>
 </center>
 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of All Employees</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>List of All Tickets</th>
                <th>Action</th>
            </tr>
            <c:forEach var="employee" items="${getAllEmployee}">
                <tr>
                    <td><c:out value="${employee.id}" /></td>
                    <td><c:out value="${employee.name}" /></td>
                    <td><c:out value="${employee.email}" /></td>
                    <td></td>
                    <td>
                     <%-- <a href="edit?id=<c:out value='${employee.id}' />" --%>
                     <a href="employee-form.jsp">Edit Employee</a><a></a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="/deleteEmployee">Delete Employee</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 

</body>
</html>