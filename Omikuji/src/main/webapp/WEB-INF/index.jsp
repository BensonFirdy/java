<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	

      
      
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
	<h1>Omikuji</h1>
	
	<div class="container"> 
    	<h1>Omikuji Form</h1>
    	
    	<form action="/omikuji/process" method="post">
		  <div class="form-group">
		    <label for="number">Pick A Number:</label>
		    <input type="number" class="form-control" name="number" placeholder="Any number between 5 to 25">
		  </div>
		  
		   <div class="form-group">
		    <label for="city">Enter City:</label>
		    <input type="text" class="form-control" name ="city" placeholder="Please enter a city">
		  </div>
		  
		  <div class="form-group">
		    <label for="city">Enter Person:</label>
		    <input type="text" class="form-control" name ="person" placeholder="Please enter a person name">
		  </div>
		    <div class="form-group">
		    <label for="hobby">Enter Hobby:</label>
		    <input type="text" class="form-control" name="hobby" placeholder="Please enter a hobby">
		  </div>
		  
		   <div class="form-group">
		    <label for="animal">Enter Animal:</label>
		    <input type="text" class="form-control" name="animal" placeholder="Please enter an animal">
		  </div>
		  
		  <div class="form-group">
		    <label for="description">Say Nice Thing:</label>
		    <textarea class="form-control"  name="description" rows="3"></textarea>
		  </div>
		  <br>
		  <input class="btn btn-primary" type="submit" value="Submit!">
		</form>
    	
    	
    	<!-- //==================================================================== -->
    	<!-- created this "/process route after @RequestMapping("/form") -->
    	
    	
    	
    </div> <!-- End of Container -->
	
	
	
	
	
</body>
</html>
