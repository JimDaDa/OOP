import java.util.*;
import java.lang.*;

public class Bai3{
	
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Enter n= ");
		int n = sc.nextInt();
		
		Vector<Integer> x = new Vector<Integer>(n);
		for (int i=0;i<n;i++){
			x.add(rd.nextInt(10));
		}
		
		int fx;
		Vector<Integer> y = new Vector<Integer>(n);
		for (int j=0;j<n;j++){
			fx = 2*x.get(j)*x.get(j) + 1;
			y.add(j,fx);
		}
		
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}
}