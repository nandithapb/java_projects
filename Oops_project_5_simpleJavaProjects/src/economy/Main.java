package economy;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number,count = 0;
		double sum=0;
		System.out.println("Enter the number of bowlers");
		number=sc.nextInt();
		double economy[]=new double[number];
		int []run=new int[number];
		int []ball=new int[number];
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<number;i++) {
			run[i]=sc.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<number;i++) {
			ball[i]=sc.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		for(int i=0;i<number;i++) {
			economy[i]=run[i]/(ball[i]/6.0);
			System.out.println(economy[i]);
			}
		for(int i=0;i<number;i++) {
			sum=sum+economy[i];
		}
		double avg=sum/number;
		System.out.println("The overall economy of the team is "+avg);
		for(int i=0;i<number;i++) {
			if(economy[i]<=avg) {
				count++;
			}
		}
		System.out.println("The number of bowlers eligible are "+count);	
	}

}
