package pracProgs;

public class StringObjects 
{
	
	/*
	 * 
	 * How many String objects will be created...?
	 * 
	 * Ans:- 3 //This case only.
	 */


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String s1 = "Hello World";
			String s2 = "Hello World";
			String s3 = s1;
			
			String n1 = new String("Hello World");
			String n2 = new String("Hello World");
			
			System.out.println(s1 == s2);
			System.out.println(s2 == s3);
			System.out.println(s3 == s1);
			
			
			System.out.println(n1 == n2);
			

		}

	}

