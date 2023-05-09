import java.util.Scanner;
import java.lang.*;
public class Stringbai1{
	// cau a
	 public static String shortName(String str){
      int i=str.lastIndexOf(" ");
	  String ten=str.substring(i+1);
	  String ho=str.substring(0,str.indexOf(" "));
      return ten+" "+ho;
  }
  // cau b
   public static String hashtagName(String str){
      int i=str.lastIndexOf(" ");
	  String ten=str.substring(i+1);
	  String ho=str.substring(0,str.indexOf(" "));
	  String hashtag =ten+ho;
      return "#"+hashtag;
  }
  // cau c 
  public static String upperCaseVowel(String str){
	  String result="";
	  for(int i=0;i<str.length();i++){
		  if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='i'){
			  result+=Character.toUpperCase(str.charAt(i));
		  }
		  else {
			  result+=str.charAt(i);
		  }
	  }
	  return result;
	  
  }
  
	public static void main(String[] args){
		String str;
		
		System.out.print("Nhap ho va ten : ");
		Scanner sa =new Scanner(System.in);
		str=sa.nextLine();
        str=str.trim();
    System.out.println("Ten la :" +shortName(str));
	System.out.println("Ten hashtag la  :" +hashtagName(str));
	System.out.println("Ten viet hoa   :" +upperCaseVowel(str));
	}
}