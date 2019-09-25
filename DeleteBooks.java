package com.library;


import java.sql.*;
import java.util.Scanner;

public class DeleteBooks {


Connect connect=new Connect();

Scanner input=new Scanner(System.in);

Book book=new Book();

PreparedStatement pst;

public void delete_books() {

     try {

        Connection con=connect.connect_db();

        pst=con.prepareStatement(" delete from book where bookId=?");
        
        System.out.println("Enter the id number of the book to delete");
        
        book.setBookId(input.nextInt());
        
        pst.setInt(1, book.getBookId());
        
        int i=pst.executeUpdate();

            if(i!=0)
        {
            	System.out.println("Successfully deleted");
            	
        }
         else {

        System.out.println("Not deleted");
      
   }


}
     catch(Exception e) {

     System.out.println(e);
 
        }


     }

}

