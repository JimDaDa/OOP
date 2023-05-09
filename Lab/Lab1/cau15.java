import java.util.Scanner;
public class cau15{
	public static int kiemtra (int n){
		int m=0,x=0;
		while(n>0)
		{
			x=n%10;
			m=m*10+x;
			n/=10;
		}
		return m;
	} 
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		int m=n;
		if (kiemtra(n)==m)
		System.out.println( +n+ " la so palindrome" );
		else
		System.out.println( +n+ " khong la so palindrome" );
	}
}