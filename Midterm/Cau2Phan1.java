import java.util.*;
import java.lang.*;
public class Cau2Phan1{
	
	static void vietHoa( String str ) {
           
           char kd;
           char pre;
           int i;
           pre = '.';
           for ( i = 0;  i < str.length();  i++ ) {
               kd = str.charAt(i);
               if ( Character.isLetter(kd)  &&  ! Character.isLetter(pre) )
				   
                   System.out.print( Character.toUpperCase(kd) );
			   
               else
                   System.out.print( kd );
               pre = kd;
           }
           System.out.println();
       }
	public static void doichu (String str){
		char ch;
		int i;
		for( i = 0 ; i < str.length() ; i++){
			ch = str.charAt(i);
			if(ch == ' '){
				System.out.print(ch);
			}
			if( Character.isUpperCase(ch)){
				System.out.print(Character.toLowerCase(ch));
			}
			if( Character.isLowerCase(ch)){
				System.out.print(Character.toUpperCase(ch));
			}
			
		}
		System.out.println();
	}

//HAM MAIN 
public static void main( String [] args ){
		String s1;
		String upper = "";
		// NHAP CHUOI HO TEN 
		System.out.println("NHAP HO VA TEN :");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		System.out.println("\n");
	//XOA KHOANG TRANG THUA TRONG CHUOI HO TEN 
	
		s1 = s1.trim();
		s1 = s1.replaceAll("\\s+"," ");
		int dem = 0;
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) == ' '){
				dem++;
			}
		}
		System.out.println("CHUOI SAU KHI XOA KHOANG TRANG :");
		System.out.println(s1);
		// SO TU TRONG CHUOI HO TEN 
		System.out.println("\nSO TU TRONG CHUOI LA : ");
		System.out.println((dem+1));
		System.out.println("\nCHUOI SAU KHI DUOC VIET HOA CHU CAI DAU: ");
		vietHoa(s1);
		System.out.println("CHUYEN DOI KI TU THANH CHU THUONG VA NGUOC LAI:");
		doichu(s1);
	}	   

}