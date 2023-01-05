package myThread;

public class MyFriends extends Thread {
	
	// Method to print names
	@Override
	public void run()
	{
		String[] frndArr = {"Gopal","Laxman","Madhav","Lucky","Bunty","Amar","Siya","Ram","Lakhan","Rajat"};
		
		for (String name : frndArr) 
		{
		    System.out.println(name);
		}
	}

}
