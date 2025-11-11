class User{
	protected String name;
	protected double baseSalary;
	
	public User(String name,double baseSalary){
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	public double calculateSalary(){
		return baseSalary;
	}
}
class AdminUser extends User{
	protected double bonus;
	
	public AdminUser(String name,double baseSalary,double bonus){
		super(name,baseSalary);
		this.bonus=bonus;
	}
	
	public double calculateSalary(){
		return baseSalary+bonus;
	}
}

class CustomerUser extends User{
	protected double overtimePay;
	
	public CustomerUser(String name,double baseSalary,double overtimePay){
		super(name,baseSalary);
		this.overtimePay=overtimePay;
	}
	
	public double calculateSalary(){
		return baseSalary+overtimePay;
	}
}

class UserClass{
	public static void main(String args[]){
		User m=new AdminUser("Satyam",10000,1500);
		System.out.println("AdminUser: "+m.name+" salary: "+m.calculateSalary());
		
		User d=new CustomerUser("Kapil",12000,1600);
		System.out.println("CustomerUser: "+d.name+" salary: "+d.calculateSalary());
	}
	
}