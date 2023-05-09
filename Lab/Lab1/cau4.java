import java.util.Scanner;
public class cau4 {
	public static void main  (String [] args ){
		int a;
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Nhap nam can kiem tra: ");
		a=sc.nextInt();
		if (a%4==0)
			if (a%100==0)
				if(a%400==0)
				{
					System.out.print("Nam "+a+ "la nam nhuan");
				}
				else
				{
					System.out.print("Nam "+a+ " khong phai la nam nhuan");
				}
				else
				{
					System.out.print("Nam "+a+ " la nam nhuan");
				}
				else
				{
					System.out.print("Nam "+a+ " khong phai la nam nhuan");
				}
}
}