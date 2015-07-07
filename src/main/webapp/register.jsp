<%@page isELIgnored="false" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    
    <body>
    <center>
    <h1>JLC TechSuport</h1>
    <h2>Registration Form</h2>
   
    <font color="red" size="4" face="arial">${MSG} </font>
    <form action="register.jlc" method="post">
    
    <table>
    <tr>
    <td>Full name</td>
    <td><input type="text" name="fname" value="${FNM}"></td>
    <td><font color="red" size="4" face="arial">${FNMERR}</font></td></tr> 
    <tr>
    <td>Email Id</td>
    <td><input type="text" name="email" value="${EML}"></td>
    <td><font color="red" size="4" face="arial"/>${EMLERR}</font></td></tr>
     <tr>
    <td>Phone</td>
    <td><input type="text" name="phone" value="${PHN}"></td>
    <td><font color="red" size="4" face="arial"/>${PHNERR}</font></td></tr>
     <tr>
    <tr>
    <td>Username</td>
    <td><input type="text" name="username" value="${UNM}"></td>
    <td><font color="red" size="4" face="arial">${UNMERR}</font></td></tr>
    <tr>
    <td>Password</td>
    <td><input type="password" name="password"></td>
    <td><font color="red" size="4" face="arial"/>${PWDERR}</font></td></tr>
    <tr>
    <td colspan="3" align="center"><input type="submit" value="Register"/> </td>
    </tr>
    </table> 
    </form>
    <h2><a href="index.jsp">Login</a></h2>
    </center>
    </body>
</html>
