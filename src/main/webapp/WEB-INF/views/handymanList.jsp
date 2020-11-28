<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Handymen</title>
<!--  reference style sheet -->

<link type="text/css" rel="stylesheet" href="${contextPath}/static/css/style.css"/>

</head>
<body>

<div id="wrapper">

<div id ="header">
<h2>The Solution Providers Handyman Table</h2>
</div>
</div>
<div class="container">
  
       <div id="content">     
  <table>
    </br>
   <input type="button" value="Add Handyman"
   onclick="window.location.href='tradeSignUp'; return false;" class="add-button"/>
    
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        <th>Business Type</th>
        <!-- <th>Business Address</th>
        <th>State</th>
        <th>LGA</th>
        <th>PHONE NUMBER</th> -->
        <th>Action</th>
       </tr>
    
   <c:forEach var="handy"  items="${handymanlists}">
   
     <!--  construct an "update" link with handyman id -->
   
     <c:url var="updateLink" value="/showFormForHandymanUpdate">
      <c:param name="handymanId" value="${handy.handyman_id}" />
      </c:url>
       <tr>
        <td>${handy.firstName}</td>
        <td>${handy.lastName}</td>
        <td>${handy.email}</td>
        <td>${handy.businessAddress}</td>
        <td${handy.state}></td>
        <%-- <td>${handy.lga}</td>
        <td>${tempHandyman.phoneNumber}</td>
        <td>${tempHandyman.businessType}</td> --%>
        
        <!--  display the update link -->
      <td>  <a href="${updateLink}">Edit</a> </td>
      </tr>
      
    </c:forEach>
      
   
  </table>
  
  </div>
</div>
</body>
</html>