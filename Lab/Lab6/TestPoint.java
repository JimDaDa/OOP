public class TestPoint{
	public static void main (String[] args){
		Point2D a=new Point2D(3.0f,4.0f);
	   
		System.out.println("Point2D: ");
		System.out.println("x:"+a.getX());
		System.out.println("y:"+a.getY());
		a.setXY(3.0f,4.0f);
		System.out.println("xy: "+a);
		
		
		Point3D b =new Point3D(12.0f,4.0f,3.0f);
		
		System.out.println("Point3D: ");
		System.out.println("x:"+b.getX());
		System.out.println("y:"+b.getY());
		System.out.println("z:"+b.getZ());
		b.setXYZ(12.0f,4.0f,3.0f);
		System.out.println("xyz: "+b);
		
	
}
}