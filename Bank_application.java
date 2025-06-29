package mini;

import java.util.Scanner;

class Bank {
	private int act ;
	private String name ;
	private float balance ;
	public Bank(int act , String name ,int deposit) {
		this.act = act;
		this.name = name ;
		this.balance = deposit ;
	}
	void display() {
		System.out.println();
		System.out.println("------ACCOUNT DETAILS------- ");
		System.out.println();
		System.out.println("Account number :"+ act);
		System.out.println("Name :"+ name);
		System.out.println("Balance :"+ balance);
		System.out.println();
		System.out.println("*************************************");
		System.out.println();


	}
	void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("INSUFFICIENT BALANCE......");
		}
		else {
			balance-=amount;
			System.out.println("Withdrawed : "+amount);
		}
	}
	void deposit(int amount) {
		balance+=amount;
		System.out.println("Deposited : "+amount);
		
	}
	void balance() {
		System.out.println("Upadated Balance : "+balance);
	}
}
public class finance {
	static Scanner sc = new Scanner (System.in);
	static Bank amount = null;
	static void input() {
		System.out.print("Enter the account number : ");
		int act = sc.nextInt();
		System.out.print("Enter the Name : " );
		String name = sc.next();
		System.out.print("Enter the initial deposit amount : ");
		int deposit = sc.nextInt(); 
		amount = new Bank(act, name, deposit);

		System.out.println("ACCOUNT CREATED SUCESSFULLY............ :");
	}
	static void operation() {
		if(amount == null) {
			System.out.println("No account is present");
		}
		System.out.println("Operators");
		System.out.println("a.Withdraw");
		System.out.println("b.Deposit");
		System.out.println("c.Check Balance");
		System.out.println("Enter your option :");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Enter the withdraw amount :");
			int w = sc.nextInt();
			amount.withdraw(w);
			amount.balance();
			break;
		case 'b':
			System.out.println("Enter the deposit amount :");
			int d = sc.nextInt();
			amount.deposit(d);
			amount.balance();
			break;
		case 'c':
			amount.balance();
			break;
		default:
			System.out.println("X Invalid input...");
		}

	}
	public static void main(String[] args) {
		input();
		amount.display();
		String con = "yes";
		while(con.equals("yes")) {
			operation();
			System.out.println("Do you want to continue (yes / no) :");
			con = sc.next();
		}
		System.out.println("Thanking for using our banking system............");
	}
}

OUTPUT :

Enter the account number : 1234
Enter the Name : akshaya
Enter the initial deposit amount : 1000
ACCOUNT CREATED SUCESSFULLY............ :

------ACCOUNT DETAILS------- 

Account number :1234
Name :akshaya
Balance :1000.0

*************************************

Operators
a.Withdraw
b.Deposit
c.Check Balance
Enter your option :
a
Enter the withdraw amount :
700
Withdrawed : 700
Upadated Balance : 300.0
Do you want to continue (yes / no) :
yes
Operators
a.Withdraw
b.Deposit
c.Check Balance
Enter your option :
b
Enter the deposit amount :
1300
Deposited : 1300
Upadated Balance : 1600.0
Do you want to continue (yes / no) :
yes
Operators
a.Withdraw
b.Deposit
c.Check Balance
Enter your option :
c
Upadated Balance : 1600.0
Do you want to continue (yes / no) :
no
Thanking for using our banking system............
