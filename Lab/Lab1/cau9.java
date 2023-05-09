import java.util.Scanner;
public class cau9 {
	public static void main (String[] args){
		float ly,hoa ,sinh,toan,tin,dtb;
		Scanner sa= new Scanner(System.in);
		System.out.print("Nhap diem ly : ");
		ly=sa.nextFloat();
		Scanner sb= new Scanner(System.in);
		System.out.print("Nhap diem hoa: ");
		hoa=sb.nextFloat();
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap diem sinh:  ");
		sinh=sc.nextFloat();
		Scanner sd= new Scanner(System.in);
		System.out.print("Nhap diem toan: ");
		toan=sd.nextFloat();
		Scanner se= new Scanner(System.in);
		System.out.print("Nhap diem tin: ");
		tin=se.nextFloat();
		dtb=(ly+hoa+sinh+toan+tin)/5;
		if(dtb>9.0)
			System.out.print("Grade A " +dtb);
		if(dtb>=8.0&&dtb<9.0)
			System.out.print("Grade B " +dtb);
		if(dtb>=7.0&&dtb<8.0)
			System.out.print("Grade C " +dtb);
		if(dtb>=6.0&&dtb<7.0)
			System.out.print("Grade D " +dtb);
		if(dtb>=4.0&&dtb<6.0)
			System.out.print("Grade E " +dtb);
		if(dtb<4.0)
			System.out.print("Grade F " +dtb);
	}
}