<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<head>

<jsp:include page="../views/templates/header.jsp" /> 
<link type="text/css" rel="stylesheet" href="${contextPath}/static/css/style.css"/>

<link type="text/css" rel="stylesheet" href="${contextPath}/static/css/add-customer-style.css"/>
</head>

<!-- <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style> -->
<body>
<div class="container">
</br>
    <p>Please fill in this form to create an account.</p>
    

<form:form  action="saveHandyman" modelAttribute="handyman" method="POST">
<!--  need to associate this data with  handyman id for update/edit handyman by adding a hiden form field -->

<form:hidden path="handyman_id"/>


    <table>  
    
    <tr>
    <td><label><b>First Name</b></label></td>
    <td><form:input path="firstName" /></td>
    </tr>
   <tr><td><label><b>Last Name</b></label></td>
    <td><form:input path="lastName" /></td>
     </tr>
    <tr><td><label><b>Email</b></label></td>
    <td><form:input path="email" /></td>
     </tr>
   <tr> <td><label><b>Password</b></label></td>
    <td><form:password path="password" /></td>
 </tr>
     <tr> <td><label><b>Business Type</b></label></td>
    <td><form:input path="businesstype"/></td>
    </tr>
  <tr>  <td><label><b>Business Address</b></label></td>
     <td><form:textarea  path="businessAddress" rows="3" /><br></td>
     </tr>
   <tr><td><label><b>State</b></label></td>
    <td><form:input path="state" /></td>
     </tr>
   <tr> <td><label><b>LGA</b></label></td>
    <td><form:input path="lga" /></td>
     </tr>
    <tr><td> <label><b>Phone Number</b></label></td>
    <td><form:input path="phoneNumber" /></td>
     </tr>
    
    <tr>
    <td><label></label></td>
  <td><input type="submit" value="REGISTER" class="add-button"/></td>
    </tr>
 
  
 </table>
 
</form:form>
<p>
<a href="${pageContext.request.contextPath}/"> Back to Home</a>

</p>
</div>
</body>
<jsp:include page="../views/templates/footer.jsp" />
</html>



