package com.library;


import java.sql.*;
import java.util.Scanner;


public class AddBooks {


Scanner input=new Scanner(System.in);

Book book=new Book();

Connect connect=new Connect();

PreparedStatement pst;

public void add_Books() {

         
    System.out.println("Enter the book ID");
    book.setBookId(input.nextInt());
    
    System.out.println("Enter the book Name");
    book.setBookname(input.next());
    
    System.out.println("Enter the author name");
    book.setAuthorname(input.next());
    
    System.out.println("Enter the no of pages");
    book.setPages(input.nextInt());
    
    try {

        Connection con=connect.connect_db();

    pst=con.prepareStatement("insert into books values (?,?,?,?)");

    pst.setInt(1, book.getBookId());

    pst.setString(2, book.getBookname());

    pst.setString(3, book.getAuthorname());

    pst.setInt(4, book.getPages());

    int i=pst.executeUpdate();

     if(i!=0)
    	 
      {
    	 System.out.println("Data inserted");
    	 
       }
else {

       System.out.println("No data inserted");

}
     
}
catch(Exception e){

System.out.println(e);

     }
   }

}

