import java.util.Scanner;

public class cau3clab3{
	public static void main(String[] args){
		
		
		System.out.print("Nhap chuoi : ");
		Scanner sa =new Scanner(System.in);
		String str=sa.nextLine();
        
		System.out.println("chuoi chuan hoa: "+(xoakhoangtrang(str)));
		
	}
	static String xoakhoangtrang(String str)
{
	
	char[] strArray =str.toCharArray();
	StringBuffer sb= new StringBuffer();
	
	
	for(int i=0;i<strArray.length;i++)
	{
		
		if((strArray[i]!=' ')&&(strArray[i]!='\t')){
			
			sb.append(strArray[i]);
		}
		
	}
	String kq=sb.toString();
	return kq;
}
}
