class  BankAccount{
	private double balance;
	
	public BankAccount(double balance){
		this.balance=balance;
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else{
			System.out.println("Invalid Balance");
		}
	}
	public void withdraw(double amount){
		if(amount<0 || amount>=balance){
			System.out.println("Insufficient balance");
		}
		else{
			balance-=amount;
			System.out.println("Withrawn: "+amount);
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
}
class Main{
	public static void main(String args[]){
		BankAccount acc=new BankAccount(1000);
		System.out.println(acc.getBalance());
		acc.deposit(500);
		acc.withdraw(200);
		System.out.println("Final balance: "+acc.getBalance());
	}
}