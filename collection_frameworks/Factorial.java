import java.util.Scanner;
class Fact{
	
	static boolean display(int num){
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean value=display(num);
		if(value){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		
		
	}
}
		