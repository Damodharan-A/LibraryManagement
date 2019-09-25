package com.library;

import java.util.Scanner;

public class Operation {


	Scanner input=new Scanner(System.in);
	
	AddBooks add=new AddBooks();
	
	DisplayAllbooks display=new DisplayAllbooks();
	
	UpdateBooks update =new UpdateBooks();
	
	DeleteBooks delete=new DeleteBooks();
	
	

    public void options() {


System.out.println("Library Management System\n\n"+
                  "1.Add Books\n\n"+
                  "2.List All books\n\n"+
                  "3.Delete Books\n\n"+
                  "4.Update Books\n\n"+
                  "5.Exit\n\n"   );

int choice=input.nextInt();

switch(choice) {

case 1:
	add.add_Books();
	options();
		
case 2:
	display.displayAll();
	options();
	
case 3:
	delete.delete_books();
	options();
	
case 4:
	update.update_books();
	options();
		
case 5:
	default:
		System.out.println("Invalid entry\n\n"+"Enter correcr Number\n");
		options();
		
}
}
}