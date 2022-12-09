//2.WAP to perform operations (+,-,*,/,%)on two numbers using switch case.

package LabTest1;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Taking input from the user for both numbers.
		System.out.println("----Enter The Numbers-----");
		System.out.print("First Number: ");
		int a=scan.nextInt();
		System.out.print("Second Number: ");
		int b=scan.nextInt();
		
		//For Space
		System.out.println("");
		
		System.out.println("Choose any option corresponding to the arthematic operation: ");
		//Options To Choose
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multipilcation");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		

		int n=scan.nextInt();
		
		//User Choice will be stored in 'n' and used in switch.
		switch(n)
		{
		case 1:
			System.out.println("Addition: "+(a+b));
			break;
		case 2:
			System.out.println("Substraction: "+(a-b));
			break;
		case 3:
			System.out.println("Multipilcation: "+(a*b));
			break;
		case 4:
			System.out.println("Division: "+(a/b));
			break;
		case 5:
			System.out.println("Modulus: "+(a%b));
			break;
			
		default :
			System.out.println("Wrong Choice");
		}
	}

}
