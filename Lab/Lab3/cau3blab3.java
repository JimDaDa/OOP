import java.util.Scanner;

public class cau3blab3{
	public static void main(String[] args){
		System.out.print("Nhap chuoi : ");
		Scanner sa =new Scanner(System.in);
		String str=sa.nextLine();
        
		
	int vt=0;
	int i=0;
	for( i=str.length()-1;i>=0;i--)
	{
		
		char c=str.charAt(i);
		if(c==' ')
			vt=i;
		else
			break;
		}
		str=str.substring(0,vt);
		System.out.println("chuoi chuan hoa: "+str);
		
		
	}

	
	
		
	}
	


