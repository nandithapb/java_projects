package LeapYear;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		year=sc.nextInt();
		if( (year%400==0) || ((year%4==0) && (year%100!=0))) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		
	}

}
