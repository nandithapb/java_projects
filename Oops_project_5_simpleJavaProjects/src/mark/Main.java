package mark;

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
	for(int j=0;j<number;j++) {
		int temp=0;
	for(int i=j+1;i<number;i++){
		if(marks[j]<=marks[i]){
			temp=marks[j];
			marks[j]=marks[i];
			marks[i]=temp;
		}
	  }
	}
	System.out.println("The priority of marks is");
	for(int i=0;i<number;i++){
		System.out.println(marks[i]);
	}
	}
}
