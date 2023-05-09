import java.util.Scanner;
public class cau5lab2{
	public static void main (String[] args){
		int dem=0;
		Scanner sa=new Scanner(System.in);
		String chuoi;
		System.out.print("Nhap chuoi: ");
		chuoi=sa.nextLine();
		chuoi=chuoi.trim();
		chuoi=chuoi.replaceAll("\\s+"," ");
		System.out.println(chuoi);
	}
}