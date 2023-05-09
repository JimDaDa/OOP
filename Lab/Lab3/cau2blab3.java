import java.util.Scanner;
public class cau2blab3{
	public static void main(String[] args){
		
		
		System.out.print("Nhap chuoi 1: ");
		Scanner sa =new Scanner(System.in);
		String chuoi_1=sa.nextLine();
		System.out.print("Nhap chuoi 2: ");
		String chuoi_2=sa.nextLine();
		StringBuilder d =new StringBuilder(chuoi_1);
		d.append(chuoi_2);
		System.out.println("Chuoi sau khi noi la : " +d);
	}
}
		