package Assignment;
import java.util.Scanner;

public class Luckynumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		int r=0,d,pos=1,org,count=0;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		org=num;
		while(num!=0)
		{
			d=num%10;
			num=num/10;
			count++;
		}
		while(org!=0)
		{
			d=org%10;
			org=org/10;
			if(count%2==0)
			{
			if(pos%2==1)
			{
				r+=Math.pow(d, 2);
			}
			}
			else
			{
				if(pos%2==0)
					r+=Math.pow(d, 2);	
			}
			pos++;
			
		}
		if(r%9==0)
		    System.out.println("The number is lucky number");
		else
			System.out.println("The number is not lucky number");	

	}

}
