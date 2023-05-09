import java.util.Scanner;
import java.util.StringTokenizer;
public class cau1lab3{
	
	 public static String laytenDem(String[] tendem){
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < tendem.length-1; i++) {
          sb.append(tendem[i] + " ");
      }

      return sb.toString();
  }
  
	public static void main(String[] args){
		
		
		System.out.print("Nhap ho va ten : ");
		Scanner sa =new Scanner(System.in);
		String hoten=sa.nextLine();
        StringTokenizer st1= new StringTokenizer(hoten);
		String[] tokens = hoten.split(" ");
		//ho
        String ho= st1.nextToken();
		
		//khai bao ten dem va ten 
        String tendem="";
        String ten="";
//tach ten
 
 if(tokens.length > 0) {
	 ten=tokens[tokens.length -1];
 }
 
 // in ho 
System.out.println("Ho la : " +ho);
//tach ten dem 
    if(tokens.length > 2){
System.out.println("Ten dem la : " +laytenDem(tokens)) ;	 
	
}
//in ten 
    System.out.println("Ten la :" +ten);
	}
}