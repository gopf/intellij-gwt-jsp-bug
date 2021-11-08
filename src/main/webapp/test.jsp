<%@ page import="static com.clubdesk.gxt.client.JspHelper.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to JSP!</title>
</head>
<body>
Hello World!<br/>
<%=IP_MESSAGE%><%out.println(request.getRemoteAddr());%>
</body>
</html>