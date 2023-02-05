package Assignment;
import java.util.Scanner;
public class ChickenRabbit {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int head,leg,chickcount=0,rabcount=0;
		System.out.println("Enter the number of head in a farm:");	
		head=sc.nextInt();
		System.out.println("Enter the number of leg in a farm:");
		leg=sc.nextInt();
		
		if(head>=leg || leg%2 !=0)
		{
			System.out.println("not a valid number");
		}
		else
		{
			rabcount=(leg-2*head)/2;
			chickcount=head-rabcount;
			System.out.println("Chicken :"+chickcount+" Rabbit :"+rabcount);
		}
	}

}
