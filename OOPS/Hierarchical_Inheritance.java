class Account{
	void display(){
		System.out.println("Parent class  ");
	}
	
}
class PremiumAccount{
	void display(){
		System.out.println("PremiumAccount class  ");
	}
	
}
class SavingAccount{
	void display(){
		System.out.println("SavingAccount class  ");
	}
	
}

class Main{
	public static void main(String args[]){
		PremiumAccount ac=new PremiumAccount();
		ac.display();
		SavingAccount acs=new SavingAccount();
		acs.display();
	}
	
}
