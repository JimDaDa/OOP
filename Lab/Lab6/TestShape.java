public class TestShape{
	public static void main (String[] args){
		Shape a=new Shape("red",true);
		System.out.println("Shape: ");
		System.out.println("Color:"+a.getColor());
		System.out.println("Filled:"+a.isFilled());
		
		
		Circle4 b =new Circle4(12.0,"red",true);
		System.out.println("Circle : ");
		System.out.println("Radius:"+b.getRadius());
		System.out.println("Color:"+b.getColor());
		System.out.println("Filled:"+b.isFilled());
		System.out.println("Area:"+b.getArea());
	    System.out.println("Perimeter:"+b.getPerimeter());
		Rectangle c =new Rectangle(6.0, 12.0);
		System.out.println("Rectangle: ");
		System.out.println("Width:"+c.getWidth());
		System.out.println("Length:"+c.getLength());
		
		Rectangle c1 =new Rectangle(6.0,12.0,"red",true);
		System.out.println("Rectangle: ");
		System.out.println("Width:"+c1.getWidth());
		System.out.println("Length:"+c1.getLength());
		System.out.println("Color:"+c1.getColor());
		System.out.println("Filled:"+c1.isFilled());
		System.out.println("Area:"+c1.getArea());
	    System.out.println("Perimeter:"+c1.getPerimeter());
		
		Square d11 =new Square(6.0);
		System.out.println("Square: ");
		System.out.println("Side:"+d11.getSide());
	     System.out.println("Side:"+d11.getSide());
		
		Square d1 =new Square(6.0,"red",true);
		System.out.println("Square: ");
		System.out.println("Side:"+d1.getSide());
	     System.out.println("Side:"+d1.getSide());
		System.out.println("Color:"+d1.getColor());
		System.out.println("Filled:"+d1.isFilled());
		System.out.println("Area:"+d1.getArea());
	    System.out.println("Perimeter:"+d1.getPerimeter());
	
}
}