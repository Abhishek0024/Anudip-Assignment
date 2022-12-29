package duplicateChara;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter a string
		System.out.print("Enter a String :");
		String str = sc.next();
		
		// Convert string to char array
		char[] ch = str.toCharArray();
		
		
		System.out.println("String :" + str);
		System.out.print("Duplicate Characters: ");
		
		// Calling Method
		checkDuplicate(str,ch);
		
		sc.close();
		
	}
	
	// Method to check duplicate character in array
	public static void checkDuplicate(String str,char[] ch)
	{
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
	            if (ch[i] == ch[j]) 
	            {
	               System.out.print(ch[j] + " ");
	               break;
	            }
			}
		}
		
	}

}
