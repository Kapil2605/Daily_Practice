class Flipkart{
	double purchaseAmount;
	
	Flipkart(double amount){
		this.purchaseAmount=amount;
	}
	
	void applyDiscount(){
		if(purchaseAmount>=1000){
			double calculateDiscount=(purchaseAmount*10/100);
			if(calculateDiscount<=500){
				System.out.println("Congrats,You get a discount of "+calculateDiscount+" on shopping of "+purchaseAmount);
				System.out.println("Your Final price after discount: "+(purchaseAmount-calculateDiscount));
			}
			else{
				System.out.println("You get max discount of 500 on this purchase "+purchaseAmount);
				System.out.println("Your Final price after discount: "+(purchaseAmount-500));
			}
		}
		else{
			System.out.println("Oh,Your purchaseAmount is less than 1000");
		}
	}
	
	public static void main(String args[]){
		Flipkart f1=new Flipkart(500);
		f1.applyDiscount();
		Flipkart f2=new Flipkart(1000);
		f2.applyDiscount();
		Flipkart f3=new Flipkart(7000);
		f3.applyDiscount();
	}
}
				
			