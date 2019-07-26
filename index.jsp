<%-- 
    Document   : index
    Created on : Jul 26, 2019, 12:26:57 PM
    Author     : Welcome Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body>
<form method="post" action="LoginServlet">
                 <p><input id="username" name= "username" type="text" placeholder="Username" style="margin:10px" autofocus required></p>
                 <p> <input id="password" name="password" type="password" placeholder="Password" style="margin:10px" required></p>
                 <p><input class="swd-button" type="submit" value="Sign In">
              </form>
              <h2><%=request.getAttribute("errorMessage") %></h2>
</body>
</html>
