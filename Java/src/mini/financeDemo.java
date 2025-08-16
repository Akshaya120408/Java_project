package mini;

import java.util.Scanner;

public class financeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        finance.input();       // create account
        finance.amount.display(); // show details of the created account

        String con = "yes";
        while (con.equalsIgnoreCase("yes")) {
            finance.operation();
            System.out.print("Do you want to continue (yes / no): ");
            con = sc.next();
        }

        System.out.println("Thank you for using our banking system!");
    }
}
