

<html>
<h1>Welcome to Display JSP page</h1>



<% 



out.print("Hello Friends");

 int x = 10;
out.print("X value is : "+x);



out.print(session.getAttribute("emp"));

%>


</html>