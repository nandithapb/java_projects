package greatestBid;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number of applications");
		number=sc.nextInt();
		System.out.println("Enter the amount(in crores)");
		int []amount=new int[number];
		for(int i=0;i<number;i++) {
			amount[i]=sc.nextInt();
		}
		int temp;
		temp=amount[0];
		for(int i=1;i<number;i++) {
			if(amount[i]>=temp) {
				temp=amount[i];
			}
		}
		System.out.println("The winning bid is "+temp+" crores");
	}
}
