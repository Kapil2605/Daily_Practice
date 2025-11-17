import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class AuthService{
	 // Dummy user database
    static Map<String, String> userPass = new HashMap<>();
	static Map<String, String> userRole = new HashMap<>();
    
	
	static boolean authenticate(String userName,String password){
		return userPass.containsKey(userName) && userPass.get(userName).equals(password);
	}
	
	static boolean authorize(String userName,String requiredRole){
		return userRole.get(userName).equals(requiredRole);
	}
	
	public static void main(String args[]){
		AuthService.userPass.put("Kapil","1234");
		AuthService.userRole.put("Kapil","ADMIN");
		
		AuthService.userPass.put("gaurav", "1111");
		AuthService.userRole.put("gaurav", "USER");
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter username: ");
		String userName=sc.nextLine();
		
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		
		// Step 1: Authentication
        if (AuthService.authenticate(userName, password)) {
            System.out.println("✔ Login Successful!");
			
			// Step 2: Authorization
            System.out.println("Enter required role (ADMIN/USER): ");
            String requiredRole = sc.nextLine();

            if (AuthService.authorize(userName, requiredRole)) {
                System.out.println("✔ Access Granted: You are " + requiredRole);
            } else {
                System.out.println("❌ Access Denied: You are not " + requiredRole);
            }
		}
		else{
			System.out.println("Invalid userName or password");
		}
		
	}
	
  
}