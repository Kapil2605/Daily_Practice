class Company{
	String name;
	
	Company(String name){
		this.name=name;
	}
}
class Employee extends Company{
	
	String employeeName;
	
	Employee(String name,String employeeName){
	super(name);
	this.employeeName=employeeName;
	}
	
	void employeeDetails(){
		System.out.println("Employee: "+name+" with employeeDetails: "+employeeName);
	}
}

class Main{
	public static void main(String args[]){
		Employee e1=new Employee("Google","Kapil Khola");
		e1.employeeDetails();
	}
	
}
		
	