package JambledLetter;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int number;
		int comb=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			comb=comb*i;
		}
		System.out.println("The number of combination is "+comb);
	}
	

}
