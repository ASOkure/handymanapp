
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<head>
	<style type="text/css">
	
	.JumboHeaderImg{
	background-image:url("static/images/carpenter.jpg");
	
	 /* Full height */
  	height: 50%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
	background-size: cover;
	
	}
	

	</style>
	</head>

<body>

<jsp:include page="../views/templates/headerlogout.jsp" />


<div class="jumbotron JumboHeaderImg">
 
 
  
</div>

<div class="container">
  
<h2> Post your Job</h2>

<p>Get FREE Quotes from up to 3 Local Tradespeople, it only takes around two minutes!</p> <br><br>
  <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
 <!--  
  <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Dropdown button
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#">Action</a>
    <a class="dropdown-item" href="#">Another action</a>
    <a class="dropdown-item" href="#">Something else here</a>
  </div>
</div> -->
  

<div class="form-group">
  <label for="sel1">What type of tradesperson do you need?</label>
  <select class="form-control" id="sel1">
    <option>Choose a trade</option>
    <option>Electrician</option>
    <option>Mechanic</option>
    <option>Carpenter</option>
    <option>Driver</option>
    <option>Builder</option>
    <option>Architect</option>
    <option>Surveyor</option>
  </select>
</div><br><br>


<div class="form-group">
  <label for="sel1">What type of work do you need?</label>
  <select class="form-control" id="sel1">
    <option>Choose a trade</option>
    <option>Electrician</option>
    <option>Mechanic</option>
    <option>Carpenter</option>
    <option>Driver</option>
    <option>Builder</option>
    <option>Architect</option>
    <option>Surveyor</option>
  </select>
</div> <br><br>


 

  <%-- <h3>Job description</h3>
<p>Please give a description of the job you want doing including detail of any materials you need the tradesman to supply,
 the condition of any repair/replacement work, etc.</p><br>
 
  <form action="/action_page.php">
    <div class="form-group">
      <label for="comment">Job info:</label>
      <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form> --%>
  
  
 <!--  <h3>Job Location- Where do you want the tradesperson?</h3>
  
  <p>Please enter the LGA-State for the job so that we can match up local relevant tradespeople.</p>
   -->
   <div class="container ">
       <h3>Job Location- Where do you want the tradesperson?</h3>
  
  <p>Please select the State-LGA for the job so that we can match up local relevant tradespeople.</p>
      <div class="row align-items-center ">
        <div class="col-md-4"></div>
        <div class="col-md-4">

  
            <form>
              <div class="form-group">
                <label class="control-label">State of Origin</label>
                <select onchange="toggleLGA(this);"
                  name="state"
                  id="state"
                  class="form-control">
                  <option value="" selected="selected">- Select -</option>
                  <option value="Abia">Abia</option>
                  <option value="Adamawa">Adamawa</option>
                  <option value="AkwaIbom">AkwaIbom</option>
                  <option value="Anambra">Anambra</option>
                  <option value="Bauchi">Bauchi</option>
                  <option value="Bayelsa">Bayelsa</option>
                  <option value="Benue">Benue</option>
                  <option value="Borno">Borno</option>
                  <option value="Cross River">Cross River</option>
                  <option value="Delta">Delta</option>
                  <option value="Ebonyi">Ebonyi</option>
                  <option value="Edo">Edo</option>
                  <option value="Ekiti">Ekiti</option>
                  <option value="Enugu">Enugu</option>
                  <option value="FCT">FCT</option>
                  <option value="Gombe">Gombe</option>
                  <option value="Imo">Imo</option>
                  <option value="Jigawa">Jigawa</option>
                  <option value="Kaduna">Kaduna</option>
                  <option value="Kano">Kano</option>
                  <option value="Katsina">Katsina</option>
                  <option value="Kebbi">Kebbi</option>
                  <option value="Kogi">Kogi</option>
                  <option value="Kwara">Kwara</option>
                  <option value="Lagos">Lagos</option>
                  <option value="Nasarawa">Nasarawa</option>
                  <option value="Niger">Niger</option>
                  <option value="Ogun">Ogun</option>
                  <option value="Ondo">Ondo</option>
                  <option value="Osun">Osun</option>
                  <option value="Oyo">Oyo</option>
                  <option value="Plateau">Plateau</option>
                  <option value="Rivers">Rivers</option>
                  <option value="Sokoto">Sokoto</option>
                  <option value="Taraba">Taraba</option>
                  <option value="Yobe">Yobe</option>
                  <option value="Zamfara">Zamafara</option>
                </select>
              </div>

              <div class="form-group">
                <label class="control-label">LGA of Origin</label>
                <select name="lga" id="lga" class="form-control select-lga" required >
                </select>
              </div>
            </form>
          
        </div>
        <div class="col-md-4"></div>
      </div>
    </div><br><br>
    
    <h3>Job description</h3>
<p>Please give a description of the job you want doing including detail of any materials you need the tradesman to supply,
 the condition of any repair/replacement work, etc.</p><br>
 
  <form action="processPostJob">
    <div class="form-group">
      <label for="comment">Job info:</label>
      <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
    </div>
   <%--  <input type="hidden" name="from" value="${pageContext.request.requestURI}"> --%>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>

  <%-- <div class="row">
    <div class="col-6 col-md-4"><form>
  <!-- Small -->
  <select name="cars" class="custom-select-sm">
    <option selected>Small Custom Select Menu</option>
    <option value="volvo">Volvo</option>
    <option value="fiat">Fiat</option>
    <option value="audi">Audi</option>
  </select>

</form></div>
    <div class="col-6 col-md-4"><form>
  <!-- Small -->
  <select name="cars" class="custom-select-sm">
    <option selected>Small Custom Select Menu</option>
    <option value="volvo">Volvo</option>
    <option value="fiat">Fiat</option>
    <option value="audi">Audi</option>
  </select>

</form></div>
    <div class="col-6 col-md-4"><form>
  <!-- Small -->
  <select name="cars" class="custom-select-sm">
    <option selected>Small Custom Select Menu</option>
    <option value="volvo">Volvo</option>
    <option value="fiat">Fiat</option>
    <option value="audi">Audi</option>
  </select>

</form></div>
  </div>
 --%>

</div>

</body>

<jsp:include page="../views/templates/footer.jsp" />

<script type="text/javascript" src="<c:url value="/static/js/lga.min.js"/>"></script>
</html>