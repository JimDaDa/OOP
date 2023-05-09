import java.util.Scanner;

public class cau3alab3{
	public static void main(String[] args){
		System.out.print("Nhap chuoi : ");
		Scanner sa =new Scanner(System.in);
		String str=sa.nextLine();
        
		
	int vt=0;
	int i=0;
	for( i=0;i<str.length();i++)
	{
		
		char c=str.charAt(i);
		if(c==' ')
			vt=i;
		else
			break;
		}
		str=str.substring(i);
		System.out.println("chuoi chuan hoa: "+str);
		
		
	}

	
	
		
	}
	


