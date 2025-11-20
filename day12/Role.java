import java.util.Scanner;
class RoleBasedSwitch{
	public static void main(String args[]){
		System.out.println("Welcome to Kodewala Academy");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role: ");
		String role=sc.nextLine();
		
		switch(role){
			case "USER" : System.out.println("You are user: allow to view your details!!");
			break;
			default:System.out.println("Unknown role found!!");
			break;
			case "ADMIN" : System.out.println("You are admin: allow to view other details also!!");
			break;
			case "SUPER ADMIN": System.out.println("You are super admin: allow to modify other details also!!");
			break;
			
		}
	}
	
}