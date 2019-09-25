package com.library;


import java.sql.*;

   public class DisplayAllbooks {

	   Connect connect=new Connect();

     public void displayAll() {
    	 
    try {
    	
    Connection con=connect.connect_db();

    Statement st=con.createStatement();

    ResultSet rs=st.executeQuery("Select * from books");

    while(rs.next()) {

    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));

         }

      } catch (Exception e) {;


     System.out.println(e);
     
    }

   }

}

