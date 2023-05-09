import java.util.*;
import java.util.ArrayList;
import java.lang.*;

public class TestPoint{
	
	public static void main(String []args){
		Random s1 = new Random();
		ArrayList<Point> list = new ArrayList<Point>();
		
		for (int i=0; i<10; i++){
			list.add(new Point(s1.nextDouble()*2,s1.nextDouble()));
		}
		
		for (int j=0; j<list.size(); j++){
			System.out.print(list.get(j).toString() + ":");
			if (list.get(j).isInside())
				System.out.println("Inside");
			else
				System.out.println("Not Inside");
		}		
	}
}
