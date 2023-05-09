import java.util.*;
public class TestRegularPolygon{
	public static void main (String[] args){
		RegularPolygon s = new RegularPolygon("Qt1",5,3);
		
		System.out.println("Name:"+s.getName());
		System.out.println("EgdeAmount:"+s.getEgdeAmount());
		System.out.println("EgdeLength:"+s.getEgdeLength());
		System.out.println("Polygon:"+s.getPolygon());
		System.out.println("Perimeter:"+s.getPerimeter());
		System.out.println("Area"+s.getArea());
		System.out.println(s.toString());
	}
}