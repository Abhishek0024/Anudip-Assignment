package alternate;

public class Alternate 
{
	
	public static void main(String[] args) 
	{
		// Initialize arrays
		int []arr = {10,20,30,40,50,60,70,80,90,100};
		int l = arr.length/2;
		int []arr_alt = new int[l];
		alternateArray(arr,arr_alt);
		sumofArray(arr_alt);
		
	}
	
	//  method to sum the alternate element
	public static void sumofArray(int []arr2) 
	{
		int sum=0;
		for(int i=0; i<arr2.length;i++) {
			sum=sum+arr2[i];
		}
		System.out.print("Sum of Alternate Array Element = "+sum);
	}
	
	
	// method for store the alternate element
	public static void alternateArray(int arr[],int arr_alt[]) {
		int j=0;
		for(int i=0; i<arr.length;i+=2,j++) 
		{
			arr_alt[j]=arr[i];
		}
		
	}
	
	
}