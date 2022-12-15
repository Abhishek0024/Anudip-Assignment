package matrix;

public class Matrix {
	
	// Main Method
	public static void main(String[] args)
	{
		// size of 3x3 matrix
		int s = 3;
		
		//1st matrix
		int A[][] = { { 100, 200, 300}, 
					  { 400, 500, 600},
					  { 700, 800, 900} 
					};
		// Print the matrices A
		System.out.println("\nMatrix 1:");
		printMatrix(A, s, s);
		
		//2nd matrix
		int B[][] = { { 1, 2, 3}, 
                      { 4, 5, 6},
					  { 7, 8, 9} 
                     };
		
		// Print the matrices B
		System.out.println("\nMatrix 2:");
		printMatrix(B, s, s);

		// Add the two matrices
		int C[][] = add(A, B, s);

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, s, s);
	
	}

	// Method to print Matrix
	public static void printMatrix(int M[][],int rowSize,int colSize)
	{
		for (int i = 0; i < rowSize; i++)
		{
			for (int j = 0; j < colSize; j++)
			{
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Method to add the two matrices
	public static int[][] add(int A[][], int B[][],
					int size)
	{
		int C[][] = new int[size][size];

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		return C;
	}
	
	
}
