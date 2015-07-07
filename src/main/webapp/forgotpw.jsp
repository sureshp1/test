<%@page isELIgnored="false" contentType="text/html" pageEncoding="UTF-8"%>
<html><body><center><h1>JLC TechSupport</h1>
<h2>Password Assistance Form</h2>
<font color="red" size="5">
<% Object obj=request.getAttribute("MSG");
if(obj!=null){out.print(obj);}%>
</font>

<form action="forgotpw.jlc" method="post">
<table>
<tr>
    <td>Email Id</td>
    <td><input type="text" name="email" value="${EML}"></td>
    
</tr>
<tr>
    <td colspan="2" align="center"><input type="submit" value="Submit"/> </td>
</tr>
</table> 
</form>
<h2><a href="index.jsp">Login</a></h2>

</table>
<h2>This is the Home Page</h2>
</center></body></html>