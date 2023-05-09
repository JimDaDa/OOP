public class Test2{
	public static void main(String[] args){
		Shape2 a = new Circle2(3.0,"Red",true);
		System.out.println(a.toString());
		System.out.println("Area = "+a.getArea());
		System.out.println("Perimeter = "+a.getPerimeter());
		System.out.println("\n");
		
		Shape2 b = new Rectangle2(3.0,4.0,"Black",true);
		System.out.println(b.toString());
		System.out.println("Area = "+b.getArea());
		System.out.println("Perimeter = "+b.getPerimeter());
		System.out.println("\n");
		
		Shape2 c = new Square2(6.0,"Blue",true);
		System.out.println(c.toString());
		System.out.println("Area = "+c.getArea());
		System.out.println("Perimeter = "+c.getPerimeter());
	}
}