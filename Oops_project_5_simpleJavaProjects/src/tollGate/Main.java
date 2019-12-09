package tollGate;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int number,count1=0,count2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		number=sc.nextInt();
		int fare[]= new int[number];
		System.out.println("Enter the fare collected for each vehicles");
		for(int i=0;i<number;i++) {
			fare[i]=sc.nextInt();
		}
		for(int i=0;i<number;i++) {
			if(fare[i]>=50) {
				count1++;
			}
			else if(fare[i]<50 && fare[i]!=0) {
				count2++;
			}
		}
		System.out.println("Number of heavy vehicles "+count1+" and the number of light weight vehicles is "+count2);
	}

}
