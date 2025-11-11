class Order{
	static short id=10;
	static char status[]={'A','D','C'};
	static String name="Kapil Yadav";
	static String  orderBy="Kapil";
	static String address="BTM Layout";
	static String deliveredBy="Zepto";
	
	public static void main(String args[]){
		System.out.println("Your order id: "+id);
		
		for(int i=0;i<status.length;i++){
			System.out.println("Your current order status: "+status[i]);
		}
		System.out.println("Your name: "+name);
		System.out.println("Order by: "+orderBy);
		System.out.println("Your address: "+address);
		System.out.println("Delieved by: "+deliveredBy);
	}
}