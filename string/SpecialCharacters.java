package Assignment;
import java.util.Scanner;
public class SpecialCharacters {
	static String moveSpecialCharacters(String s)
	{
		String s1="",s2="";
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if (a>64 && a<=90 || a>96 && a<=122)
			{
				s1=s1+a;
			}
			else
			{
				s2=s2+a;
			}
		}
		return s1+s2;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String s=sc.nextLine();
		System.out.println(moveSpecialCharacters(s));
	}

}
