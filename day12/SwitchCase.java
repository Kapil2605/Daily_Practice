class SwitchCase{
	public static void main(String args[]){
		int amount=Integer.parseInt(args[0]);
		int discount=Integer.parseInt(args[1]);
		
		switch(discount){
			case 10:System.out.println("Final Amount after "+discount+"% "+(amount-discount));
			break;
			case 15:System.out.println("Final Amount after "+discount+"% "+(amount-discount));
			break;
			default:System.out.println("Unknown discount not valid for this purchase");
			break;
		}
	}
	
}