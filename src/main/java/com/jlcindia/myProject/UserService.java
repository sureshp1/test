package com.jlcindia.myProject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.log4j.*;

public class UserService{

Logger log=Logger.getLogger("UserService.class");
public int verifyUser(String un,String pw){
log.info("UserService-Verify User");
int x=0;
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
try{
///con=JdbcUtil.getConnection();

String sql="Select * from users where username=? and password=?";
ps=con.prepareStatement(sql);
ps.setString(1,un);
ps.setString(2,pw);
rs=ps.executeQuery();
if(rs.next()){x=1;}
}catch(Exception e){
///log.error(e);
}
///finally{JdbcUtil.cleanup(con,ps,rs);}
return x;
}

public int registerUser(UserTo uto){
log.info("UserService-register-User()");
int x=0;
Connection con=null;
PreparedStatement ps=null;
try{
///con=JdbcUtil.getConnection();
String sql="insert into users values(?,?,?,?,?,?)";
ps=con.prepareStatement(sql);
int id=getNextUserId();
ps.setInt(1,id);
ps.setString(2,uto.getFname());
ps.setString(3,uto.getEmail());
ps.setLong(4,uto.getPhone());
ps.setString(5,uto.getUsername());
ps.setString(6,uto.getPassword());
x=ps.executeUpdate();
uto.setUserId(id);
}catch(Exception e){log.error(e);}
finally
{
///JdbcUtil.cleanup(con,ps);
}
return x;
}
public String getPasswordByEmail(String em){
log.info("UserService-getPasswordByEmail()");
String pw=null;
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
try{
///con=JdbcUtil.getConnection();
String sql="Select password from users where email=?";
ps=con.prepareStatement(sql);
ps.setString(1,em);
rs=ps.executeQuery();
if(rs.next()){
pw=rs.getString(1);
}}
catch(Exception e){
log.error(e);
}
finally{
///JdbcUtil.cleanup(con,ps,rs);
}
return pw;
}
public int getNextUserId(){
log.info("Userservice-getNextUserId()");
int x=0;
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
try{
///con=JdbcUtil.getConnection();
String sql="Select max(userId) from users";
ps=con.prepareStatement(sql);
rs=ps.executeQuery();
if(rs.next()){
x=rs.getInt(1);
x=x+1;
}}
catch(Exception e){
log.error(e);
}
finally{
///JdbcUtil.cleanup(con,ps,rs);
}
return x;
}
}
