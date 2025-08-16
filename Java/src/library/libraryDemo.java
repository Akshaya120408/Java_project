package library;

import java.util.Scanner;

public class libraryDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String con = "yes";
        while (con.equalsIgnoreCase("yes")) {
        	details.operation();
        	System.out.println("\nDo you want to continue? (yes/no): ");
            con = sc.next();
        }
        System.out.println("Thank you for using Library System!");
    }
        
}
