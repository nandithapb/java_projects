package NCR;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int n,r;
		long ncr;
		long nfac=1,rfac=1,nrfac=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the value of r");
		r=sc.nextInt();
		for(int i=1;i<=n;i++) {
			nfac=nfac*i;	
		}
		System.out.println(nfac);
		for(int i=1;i<=r;i++) {
			rfac=rfac*i;	
		}
		System.out.println(rfac);
		for(int i=1;i<=(n-r);i++) {
			nrfac=nrfac*i;	
		}
		ncr=nfac/(rfac*nrfac);
		System.out.println("The NCR factor for given values is "+ncr);
	}
}
		
