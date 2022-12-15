package member;

public class MemberMain {

	public static void main(String[] args) {
		
		//objects of address 
		Address a1 = new Address("TM 20","Taj Mahal","Agra");
		Address a2 = new Address("H 520","Taj","Mumbai");
		
		//Employee info
		System.out.println("\nEmployee....");
		Employee e = new Employee("Abhishek",20,"0123456789",a1,999999,"Coader");
		e.print();
		
		//Manager info
		System.out.println("\nManager....");
		Manager m = new Manager("Abhi",30,"0987654321",a2,999999,"IT");
		m.print();
		

	}

}
