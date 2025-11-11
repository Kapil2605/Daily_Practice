class User{
	public static void main(String args[]){
		//Outside the other class but withing same package
		//getting default
		System.out.println("Getting default var: "+AccessModifier.defaultVar);
		//getting public 
		System.out.println("Getting public var: "+AccessModifier.publicVar);
		//not getting private
		//System.out.println("Getting private var: "+AccessModifier.privateVar);
	}
}