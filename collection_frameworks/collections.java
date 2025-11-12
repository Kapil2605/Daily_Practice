class Collections{
	
	boolean display(int num){
		
		if(num>15){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		Collections obj=new Collections();
		
		boolean value=obj.display(10);
		if(value){
			System.out.println("Statment: "+value);
		}
		else{
			System.out.println(value);
		}
	}
}