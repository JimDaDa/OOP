import java.util.Scanner;
public class cau3 {
	public static float tinh(float a){
		float b=0;
		b=(a-32)/1.8f;
		return b;
		
	}
	public static void main  (String [] args ){
		float a;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Nhap do F: ");
		a=sc.nextFloat();
		System.out.print("Chuyen sang do C= " +tinh(a));
	}
}