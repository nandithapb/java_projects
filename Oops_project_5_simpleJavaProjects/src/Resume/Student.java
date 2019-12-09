package Resume;

public class Student {
	private String name;
	private String age;
	private String degree;
	private String branch;
	private String contactno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	void resume()
	{
		System.out.println("Name	:"+getName()+"\n"+"Age	:"+getAge()+"\n"+"Degree	:"+getDegree()+"\n"+"Branch	:"+getBranch()+"\n"+"Contact	:"+getContactno());
	}
	
}
