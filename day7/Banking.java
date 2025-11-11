class AccessModifier{
	static double defaultVar=1000; //default 
	public static String publicVar="Kapil"; //public 
	private static String privateVar= "Yadav"; //private
	
	public static void main(String args[]){
		//getting default withing same class
		System.out.println("Getting default var: "+AccessModifier.defaultVar);
		//getting public withing same class
		System.out.println("Getting public var: "+AccessModifier.publicVar);
		//not getting private withing same class
		//System.out.println("Getting private var: "+AccessModifier.privateVar);

	}
}