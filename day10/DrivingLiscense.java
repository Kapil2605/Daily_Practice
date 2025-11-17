import java.util.Scanner;
class DrivingLicenseApplication{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18 && age<=60){
			System.out.println("You are eligible to apply");
		}
		else{
			System.out.println("Your age must be above 18 years or below 60 years");
		}
	}
}