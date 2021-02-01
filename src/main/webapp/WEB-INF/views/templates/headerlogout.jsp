<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Solutions Provider  Home Page</title>
	<link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <script src="<c:url value="/static/js/jquery.3.5.1.min.js" />"></script>
    <script src="<c:url value="/static/js/boostrap.min.js" />"></script>	
	
	</head>
	
	
	
	
	
	
	
	
	<!-- <style type="text/css">
	
	.JumboHeaderImg{
	background-image:url("static/images/crop-black-technician.jpg");
	
	 /* Full height */
  	height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
	background-size: cover;
	
	}
	

	</style> -->
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">SolutionsProviders</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#"> Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Trade Signup</a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="#">Get a Quote</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/showMyLoginPage'/>">Login</a>
        
       
        
        
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
 --%>





 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Solutions Provider  Home Page</title>
	<link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link>
	
	<style type="text/css">
	
	.JumboHeaderImg{
	background-image:url("static/images/crop-black-technician.jpg");
	
	 /* Full height */
  	height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
	background-size: cover;
	
	}

	</style>
</head>

<body>

 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="<c:url value='/'/>">SolutionsProviders</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
     <ul class="navbar-nav  mr-auto">
     <%--  <li class="nav-item active">
        <a class="nav-link" href="<c:url value='/'/>"> Home <span class="sr-only">(current)</span></a>
      </li> --%>
       </ul> 
        <ul class="navbar-nav">
       
        <li class="nav-item s">
        <a class="nav-link" href="<c:url value='/'/>"> Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/quote'/>">Get a Quote</a>
      </li>
      
      <!-- <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li> -->
      
    
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/tradeSignUp'/>">Trade Sign-Up</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/quote'/>">Categories</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/logout'/>">Logout</a>
        
       
        
        
      </li>
    </ul>
    <%-- <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form> --%>
  </div>
</nav>

