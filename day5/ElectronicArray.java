class ElectronicItems{
	public static void main(String args[]){
		String products[]={"Laptop","Smartphone","Tablet","SmartWatch","Headphones"};
		int prices[]={50000,30000,20000,15000,100000};
		
		//varaible to store highest prices
		int maxPriceIndex=0;
		for(int i=0;i<products.length;i++){
			if(prices[i]>prices[maxPriceIndex]){
				maxPriceIndex=i;
			}
		}
		System.out.println("The product with highest price is: "+products[maxPriceIndex]+ " with price: "+prices[maxPriceIndex]);
	}
}