import java.util.Scanner;
class Bank{
	static int myBalance;
	static int friendBalance;
	
	static void account(int amount){
		System.out.println("My Current Balance after debited:"+(myBalance-amount));
		System.out.println("Friend current balance after credited:"+(friendBalance+amount));
	}
	
	public static void main(String args[]){
		Bank.myBalance=1000;
		Bank.friendBalance=200;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Your current account balance: "+myBalance);
		System.out.println("Your friend account balance: "+friendBalance);
		System.out.println("Enter the amount for transaction: ");
		int amount=sc.nextInt();
		
		account(amount);
		
	}
}