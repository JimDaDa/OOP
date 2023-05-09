import java.util.Scanner;
public class cau12{
	public static int tinh (int a ,int b){
		int c=0;
		c=a%b;
		return c;
	}
	public static void main (String[] args)
	{
		int a,b;
		Scanner sa=new Scanner(System.in);
		System.out.print("Nhap a: ");
		a=sa.nextInt();
		Scanner sb=new Scanner(System.in);
		System.out.print("Nhap b: ");
		b=sb.nextInt();
		System.out.print("a%b = "+tinh(a,b));
	}
}