package boxing;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number of players");
		number=sc.nextInt();
		System.out.println("Enter the number of fouls made by each player");
		int []amount=new int[number];
		for(int i=0;i<number;i++) {
			amount[i]=sc.nextInt();
		}
		int temp,i;
		temp=amount[0];
		for(i=1;i<number;i++) {
			if(amount[i]<=temp) {
				temp=amount[i];
			}
		}
		for(i=0;i<number;i++) {
			if(amount[i]==temp) {
				break;
			}
		}
		System.out.println("The eligible player is player no:"+(i+1)+"("+temp+" fouls)");
	}
}