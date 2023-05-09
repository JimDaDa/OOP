import java.util.Scanner;
public class cau10 {
	public static int first(int n){
		int f=0;
		while(n>0)
		{
			f=n%10;
			n=n/10;
		}
		return f;
	}
	public static int last(int n){
		int l;
		l=n%10;
		return l;
	}
	public static void main (String[] args){
		int n;
		Scanner sa= new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=sa.nextInt();
		System.out.println("Chu so dau cua " +n+ " la " +first(n));
		System.out.println("Chu so cuoi cua " +n+ " la " +last(n));
	}
}