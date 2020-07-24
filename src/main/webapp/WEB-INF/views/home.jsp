
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <a class="nav-link" href="#">Login</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>



<div class="jumbotron JumboHeaderImg">
 
  
  
  
<!--    <img src="<c:url value='static/images/black-technician.jpg'/>" class="img-rounded" alt="Technician" width="50%" height="100%"> -->
  
</div>


<!-- second jumbotron -->

<div class="jumbotron ">

  <h3 style="text-align:center ;">Sign-up and Solutions provider sends you local job opportunities</h3>
  <p class="lead" style="text-align:left ;">Looking for flexible work can be time consuming, but with so many available jobs out there it doesnt need to be. Solutions provider puts you in touch with local employers with jobs to fill across a range of industries, including construction, landscaping, events, driving, logistics, business and offices.</p>
  <hr class="my-4">
  <p style="text-align:left ;">All you need to do is sign-up with your work preferences. Then relevant work opportunities in your area will be sent to you. The service is completely free when you are looking for work  the day rate advertised is the rate you get paid.</p>
 
</div>

<!-- third jumboron -->
<div class="jumbotron">

<h2 style="text-align:center;"> How to find a handyman</h2>

<div class="card-deck">
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">1. Post your job</h5>
      <p class="card-text">
      Tell us about the job you want doing and we'll match your job to a local repairer.</p>
      
    </div>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">2. Receive Quotes</h5>
      <p class="card-text">Some of these handyman will then get in touch with you to give you a quote for the job.</p>
     
    </div>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title">3. Choose a handyman</h5>
      <p class="card-text"> Compare quotes and choose your preferred handyman.</p>
      
    </div>
  </div>
</div>

</div>

<!-- Fourth jumboron -->


<!-- 
<div class="container"> -->
<div class="jumbotron">

<h2 style="text-align:center;">Our most popular jobs</h2><br><br>



  <div class="row">
  <div class="col"><ul>
  <li style="list-style-type: none;">DSTV Specialist</li>
  <li style="list-style-type: none;">Tiler</li>
  <li style="list-style-type: none;">Bricklayers</li>
   <li style="list-style-type: none;">Builders</li>
  <li style="list-style-type: none;">Carpenters and Joiners</li>
  <li style="list-style-type: none;">Carpet Fitters</li>
   <li style="list-style-type: none;" >Plumber</li>
  <li style="list-style-type: none;">Security</li>
</ul> </div>
    <div class="col">
    <ul>
  <li style="list-style-type: none;">Door Fitters</li>
  <li style="list-style-type: none;">Drainage Specialist</li>
  <li style="list-style-type: none;">Electrician</li>
   <li style="list-style-type: none;">Extension Builders</li>
  <li style="list-style-type: none;">Architects</li>
  <li style="list-style-type: none;">Suveyors</li>
   <li style="list-style-type: none;" >Flooring Fitters</li>
  <li style="list-style-type: none;">Locksmiths</li>
</ul>
    
    </div>
    <div class="col">
    
    <ul>
  <li style="list-style-type: none;">Tailor</li>
  <li style="list-style-type: none;">Barbers</li>
  <li style="list-style-type: none;">Saloonist</li>
   <li style="list-style-type: none;">Decorators</li>
  <li style="list-style-type: none;">Kitchen Fitters</li>
  <li style="list-style-type: none;">Handymen</li>
   <li style="list-style-type: none;" >Event planners</li>
  <li style="list-style-type: none;">Cooks</li>
</ul>
    
    </div>
    <div class="col">
    
    <ul>
  <li style="list-style-type: none;">Security man</li>
  <li style="list-style-type: none;">Personal assistant</li>
  <li style="list-style-type: none;">Painter and Decorator</li>
   <li style="list-style-type: none;">Plasterers</li>
  <li style="list-style-type: none;">Roofers</li>
  <li style="list-style-type: none;">Window Fitters</li>
   <li style="list-style-type: none;" >Lesson teachers</li>
  <li style="list-style-type: none;">House help</li>
</ul>
    
  </div>
  </div>
  </div>

<div class= "container">
<div class="card-deck">
  <div class="card">
    
    <div class="card-body">
     
     <img src= "static/images/black-boy-on-concrete-wooden-floor.jpg"  class="rounded float-left" width="304" height="236" alt="concrete"> 
      
    </div>
  </div>
  <div class="card">
  
    <div class="card-body">
      
      <img src="static/images/barber.jpg" class="rounded float-left"   width="304" height="236" alt="...">
      
    </div>
  </div>
  <div class="card">
    
    <div class="card-body">
      
      <img src="static/images/carpenter.jpg" class="rounded float-left" width="304" height="236" alt="...">
    </div>
  </div>
</div>

</div>


<div class= "container">
<div class="card-deck">
  <div class="card">
    
    <div class="card-body">
     
     <img src= "static/images/architect-building-construction.jpg"  class="rounded float-left" width="304" height="236" alt="architect-building"> 
      
    </div>
  </div>
  <div class="card">
  
    <div class="card-body">
      
      <img src="static/images/electrician.jpg" class="rounded float-left"   width="304" height="236" alt="...">
      
    </div>
  </div>
  <div class="card">
    
    <div class="card-body">
      
      <img src="static/images/driver.jpg" class="rounded float-left" width="304" height="236" alt="...">
    </div>
  </div>
</div>

</div>



<div class= "container">
<div class="card-deck">
  <div class="card">
    
    <div class="card-body">
     
     <img src= "static/images/heavyduty.jpg"  class="rounded float-left" width="304" height="236" alt="concrete"> 
      
    </div>
  </div>
  <div class="card">
  
    <div class="card-body">
      
      <img src="static/images/tap.jpg" class="rounded float-left"   width="304" height="236" alt="...">
      
    </div>
  </div>
  <div class="card">
    
    <div class="card-body">
      
      <img src="static/images/tiles.jpg" class="rounded float-left" width="304" height="236" alt="...">
    </div>
  </div>
</div>

</div>


<div class= "container">
<div class="card-deck">
  <div class="card">
    
    <div class="card-body">
     
     <img src= "static/images/animal-dog.jpg"  class="rounded float-left" width="304" height="236" alt="concrete"> 
      
    </div>
  </div>
  <div class="card">
  
    <div class="card-body">
      
      <img src="static/images/security.jpg" class="rounded float-left"   width="304" height="236" alt="...">
      
    </div>
  </div>
  <div class="card">
    
    <div class="card-body">
      
      <img src="static/images/antenna.jpg" class="rounded float-left" width="304" height="236" alt="...">
    </div>
  </div>
</div>

</div>











  
 
<footer class="container">
  <p>&copy; Solutions provider2020</p>
</footer>
</body>
 
</html> 