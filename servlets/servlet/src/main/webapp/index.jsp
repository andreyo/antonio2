<html>
<body>
<h2>Hello World!</h2>

<p>Your principal is:  <%= request.getUserPrincipal() %>
</p>

<p><a href="secure/index.jsp">Secure page</a></p>

<p><a href="secure/extreme/index.jsp">Extremely secure page</a></p>
</body>
</html>