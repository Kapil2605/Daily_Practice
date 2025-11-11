class Customer{
 public static void main(String args[]){
	//System.out.println("Welcome to " + args[0]+" "+ args[1] + " " +args[2]+ " " +args[3]);
	
	if(args.length>0){
	System.out.print("Hello ");
	for(int i=0;i<args.length;i++){
		System.out.print(args[i] + " ");
	}
	}
	else{
		System.out.println("Please enter the input");
	}
}
}