class Bank{
	private static double balance=1000;
	//private- access within same class 
	public static void main(String args[]){
		System.out.println(balance);
	}
}

class User{
	public static void main(String args[]){
		//Bank bank=new Bank();
		//private not access outside other class
		System.out.println(Bank1.amount);
	}
}

