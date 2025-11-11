class DataTypes{
	//primitive data type
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static float floatVar;
	static char charVar;
	static long longVar;
	static double doubleVar;
	static String stringVar;
	static boolean booleanVar;
	
	//non premitive data type
	static int arr[];
	static String str[];
	static DataTypes dataType;
	
	public static void main(String args[]){
		//non primitive data types
		System.out.println("Array default Value: "+arr);
		System.out.println("String default Value: "+str);
		System.out.println("Datatypes class default Value: "+dataType);
		
		System.out.println("Byte default Value: "+byteVar);
		System.out.println("short default Value: "+shortVar);
		System.out.println("int default Value: "+intVar);
		System.out.println("float default Value: "+floatVar);
		System.out.println("char default Value: "+charVar);
		System.out.println("long default Value: "+longVar);
		System.out.println("double default Value: "+doubleVar);
		System.out.println("string default Value: "+stringVar);
		System.out.println("boolean default Value: "+booleanVar);
		
	}
}