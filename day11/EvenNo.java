class EvenNoPrinting{
	public static void main(String args[]){
		int arr[]={10,13,15,23,45,67,34,24};
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println("This is even: "+arr[i]);
			}
			else{
				System.out.println("Odd no: "+arr[i]);
			}
		}
	}
}