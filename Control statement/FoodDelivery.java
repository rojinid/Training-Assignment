package Assignment;
import java.util.Scanner;
class restaurant{
	private char type;
	int noOfPlates=0, VBill =-1, NBill =-1, totalBill=-1;
	restaurant(char type) {
	this.type = type;
	}
	public char getType() {
	return type;
	}
	public int setType(char type) {
		this.type = type;
		if(type=='v'||type=='V')
		return veg();
		else if(type=='n'||type=='N')
		return nonVeg();
		else
		{
			System.out.println("Invalid food type");
		    return -1;
		}
	}

	int veg() {	
		System.out.println("Enter the num of Veg plates($12 per plate)");
		Scanner sc = new Scanner(System.in);
		noOfPlates = sc.nextInt();
		VBill = noOfPlates * 12;	
		return VBill;
	}
	
	int nonVeg()
	{
		System.out.println("Enter the num of Non Veg plates($15 per plate)");
		Scanner sc = new Scanner(System.in);
		noOfPlates = sc.nextInt();
		NBill = noOfPlates * 15;
		return NBill;
	}	
}
public class FoodDelivery {

	public static void main(String[] args) {
		char foodType, delivery;
		int Bill=-1, Kms=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Food Type(V/N) V-veg,N-nonveg: ");
		foodType = sc.next().charAt(0);
		restaurant type =new restaurant(foodType);
		Bill= type.setType(foodType);
		System.out.println("Your Food bill is: "+ Bill );
		
		while(Bill>0)
		{
			System.out.println("For Delivery Type 'Y' ");
			delivery = sc.next().charAt(0);
	
			if(delivery=='y'||delivery=='Y') {
				System.out.println("Enter the number of Kms: ");
				Kms = sc.nextInt();
				if(Kms<=3)
					System.out.println(" Your Total Bill is: "+Bill);
				else if(Kms>3&& Kms<=6)
					System.out.println(" Your Total Bill is: "+(Bill+Kms));
				else if(Kms>6)
					System.out.println(" Your Total Bill is: "+(Bill+(Kms*2)));
			}
			else if(delivery=='n'||delivery=='N') {
				System.out.println("Thank you");
			}
			else
				System.out.println("Enter valid response");
			break;
		}
	}
}

