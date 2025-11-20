import java.util.Scanner;
class PasswordReset{
	public static void main(String args[]){
		int passwordCount=5;
		String originalPassword="1234";
		
		Scanner sc=new Scanner(System.in);
		String yourPassword;
		do{
			System.out.println("Enter the password: ");
			yourPassword=sc.nextLine();
			if(originalPassword.equals(yourPassword)){
				System.out.println("Login Successfully!!");
				break;
			}
			else{
				System.out.println("You have "+(passwordCount-1)+" attempt left");
				passwordCount--;
			}
			
		}
		while(passwordCount>0);
		
		if(passwordCount==0){
			System.out.println("Sytem locked");
		}
	}
}