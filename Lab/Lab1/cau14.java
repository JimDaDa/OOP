import java.util.Scanner;
public class cau14{
	public static int dao (int n){
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
		System.out.println("So dao nguoc cua " +n+ "=" +dao(n));
	}
}