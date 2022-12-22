package shape;

public class ShapeMain {

	public static void main(String[] args) {
		
		//Instantiating Square and Rectangle
		Square sq = new Square(6);
		Rectangle re = new Rectangle(4,5);
		
		//Printing Area
		System.out.println("Area of square : "+sq.area());
		System.out.println("Area of rectangle : "+re.area());
	}

}
