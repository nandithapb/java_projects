package sculptorist;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
	    n=sc.nextInt();
		int sum=0;
		sum=n;
		while(n>=5)
		{
			n=n/5;
			sum=sum+n;			
		}
		//sum=gold+(gold/5);
		System.out.println("Number of Sculptors can be made is "+sum);
		
	}

}
