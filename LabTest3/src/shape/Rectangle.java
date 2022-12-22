package shape;

public class Rectangle extends Square
{
	int width;
	
	// Parameterized Constructor
	public Rectangle(int length, int width) 
	{
		super(length);
		this.width = width;
		
	}

	// Overriding the area() method
	@Override
	public int area() {
		
		return length*width;
	}

}
