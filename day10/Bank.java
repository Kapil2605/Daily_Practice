//Develop banking payment app
import java.util.Scanner;
import java.util.List;

class BankApp{
	static void display(String paymentType,List<String>paymentList){
		if(paymentList.contains(paymentType)){
			System.out.println("You have choosen: "+paymentType);
		}
		else{
			System.out.println("new payment type found: "+paymentType);
		}
		
		
		

	}
	public static void main(String args[]){
		System.out.println("Welcome to Banking Payment App: ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter payment type: ");
		String paymentType=sc.nextLine();
		
		List<String> paymentList = List.of("CreditCard", "DebitCard", "NetBanking");

	
		BankApp.display(paymentType,paymentList);
	}
	
}
