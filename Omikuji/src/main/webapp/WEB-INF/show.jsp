<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.Date"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
  

      
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
    <div class="container"> 
    	<h1>Here is your Omikuji :)</h1>
    	<div class=wrapper>
	    	<p>In <c:out value="${number}"/> years, you will</p>
	    	<p>live in <c:out value="${city}"/> with</p>
	    	<p><c:out value="${person}"/> as your partner, selling</p>
	    	<p><c:out value="${hobby}"/> for living.</p>
	    	<p>The next time you see a <c:out value="${animal}"/>, you will </p>
	    	<p>have good luck.</P>
	    	<p>Also, <c:out value="${description}"/>.</p>
    	</div>
    	
    
    	
    	
 
    	
    </div> 
</body>
</html>