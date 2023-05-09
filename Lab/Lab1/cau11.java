import java.util.Scanner;
public class cau11 {
	public static void tong (int n)
	{
		int s=0;
		int l;
		while (n!=0)
		{
			l=n%10;
			s+=l;
			n=n/10;
		}
		System.out.println ("Tong la "+s);
	}
	public static void tich (int n){
		int s=1;
		int l;
		while (n!=0){
			l=n%10;
			s=s*l;
			n=n/10;
		}
		System.out.println("Tich la "+s);
	}
	public static void main (String[] args){
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("nhap n:");
		n=sc.nextInt();
		tong(n);
		tich(n);
	}
}