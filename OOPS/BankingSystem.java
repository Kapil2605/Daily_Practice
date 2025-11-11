class Account{
	static int balance=100;
	
	static void showBalance(){
		System.out.println("Your Account balance: "+balance);
	}
}
class SavingAccount extends Account{
}

class CurrentAccount extends Account{
}

class Main{
	public static void main(String args[]){
		//CurrentAccount current=new CurrentAccount();
		SavingAccount.showBalance();
		CurrentAccount.showBalance();
	}
}