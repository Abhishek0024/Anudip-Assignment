package shape;

public class Square implements Shape
{
	
	int length;
	
	 
	Square(int length) 
	{
		this.length = length;
	}

	// Overriding the area() method
	@Override
	public int area() {
	
		return length*length;
	}

}
