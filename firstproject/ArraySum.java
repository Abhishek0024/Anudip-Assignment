package firstproject;

import java.util.Scanner;

public class ArraySum 
{
		public static void main(String[] args) 
		{
			
			Scanner scan = new Scanner(System.in);
			
			int sum=0;
			System.out.println("Enter no. of elements in Array: ");
			
			int n=scan.nextInt();
			int []arr1=new int[n];
			
			System.out.println("Enter Array elements:");
			
			//Take Input
			for(int i=0;i<n;i++)
			{
				arr1[i]=scan.nextInt();
			}
			
			//
			for(int j=0;j<n;j++)
			{
				sum=sum+arr1[j];
			}
			System.out.println("Sum:"+sum);
			
			scan.close();
			
		}

	}
