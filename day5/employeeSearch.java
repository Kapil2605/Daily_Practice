import java.util.Scanner;
class EmployeeSearch{
	 int id;
	 String names;
	
	EmployeeSearch(String name,int id){
		this.id=id;
		this.names=name;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		sc.nextLine();
		
		EmployeeSearch employees[]=new EmployeeSearch[size];
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the name for "+i+"th index: ");
			String name=sc.nextLine();
			employees[i]=new EmployeeSearch(name,i+1);;
		}
		
		
		
		
		
		
		System.out.println("Works fine");
		
		for(int i=0;i<employees.length;i++){
			System.out.println(employees[i].names+" "+employees[i].id);
		}
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the name to search: ");
		//String searchName=sc.nextLine();
		
		//boolean found=false;
		
		//for(int i=0;i<employees.length;i++){
		//	if(employees[i].equalsIgnoreCase(searchName)){
		//		found =true;
		//		break;
		//	}
			//if(employees[i]==searchName){
			//	found=true;
			//	break;
			//}
			
		//}
		//System.out.println(found);
		//if(found){
		//	System.out.println("Employee found with name: "+searchName);
		//}
		//else{
		//	System.out.println("Employee not found");
		
		//}
	}
}