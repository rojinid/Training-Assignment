package Assignment;
import java.util.Scanner;
class BMIcal
{
	String name;
	int age=20;
	double weight,height,BMI;
	
	void BMI()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name :");
		name=s.nextLine();
		System.out.println("Enter the Age :");
		age=s.nextInt();
		System.out.println("Enter the Weight :");
		weight=s.nextDouble();
		System.out.println("Enter the Height :");
		height=s.nextDouble();
	}
	void input()
	{
		System.out.println("Name of the Person :"+name);
		System.out.println("Age of the Person :"+age);
		System.out.println("Weight of the Person :"+weight);
		System.out.println("Height of the Person :"+height);
	}
	void getBMIvalue()
	{
		height=height/100;
		height=Math.pow(height, 2);
		BMI=weight/height;
	}
	void BMIstatus()
	{
		if(BMI<18.5)
		{
			System.out.println("Under Weight");
		}
		else if(BMI>=18.5 && BMI<24.9)
		{
			System.out.println("Normal");
		}
		else
		{
			System.out.println("Over Weight");
		}
	}
	
}


public class BMI {

	public static void main(String[] args) 
	{
		BMIcal a=new BMIcal();
		a.BMI();
        a.input();
        a.getBMIvalue();
        a.BMIstatus();
	}

}
