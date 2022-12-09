//3.WAP to find greatest of three numbers using if -else ladder.

package LabTest1;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Taking Input From The User.
		System.out.println("----Enter Three Number To Compare----");
		System.out.print("A = ");
		int a=scan.nextInt(); 
		System.out.print("B = ");
		int b=scan.nextInt();
		System.out.print("c = ");
		int c=scan.nextInt();
		
		
		if(a>b)
		{
			if(b>c)
				System.out.println("A is greatest.");
			else
				System.out.println("C is greatest.");
		}
		else
		{
			if(b>c)
			System.out.println("B is greatest.");
			else
			System.out.print("C is grestest.");
		}

	}

}
