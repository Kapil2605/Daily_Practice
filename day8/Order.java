class Order{
	
	private int amount=100; //instance variable
	
	public  void placeOrder(){
		int orderQty=10;	//local variable
		System.out.println("order Quantity: "+orderQty);
	}
	
	void cancelOrder(){
		//Accessing private instance variable inside a method
		System.out.println("Cancel amount: "+amount);
	}
	
	
	
	public static void main(String args[]){
		Order order=new Order();
		System.out.println("Order amount"+order.amount);//instance private var call within class
		//System.out.println(order.orderQty);//local var inside placeOrder cannot be accessed
		order.cancelOrder();
		order.placeOrder();//calling private var using method
	}
		
}