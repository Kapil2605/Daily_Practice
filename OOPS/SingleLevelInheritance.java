class SingleInheritance{
	void display(){
		System.out.println("Parent class  ");
	}
	
}
class ChildInheritance extends SingleInheritance{
	
	void display(){
		super.display();
		System.out.println("Child class");
	}
	
}
class SubChildInheritance extends ChildInheritance{
	void display(){
		super.display();
		System.out.println("subchild class  ");
	}
	
	public static void main(String args[]){
		SubChildInheritance ch=new SubChildInheritance();
		ch.display();
	}
	
}
	
	