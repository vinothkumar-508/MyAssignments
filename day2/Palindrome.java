package day2;

public class Palindrome {


		public static void main(String[] args) {
		int n1 = 121;
		int rem = 0;
		while (n1 > 0)
		{
		    rem = (rem * 10) + n1%10;
		    n1 = n1/10;
		}
		if (n1!=rem) {
			System.out.println("Is the palindrome");
			
		} 
		else {
			System.out.println("Is not the Palindrome");

		}
	
	}

}
