package member;

public class Employee extends Member{

	private String department;
	
	//Parameterized Constructor
	Employee(String name,int age,String phone_no,Address address,long salary,String department)
	{
		super(name,age,phone_no,address,salary);
		this.department=department;
	}
	
	//printing info
	public void print()
	{
		super.print();
		System.out.println("Department :"+department);
	}
	
}
