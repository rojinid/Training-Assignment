package Assignment;
import java.util.Scanner;
public class Palindrome {
		public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int t=num, a = 0;
	    while (num != 0) {
	        a = a * 10 + num % 10;
	        num /= 10;
	    }
	    if(a == t)
	    	System.out.println("Yes palindrome number");  
	    else
	    	System.out.println("Not a palindrome number");
		
		}
	}