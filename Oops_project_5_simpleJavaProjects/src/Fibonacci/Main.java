package Fibonacci;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	number=sc.nextInt();
	int p1=0,p2=1,p3;
	
	System.out.print("The fibonacci series is "+p1+" "+p2);
	for(int i=0;i<=number;i++) {
		p3=p1+p2;
		System.out.print(" "+p3);
		p1=p2;
		p2=p3;
		}
	}
}
