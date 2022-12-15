package member;

public class Manager extends Member {

	private String specialization;
	
	//Parameterized Constructor
	Manager(String name,int age,String phone_no,Address address,long salary,String specialization)
	{
		super(name,age,phone_no,address,salary);
		this.specialization=specialization;
	}
	
	//printing info
	public void print()
	{
		super.print();
		System.out.println("Specialization :"+specialization);
	}
}
