package Assignment;
import java.util.Scanner;
public class whitespace {
	static String removeWhiteSpaces(String s)
	{
		s=s.replaceAll(" ", "");
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String s=sc.nextLine();
		System.out.println(removeWhiteSpaces(s));
	}

}