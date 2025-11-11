class ATM{
	private double balance=1000;
	private String pin="1234";
	
	public void withdrawn(double amount,String enteredPin){
		System.out.println("Current balance: "+balance);
		if(enteredPin.equals(pin) && amount<=balance){
			balance-=amount;
			System.out.println("Balance post withdrawn: "+balance);
		}
		else{
			System.out.println("Incorrect PIN or insufficient balance");
		}
	}
	
	public void deposit(double amount,String enteredPin){
		System.out.println("Current balance: "+balance);
		if(enteredPin.equals(pin)){
			balance+=amount;
			System.out.println("Balance post deposit: "+balance);
		}
		else{
			System.out.println("Incorrect PIN or insufficient balance");
		}
	}
}

class User{
	public static void main(String args[]){
		ATM atm=new ATM();
		//atm.balance=1200;
		atm.deposit(120,"1234");
		atm.withdrawn(200,"1234");
	}
}