package perfectnumber;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number,sum=0;
		System.out.println("Enter a number");
		number=sc.nextInt();
		System.out.print("The divisors of the number are");
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				System.out.print(" "+i);
	           sum=sum+i;
			}
		}
		System.out.println("\nThe sum of the divisors are "+sum);
		if(sum==number) {
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}

}
