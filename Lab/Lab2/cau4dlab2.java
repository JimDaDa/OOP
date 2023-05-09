import java.util.Scanner;
import java.lang.String;
public class cau4dlab2{
	public static void main (String[] args){
		int i;
		Scanner sa=new Scanner(System.in);
		String chuoi;
		System.out.print("Nhap chuoi: ");
		chuoi=sa.nextLine();
		int l=chuoi.length();
		for ( i=0;i<chuoi.length()/2;i++)
		{
		if(chuoi.charAt(i)!=chuoi.charAt(l-1-i))
		   {
			   
		      
		            break;
		   
		   }
		}
		if(i==0)
		{
			 System.out.println("Khong phai la chuoi doi xung");
		}
		
		
		else{
		
		           System.out.println("Day la chuoi doi xung");
		}
	}
		
}