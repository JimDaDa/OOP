public class TestCircleCylinder{
	public static void main (String[] args){
		Circle s =new Circle(12.0);
		System.out.println("Circle:");
		System.out.println("Radius="+s.getRadius());
		Circle s1 =new Circle(12.0," red" );
		System.out.println("Circle:");
		System.out.println("Radius="+s1.getRadius()+ "Color: "+s1.getColor());
		
		Cylinder a=new Cylinder();
		System.out.println("Cylinder: radius "+a.getRadius()+"height= "+a.getHeight()+"base area= "+((Circle) a).getArea()+"volume ="+a.getVolume());
	Cylinder b=new Cylinder(12.0);
	System.out.println("Cylinder: radius "+b.getRadius()+"height= "+b.getHeight()+"base area= "+((Circle) b).getArea()+"volume ="+b.getVolume());
	
	Cylinder c =new Cylinder(3.0,12.0);
	System.out.println("Cylinder: radius "+c.getRadius()+"height= "+c.getHeight()+"base area= "+((Circle) c).getArea()+"volume ="+c.getVolume());
}
}