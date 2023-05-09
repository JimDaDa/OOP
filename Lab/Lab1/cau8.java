import java.util.Scanner;
public class cau8 {
	public static void main (String[] args){
		int a,b,c;
		Scanner sa= new Scanner(System.in);
		System.out.print("Nhap canh a: ");
		a=sa.nextInt();
		Scanner sb= new Scanner(System.in);
		System.out.print("Nhap canh b: ");
		b=sb.nextInt();
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap canh c: ");
		c=sc.nextInt();
		if(a+b>c||a+c>b||b+c>a)
		System.out.print("Day la mot tam giac ");	
		else 
			System.out.print("Day khong phai la mot tam giac ");
	}
}