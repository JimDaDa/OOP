import java.util.Scanner;
public class cau5 {
	public static int tinh(int a,int b,int c){
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		return max;
	}
	public static void main  (String [] args ){
		int a,b,c;
		
		Scanner sa=new Scanner (System.in);
		System.out.print("Nhap a: ");
		a=sa.nextInt();
		Scanner sb=new Scanner (System.in);
		System.out.print("Nhap b: ");
		b=sb.nextInt();
		Scanner sc=new Scanner (System.in);
		System.out.print("Nhap b: ");
		c=sc.nextInt();
		System.out.print("So lon nhat la: " +tinh(a,b,c));
	}
}