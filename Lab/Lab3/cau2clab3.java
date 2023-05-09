import java.util.Scanner;
public class cau2clab3{
	public static void main (String[] args){
		System.out.print("Nhap chuoi :");
		Scanner sa=new Scanner(System.in);
		String chuoi;
		chuoi= sa.nextLine();
		StringBuilder chuoiDao;
		chuoiDao=new StringBuilder(chuoi);
		chuoiDao.reverse();
		if(chuoi.equals(chuoiDao.toString())){
			System.out.println("Day la chuoi palindrome ");
		}
		else
		{
			System.out.println("Day khong phai la chuoi palindrome ");
		}
	}
}