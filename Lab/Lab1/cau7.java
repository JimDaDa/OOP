import java.util.Scanner;
public class cau7 {
	public static int kiemtra(String str){
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c<0x30||(c>=0x30&& c<=0x40)||(c>0x5a&&c<=0x60)||c>0x7a)
				return 0;
		}
		return 1;
	}
	public static void main  (String [] args ){
		
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Nhap ki tu can kiem tra: ");
		String str=sc.nextLine();
		if(kiemtra(str)==1)
			System.out.print("Ki tu vua nhap khong phai la  alphanumeric ");
		else 
			System.out.print("Ki tu vua nhap  la  alphanumeric ");
	
	}
}