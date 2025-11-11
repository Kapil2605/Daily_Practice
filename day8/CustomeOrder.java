class Order{
	private int orderId=12;
	String itemName="Pizza";
	short qty=2;
	double itemPrice=100;
	static int gst=18;
	
	void display(){
		itemPrice=itemPrice*qty;
		double finalPrice=itemPrice+(itemPrice*18/100);
		
		System.out.println("Your Order id: "+orderId);
		System.out.println("Item Name: "+itemName);
		System.out.println("Order quantity: "+qty);
		System.out.println("Item price of qty: "+qty+" : "+itemPrice);
		System.out.println("Final price after gst of "+gst+"%: "+finalPrice);
	}
	
	public static void main(String args[]){
		Order order=new Order();
		order.display();
	}
}
