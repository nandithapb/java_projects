package height;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students");
	number=sc.nextInt();
	double heights[]=new double[number];
	System.out.println("Enter the heights of students");
	for(int i=0;i<number;i++){
		heights[i]=sc.nextDouble();
	}
	for(int j=0;j<number;j++) {
		double temp=0;
	for(int i=j+1;i<number;i++){
		if(heights[j]>=heights[i]){
			temp=heights[j];
			heights[j]=heights[i];
			heights[i]=temp;
		}
	  }
	}
	for(int i=0;i<number;i++){
		System.out.println(heights[i]);
	}
	}
}
