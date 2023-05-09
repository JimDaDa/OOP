import java.util.Scanner;
public class cau4blab2{
	public static void main (String[] args){
		int dem=0;
		Scanner sa=new Scanner(System.in);
		String chuoi;
		System.out.print("Nhap chuoi: ");
		chuoi=sa.nextLine();
		for (int i=0;i<chuoi.length();i++)
		{
			if(chuoi.charAt(i)==' ')
			{
				dem++;
			}
		}
		System.out.println("So tu trong chuoi la:"+(dem+1));
	}
}