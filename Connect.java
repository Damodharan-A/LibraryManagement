package com.library;

import java.sql.*;
public class Connect {

public static Connection con;

String url="jdbc:mysql://localhost:3306/BookStore";
String uname="root";
String pass="root";


 

public Connection connect_db() {
	
     try {

      Class.forName("com.mysql.cj.jdbc.Driver");  

      con =DriverManager.getConnection(url,uname,pass);

     }
     
    catch(Exception e)
  
    {
    	
     System.out.println(e);
     
     }

return con;

}



}

