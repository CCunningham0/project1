<html>
<head>
<meta charset="UTF-8">
<title>Expense Reimbursement System</title>

<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">


					
	</script>

	</head>
	 <center>
  <h1>Expense Reimbursement System</h1>
        <h3>
         <a href="employee-list.jsp">Back to List of All Employees</a>
         &nbsp;&nbsp;&nbsp;
         <!-- <a href="list">List All Employee</a> -->
         
        </h3>
 </center> 
<body>
<center>
        <form method="post" action="add">
        <table>
        	<tr>
        		<td>Name:<input type="text" name="name" /></td>
        	</tr>
        	<tr>
        		<td>Email:<input type="text" name="email" /></td>
        	</tr>
        	<tr>
        		<td>Username:<input type="text" name="username" /></td>
        	</tr>
        	<tr>
        		<td>Password:<input type="text" name="password" /></td>
       		 </tr>
       		 <tr>
        		<td><input type="submit" value="register" /></td>
        	</tr>
        
        </table>

        </form>
 </center>

<%-- 
 
    <div align="center">
  <c:if test="${employee != null}">

   <form action="update" method="post">
   </c:if>
        <c:if test="${employee == null}">
    </div> 
 <center>    
  <div>   
   <form action="adde" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${employee != null}">
               Edit User
              </c:if>
              <c:if test="${employee == null}">
               Add New User
              </c:if>
             </h2>
            </caption>
          <c:if test="${employee != null}">
           <input type="hidden" name="id" value="<c:out value='${employee.id}' />" />
          </c:if>            
            <tr>
                <th>Employee Name: </th>
                <td>
                 <input type="text" name="name" size="45"
                   value="<c:out value='${employee.name}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Employee Email: </th>
                <td>
                 <input type="text" name="email" size="45"
                   value="<c:out value='${employee.email}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Username: </th>
                <td>
                 <input type="text" name="username" size="15"
                   value="<c:out value='${employee.username}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                 <input type="number" name="password" size="15"
                   value="<c:out value='${employee.password}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Type </th>
                <td>
				  <input type="radio" id="emp" name="hr" value="Employee">
				  <label for="emp">Employee</label>
				  <br>
				  <input type="radio" id="manager" name="hr" value="Finance manager">
				  <label for="manager">Finance manager</label>
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Save" />
             </td>
            </tr>
        </table>
        </form>
    </div> 
  </center>
     --%>
</body>
</html>