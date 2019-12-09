package retest;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students");
	number=sc.nextInt();
	int marks[]=new int[number];
	System.out.println("Enter the marks of students");
	for(int i=0;i<number;i++){
		marks[i]=sc.nextInt();
	}
	int count=0;
	for(int j=0;j<number;j++) {
		if(marks[j]<=50){
			count++;
		}
	}
	
	System.out.println("Number of students appearing for retest is "+count);
	}
}
