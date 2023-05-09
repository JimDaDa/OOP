import java.util.Scanner;
public class cau4clab2{
	public static void main (String[] args){
		int dem=0;
		Scanner sa=new Scanner(System.in);
		String chuoi1;
		System.out.print("Nhap chuoi 1: ");
		chuoi1=sa.nextLine();
		Scanner sb=new Scanner(System.in);
		String chuoi2;
		System.out.print("Nhap chuoi 1: ");
		chuoi2=sb.nextLine();
		String chuoi3=chuoi1.concat(chuoi2);
		System.out.println("chuoi sau khi noi :"+chuoi3);
	}
}