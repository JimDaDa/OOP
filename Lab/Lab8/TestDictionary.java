import java.util.Scanner;
public class TestDictionary{
public static void main(String []args){
		Dictionary dict = new Dictionary();
		dict.add("cat","con meo");
		dict.add("dog","con cho");
		dict.add("big","con heo");
		dict.add("ass","con lua");
		dict.add("bat","con doi");
		dict.add("camel","con lac da");
		dict.add("butterfly","con buom");
		dict.add("bee","con ong");
		dict.add("crab","con cua");
		dict.add("duck","con vit");
		
		System.out.println("Enter word: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(dict.findMean(sc.nextLine()));
		
		sc.close();
	}
	}