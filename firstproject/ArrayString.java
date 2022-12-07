package firstproject;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		String fname[]= {"Abhishek","Gopal","Ankit","Vipin"};
		String lname[]= {"Rana","Suri","Jaiswal","Kumar"};
		
		for(int i=0;i<fname.length;i++,n++)
		{
			System.out.println(n+"."+fname[i]+" "+lname[i]);
			n++;
		}
		
		
	}

}
