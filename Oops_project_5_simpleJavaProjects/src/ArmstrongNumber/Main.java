package ArmstrongNumber;
import java.util.Scanner;
public class Main {
public static void main(String args[]){
    int number,n,i;
    int digits=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
	number=sc.nextInt();
	n=number;
	while(number!=0) {
		digits=number%10;
		int power=(int) (Math.pow(digits,3));
		sum=sum+power;
		number=number/10;
	}
	System.out.println(sum);
	if(n==sum) {
		System.out.println("The given number is armstrong");
	}
	else {
		System.out.println("The given number is not armstrong");
	}	
}
}
