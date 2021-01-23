<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


 <!DOCTYPE html>
<html> 
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


<%-- <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <script src="<c:url value="/static/js/jquery.3.5.1.min.js" />"></script>
    <script src="<c:url value="/static/js/boostrap.min.js" />"></script>	 --%>
	


<meta name="viewport" content="width=device-width, initial-scale=1">








<style>
.site-footer
{
  background-color:#26272b;
  padding:45px 0 20px;
  font-size:15px;
  line-height:24px;
  color:#737373;
}
.site-footer hr
{
  border-top-color:#bbb;
  opacity:0.5
}
.site-footer hr.small
{
  margin:20px 0
}
.site-footer h6
{
  color:#fff;
  font-size:16px;
  text-transform:uppercase;
  margin-top:5px;
  letter-spacing:2px
}
.site-footer a
{
  color:#737373;
}
.site-footer a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links
{
  padding-left:0;
  list-style:none
}
.footer-links li
{
  display:block
}
.footer-links a
{
  color:#737373
}
.footer-links a:active,.footer-links a:focus,.footer-links a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links.inline li
{
  display:inline-block
}
.site-footer .social-icons
{
  text-align:right
}
.site-footer .social-icons a
{
  width:40px;
  height:40px;
  line-height:40px;
  margin-left:6px;
  margin-right:0;
  border-radius:100%;
  background-color:#33353d
}
.copyright-text
{
  margin:0
}
@media (max-width:991px)
{
  .site-footer [class^=col-]
  {
    margin-bottom:30px
  }
}
@media (max-width:767px)
{
  .site-footer
  {
    padding-bottom:0
  }
  .site-footer .copyright-text,.site-footer .social-icons
  {
    text-align:center
  }
}
.social-icons
{
  padding-left:0;
  margin-bottom:0;
  list-style:none
}
.social-icons li
{
  display:inline-block;
  margin-bottom:4px
}
.social-icons li.title
{
  margin-right:15px;
  text-transform:uppercase;
  color:#96a2b2;
  font-weight:700;
  font-size:13px
}
.social-icons a{
  background-color:#eceeef;
  color:#818a91;
  font-size:16px;
  display:inline-block;
  line-height:44px;
  width:44px;
  height:44px;
  text-align:center;
  margin-right:8px;
  border-radius:100%;
  -webkit-transition:all .2s linear;
  -o-transition:all .2s linear;
  transition:all .2s linear
}
.social-icons a:active,.social-icons a:focus,.social-icons a:hover
{
  color:#fff;
  background-color:#29aafe
}
.social-icons.size-sm a
{
  line-height:34px;
  height:34px;
  width:34px;
  font-size:14px
}
.social-icons a.facebook:hover
{
  background-color:#3b5998
}
.social-icons a.twitter:hover
{
  background-color:#00aced
}
.social-icons a.linkedin:hover
{
  background-color:#007bb6
}
.social-icons a.dribbble:hover
{
  background-color:#ea4c89
}
@media (max-width:767px)
{
  .social-icons li.title
  {
    display:block;
    margin-right:0;
    font-weight:600
  }
}
	
    
</style>
</head>
<body> 

<!-- Site footer -->
    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-sm-12 col-md-6">
            <h6>GET IN TOUCH</h6>
            <p> We connect handymen with Jobs in your location. <br>Getting a handyman has never been so easy</p>
			   <ul class="footer-links">
				 <li>PHONE </li> 
				 <li>07741368555 </li> 
				   <li>07860600724 </li> <br>
				   
				   
				   <li> EMAIL</li>
				   <li>hello@solutionproviders.com </li>
				   
			  </ul>
            <p class="text-justify"> </p>
          </div>
			
			<div class="col-xs-6 col-md-3">
            <h6>DOWNLOADS</h6>
            <ul class="footer-links">
              
              <li><a href="#/">SP Survey</a></li>
              <li><a href="#">SP  Catalogue</a></li>
              <li><a href="#">SP Technical Catalogue</a></li>
              <li><a href="#">SP  Portfolio Catalogue</a></li>
            
            </ul>
          </div>
			
			
		
          <div class="col-xs-6 col-md-3">
            <h6>POST A JOB</h6>
            <ul class="footer-links">
              
              <li><a href="#">How it Works</a></li>
              
              <li><a href="#">Terms of Use</a></li>
              
              <li><a href="#">Hirer Privacy</a></li>
              
            
            </ul>
          </div>
          
           
          </div>

          <div class="col-xs-6 col-md-3">
            <h6>Quick Links</h6>
            <ul class="footer-links">
              <li><a href="#">About</a></li>
              <li><a href="#">Contact us</a></li>
              <li><a href="#">Portfolio</a></li>
              <li><a href="#">Privacy Policy</a></li>
            </ul>
          </div>
        </div>
        <hr>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-sm-6 col-xs-12">
            <p class="copyright-text">Copyright © 2020 All Rights Reserved by 
         <a href="#">Solution Providers</a>.
            </p>
          </div>

          <div class="col-md-4 col-sm-6 col-xs-12">
            <ul class="social-icons">
              <li><a class="facebook" href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a class="dribbble" href="#"><i class="fa fa-dribbble"></i></a></li>
              <li><a class="linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>   
            </ul>
          </div>
        </div>
      </div>
</footer>
	 </body>
</html>
 


<%-- <head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Solutions Provider  Home Page</title>
	<link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link>
    <script src="<c:url value="/static/js/jquery.3.5.1.min.js" />"></script>
    <script src="<c:url value="/static/js/boostrap.min.js" />"></script>	
	<style type="text/css">
	
		

	
	</style>
	</head>

<footer><div class="container-fluid">
	
	<div class="row" style="background:#1a1a1a; color:white;">
  <div class="col">
  <h4>Solution Providers</h4>
  <p> We connect handymen with Jobs in your location. Getting a handyman has never been so easy!</p>
  </div>
  
  <div class="col">
  
  <ul style="list-style-type:none;">
  <li>About Us</li>
  <li>Contact Us</li>
  <li>Privacy</li>
  <li> Terms and Conditions</li>
  
</ul>
</div>
  <div class="col"> 
  <ul style="list-style-type:none;">
  <li>Post a Job</li>
  <li>How it Works</li>
  <li> Terms of Usek</li>
  <li>Hirer Privacy</li>
 
</ul>
</div>
  <div class="col">
  <ul style="list-style-type:none;">
  <li>Signup as a Trade</li>
  <li>How it Works</li>
  <li>My Account</li>
  <li>Getting Started</li>
  <li>Tradeperson Privacy</li>
</ul>
</div>

	
<p>&copy; solutionsproviders.com 2020</p>
	
</div>


</div>

</footer>
 --%>



