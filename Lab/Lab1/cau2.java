import java.util.Scanner;
public class cau2 {
	public static int tinh(int a,int b){
		int c=0;
		c=a*b;
		return c;
	}
	public static void main  (String [] args ){
		int a,b;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Nhap chieu dai: ");
		a=sc.nextInt();
		Scanner sd=new Scanner (System.in);
		System.out.print("Nhap chieu rong: ");
		b=sd.nextInt();
		System.out.print("Dien tich hinh chu nhat=" +tinh(a,b));
	}
}