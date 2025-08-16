package mini;

public class bank {
    private int act;
    private String name;
    private float balance;

    public bank(int act, String name, int deposit) {
        this.act = act;
        this.name = name;
        this.balance = deposit;
    }

    void display() {
        System.out.println();
        System.out.println("------ACCOUNT DETAILS-------");
        System.out.println("Account number : " + act);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
        System.out.println("-----------------------------");
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE...");
        } else {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited : " + amount);
    }

    void balance() {
        System.out.println("Updated Balance : " + balance);
    }
}
