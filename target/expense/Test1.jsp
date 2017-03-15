<%@ page import="java.util.*" %>

<html>
	<head><title>Echo JSP</title></head>
<body>


<h1>Incoming HTTP Request</h1>

<table border="0" cellpadding="3" cellspacing="0" width="100%">

<%
Enumeration eNames = request.getHeaderNames();

while (eNames.hasMoreElements())
{
	String name = (String) eNames.nextElement();
	String value = request.getHeader(name);
%>

<tr><td><%= name %></td><td><%= value %></td></tr>

<%
}
%>

</table>
</body>
</html>
