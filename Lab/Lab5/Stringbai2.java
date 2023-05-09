import java.util.*;
import java.lang.*;
public class Stringbai2{
	public static int countWord(String paragraph){
		StringTokenizer s1 = new StringTokenizer(paragraph);
		int dem = s1.countTokens();
		return dem;
	}
	public static int countSentences(String paragraph){
		int dem=0;
		for(int i=0;i<paragraph.length();i++)
		{
			if(paragraph.charAt(i)=='.')
			{
				dem++;
			}
		}
		return dem;
	}
	public static int countAppear(String paragraph,String word){
		int a = paragraph.split(word).length -1;
		return a;
	}
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		String paragraph="The Edge Surf is of course also a whole lot better, which will  hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
		System.out.println(paragraph);
		System.out.println("Nhap tu can kiem tra : ");
		String word =sc.nextLine();
		System.out.println("So tu trong doan van "+countWord(paragraph));
		System.out.println("So cau trong doan van "+countSentences(paragraph));
		System.out.println("So lan xuat hien cua tu " +word+ " la: "+countAppear(paragraph,word));
	}
	}
	

