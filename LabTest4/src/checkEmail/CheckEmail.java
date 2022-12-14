package checkEmail;
import java.util.Scanner;

public class CheckEmail {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter emailId
		System.out.print("Enter emailId :");
		String email = sc.next();
		
		// check if there is an exception 
		try 
		{ 
			if (!email.contains(".") || !email.contains("@") || !email.substring(email.indexOf("@")).contains("."))
			{
				throw new InvalidMailIdException("Invalid email id"); 
			}
			System.out.println("valid!!");
		} 
		
		catch (InvalidMailIdException e) 
		{
			System.out.println(e); 
		}
			    
		finally
		{
			sc.close(); 
		}
		
		
	}
}
