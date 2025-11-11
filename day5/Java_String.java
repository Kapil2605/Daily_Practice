class Java_Strings{
	public static void main(String args[]){
		String s1="Kodewala";
		String s2=new String("kodewala");
		String s3="Kodewala";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String s4=s1.concat(" Academy");
		System.out.println(s4);
	}
}
	