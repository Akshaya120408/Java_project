package mini;

import java.util.Scanner;

public class finance {
    static Scanner sc = new Scanner(System.in);
    static bank amount = null; // FIX: store bank object

    static void input() {
        System.out.print("Enter the account number : ");
        int act = sc.nextInt();
        System.out.print("Enter the Name : ");
        String name = sc.next();
        System.out.print("Enter the initial deposit amount : ");
        int deposit = sc.nextInt();
        amount = new bank(act, name, deposit); // create account
        System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
    }

    static void operation() {
        if (amount == null) {
            System.out.println("No account is present.");
            return;
        }

        System.out.println("\nOperations:");
        System.out.println("a. Withdraw");
        System.out.println("b. Deposit");
        System.out.println("c. Check Balance");
        System.out.print("Enter your option: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.print("Enter the withdraw amount: ");
                int w = sc.nextInt();
                amount.withdraw(w);
                amount.balance();
                break;
            case 'b':
                System.out.print("Enter the deposit amount: ");
                int d = sc.nextInt();
                amount.deposit(d);
                amount.balance();
                break;
            case 'c':
                amount.balance();
                break;
            default:
                System.out.println("Invalid input...");
        }
    }
}
