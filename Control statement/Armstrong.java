package Assignment;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = num;
        int result = 0;
        int digits = 0;
        while (a != 0) {
        digits++;
        a /= 10;
        }
        a = num;
        while (a != 0) {
            int r = a % 10;
            result +=  Math.pow(r, digits);
            a =a/10;
        }
        
        if (result == num) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}



