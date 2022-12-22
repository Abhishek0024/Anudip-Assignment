package Person;

public class PersonMain {

	public static void main(String[] args) {
		
		// String Array for Subjects
		String subject1[] = new String[]{"Math", "Physics", "Chemistry"};
		String subject2[] = new String[]{"Computer Science", "History", "Geography"};
		
		
		// Instantiating Students
		Student student1 = new Student("Peter Parker", 20, "1234567890", 1,subject1);
		Student student2 = new Student("Mary Jane", 21, "0987654321", 2,subject2);
		  
		// Printing Info
		System.out.println(student1);
		System.out.println(student2);

	}

}
