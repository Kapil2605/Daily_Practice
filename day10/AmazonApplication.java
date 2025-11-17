import java.util.Scanner;
class AmazonApplication{
	static void display(int amount){
		if(amount<=1000){
			System.out.println("No discount on shopping less than 1000");
		}
		else if(amount>1000 && amount<=5000){
			System.out.println("10% discount on this product");
			System.out.println("Your total amount after discount: "+(amount-(amount/10)));
		}
		else if(amount>5000){
			int calculateDiscount=(amount*15/100);
			
			if(calculateDiscount<1000){
			System.out.println("15% discount on this product");
			System.out.println("Your total amount after discount: "+(amount-(amount*15/100)));
			}
			else{
				System.out.println("Only 1000 will be applicable");
				System.out.println("Your total amount after discount: "+(amount-1000));
			}
		}

	}
	
	
	public static void main(String args[]){
		System.out.println("Welcome to Amazon");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amount: ");
		int amount=sc.nextInt();
		
		AmazonApplication.display(amount);
	}
}