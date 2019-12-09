package averagemark;

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
		int sum=0;
	for(int i=0;i<number;i++){
		sum=sum+marks[i];
	  }
    int avg=sum/number;
    System.out.println("The average is "+avg);
	}
}
