import java.util.Scanner;
import java.util.StringTokenizer;
public class cau2alab3{
	public static void main(String[] args){
		
		
		System.out.print("Nhap chuoi : ");
		Scanner sa =new Scanner(System.in);
		String hoten=sa.nextLine();
        StringTokenizer st1= new StringTokenizer(hoten);
		int dem= st1.countTokens();
		System.out.print("So tu trong chuoi la :" +dem);
}
}