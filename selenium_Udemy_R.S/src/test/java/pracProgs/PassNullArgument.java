package pracProgs;

public class PassNullArgument {

	public static void main(String[] args) 
	{

		//public static void main(String a[]) {
			test(null);
		}

		public static void test(Object o) {
			System.out.println("Object Argument.");
		}
		
		public static void test(String s) {
			System.out.println("String Argument.");
		}
		
	}


