class Bank{
	String bankName;
	
	Bank(String bankName){
		this.bankName=bankName;
	}
}
class Customer extends Bank{
	
	String customerName;
	
	Customer(String bankName,String customerName){
		super(bankName);
		this.customerName=customerName;
	}
	
	void display(){
		System.out.println("Customer: "+customerName+" with bankName: "+bankName);
	}
	
	public static void main(String args[]){
		Bank sbi = new Bank("SBI");
		
		Customer c1=new Customer(sbi.bankName,"Kapil");
		Customer c2=new Customer(sbi.bankName,"Rahul");
		c1.display();
		c2.display();
	}
}