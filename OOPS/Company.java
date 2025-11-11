class Employee{
	String name;
	double baseSalary;
	
	Employee(String name,double baseSalary){
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	double calculateSalary(){
		return baseSalary;
	}
}
class Manager extends Employee{
	double bonus;
	
	Manager(String name,double baseSalary,double bonus){
		super(name,baseSalary);
		this.bonus=bonus;
	}
	
	double calculateSalary(){
		return baseSalary+bonus;
	}
}

class Developer extends Employee{
	double overtimePay;
	
	Developer(String name,double baseSalary,double overtimePay){
		super(name,baseSalary);
		this.overtimePay=overtimePay;
	}
	
	double calculateSalary(){
		return baseSalary+overtimePay;
	}
}

class Company{
	public static void main(String args[]){
		Manager m=new Manager("Satyam",10000,1500);
		System.out.println("Manager: "+m.name+" salary: "+m.calculateSalary());
		
		Developer d=new Developer("Kapil",12000,1600);
		System.out.println("Developer: "+d.name+" salary: "+d.calculateSalary());
	}
	
}