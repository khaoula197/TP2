
<%@ page import="java.util.ArrayList"%>
<%@ page import="Model.User"%>
<%@ page import="Model.Product"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicatiob</title>
</head>
<body>

<% 
User u =(User)request.getAttribute("User");
if(u!=null)
{ 
%>
<b> Bienvenue à l'appliation de Gestion de 
Produits<%out.println(u.getLogin());%> </b>
<% }%>
 
<% ArrayList<Product> v =(ArrayList<Product>) request.getAttribute("produits");
%>
<b> les produits sont:<%
	for (int i=0 ; i< v.size();i++){
		out.print(v.get(i).getVetements()+" "+v.get(i).getAccessoire());
		}
%>
</b>

</body>
 
</body>
</html>