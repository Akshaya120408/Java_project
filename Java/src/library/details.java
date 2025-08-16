package library;

import java.util.Scanner;

public class details {
	static Scanner sc = new Scanner(System.in);
	static int ch;
	static int count=0 ;
	static book []array = new book[100] ;
	
	
	static void displayall() {
		if(count==0) {
			System.out.println("No Books Available");
		}
		else {
			for(int i =0 ;i<count;i++) {
				array[i].display();
			}
		}
	}
	
	static void searchbook() {
		System.out.println("Enter book id :");
		int id = sc.nextInt();
		for(int i =0 ;i<count;i++) {
			if(array[i].getId()==id) {
				array[i].display();
				return;
			}
			
		}
		System.out.println("Book not found....!");
	}
	
	
	static void borrowbook() {
		System.out.println("Enter book id :");
		int id = sc.nextInt();
		for(int i =0 ;i<count;i++) {
			if(array[i].getId()==id) {
				if(array[i].getCopies()>0) {
					array[i].setCopies(array[i].getCopies()-1);
					System.out.println("Book Borrowed Successfully....!");
				}
				else {
					System.out.println("No Copies available....!");
				}
				return;
			}
			
		}
		System.out.println("Book not found......!");
	}
	
	
	static void returnbook() {
		System.out.println("Enter book id :");
		int id = sc.nextInt();
		for(int i =0 ;i<count;i++) {
			if(array[i].getId()==id) {
					array[i].setCopies(array[i].getCopies()+1);
					System.out.println("Book returned Successfully....!");
					return;
			}
			
		}
		System.out.println("Book not found......!");
	}
	
	
	static void input() {
		System.out.println("Enter the Book Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book Title :");
		String title = sc.nextLine();
		System.out.println("Enter the Book Author :");
		String author = sc.nextLine();
		System.out.println("Enter copies :");
		int copies = sc.nextInt();
		array[count] = new book(id,title,author,copies);
		count++;
		System.out.println("Book added successfully!");
	}
	
	
	static void operation() {
		System.out.println("\n--- Library Menu ---");
        System.out.println("1. Add Book");
        System.out.println("2. Display All Books");
        System.out.println("3. Search Book");
        System.out.println("4. Borrow Book");
        System.out.println("5. Return Book");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
        ch= sc.nextInt();
		switch(ch) {
			case 1:
				input();
				break;
			case 2:
				displayall();
				break;
			case 3 :
				searchbook();
				break;
			case 4:
				borrowbook();
				break;
			case 5 :
				returnbook();
				break;
			case 6:
			    System.out.println("Exiting...");
			    System.exit(0);
			    break;

		}
	}
	
}
