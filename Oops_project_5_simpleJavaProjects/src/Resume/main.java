package Resume;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
	public static void main(String[] args) throws IOException {
		String name;
		String age;
		String degree;
		String branch;
		String contactno;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name");
		name=br.readLine();
		System.out.println("Enter your Age");
		age=br.readLine();
		System.out.println("Enter your Degree");
		degree=br.readLine();
		System.out.println("Enter your Branch");
		branch=br.readLine();
		System.out.println("Enter your Contact Number");
		contactno=br.readLine();
		Student ajay=new Student();
		ajay.setName(name);
		ajay.setAge(age);
		ajay.setDegree(degree);
		ajay.setBranch(branch);
		ajay.setContactno(contactno);
		ajay.resume();
	}

}
