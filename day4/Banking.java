class Customer{
	public static void main(String args[]){
		
		String firstName=args[0];
		String lastName=args[1];
		int accountNo=Integer.parseInt(args[2]);
		String address=args[3];
	
		System.out.println(" Data Recieved: "+firstName+" "+lastName+" "+accountNo+" "+address);
		
	}
}