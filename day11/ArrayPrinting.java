class ArrayPrinting{
	public static void main(String args[]){
		String words[]={"Welcome","to","Kodewala","Academy"};
		
		for(int i=0;i<words.length;i++){
			System.out.println("Printing:\n "+words[i]);
		}
		
		
		String str="Transforming code into career";
		String[] languages=str.split(" ");
		for(String it:languages){
			System.out.println(it);
		}
	}
	
}