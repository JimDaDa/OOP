import java.util.Scanner;
public class cau6 {
	public static void main (String[] args){
		int a;
		Scanner sa=new Scanner (System.in);
		System.out.print("Nhap so can kiem tra: ");
		a=sa.nextInt();
		if(a%2==0)
			System.out.print(+a+ " la so chan ");
		else 
		System.out.print(+a+ " la so le ");	
	}
}