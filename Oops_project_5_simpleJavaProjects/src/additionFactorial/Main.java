package additionFactorial;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number,sum=0;
		do {
		System.out.println("Enter a number");
		number=sc.nextInt();
		}while(number<0);
		
		for(int i=0;i<=number;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
		
	}
}
		