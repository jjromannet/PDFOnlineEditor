<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="net.jjroman.dev.jee.webapp.backend.HelloBackendBean" %>
<%!
HelloBackendBean hbb = new HelloBackendBean();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello strings:
<ul>
<li><%= hbb.getHelloStringsFromLayerManager() %></li>
<li><%= hbb.getHelloStringsFromUserManager() %></li>
<li><%= hbb.getHelloStringsFromPdfConverter() %></li>
</ul>
</body>
</html>