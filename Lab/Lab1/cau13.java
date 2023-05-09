import java.util.Scanner;
public class cau13{
	public static int dem (int n){
		int dem=0,x=0;
		while(n>0)
		{
			x=n%10;
			dem++;
			n/=10;
		}
		return dem;
	} 
	public static void main (String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		System.out.println("So cac chu so cua " +n+ "=" +dem(n));
	}
}