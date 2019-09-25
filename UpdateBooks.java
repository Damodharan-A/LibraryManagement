package com.library;

import java.sql.*;
import java.util.Scanner;

public class UpdateBooks {
	

	Scanner input=new Scanner(System.in);

	Book book=new Book();

	Connect connect=new Connect();

	PreparedStatement pst;

public void update_books() {
	
	
	try {
		
		Connection con =connect.connect_db();
		
		pst=con.prepareStatement("update book set bookname=?,authorname=?,where bookId=?");
		
		pst.setString(1, book.getBookname());
		
		pst.setString(2, book.getAuthorname());
		
		pst.setInt(3, book.getBookId());
		
			
		int i=pst.executeUpdate();
	

         if(i!=0)
     {
         	System.out.println("Successfully updated");
         	
     }
      else {

     System.out.println("Not updated");
   
}
		
	}
	catch(Exception e) {
		
		System.out.println(e);
		
	}
}

}
