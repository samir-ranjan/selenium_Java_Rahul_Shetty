package pracProgs;

public class HelloWrld {

	
	/*
	 * Print hello world without using semicolon(;).
	 */

		public static void main(String[] args) 
		{
			//1st option
			
			if(System.out.printf("hello world" +"\n") == null) {
				
			}
			
			//2nd option
			
			if(System.out.append("hello world" + "\n") == null) {
				
			}
			
			//3rd option
			if(System.out.append("hello world" + "\n").equals(null)) {
				
			}
			
			//4th option
			for(int i = 0; i<1; System.out.println("hello world")) {
				i++;
			}

		}

	
}
