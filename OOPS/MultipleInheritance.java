interface MultipleInheritanceClass1{
	default void display(){
		System.out.println("MultipleInheritanceClass1 class  ");
	}
}
interface MultipleInheritanceClass2{
	default void display(){
		System.out.println("MultipleInheritanceClass2 class  ");
	}
}

class ChildClass implements MultipleInheritanceClass1,MultipleInheritanceClass2{
	public void display(){
			System.out.println("ChildClass resolved");
	}
	
	public static void main(String args[]){
		ChildClass ch=new ChildClass();
		ch.display();
	}
}
