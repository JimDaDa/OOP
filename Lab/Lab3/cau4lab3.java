import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;


public class cau4lab3{
	public static void main(String[] args){
		System.out.print(" Nhap mot chuoi: ");
		Scanner sa =new Scanner(System.in);
		String str=sa.nextLine();
		System.out.println(" Liet ke so lan xuat hien cua cac tu: ");
		 Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
	}
}
public static Map<String, Integer> countWords(String nhap){
	Map<String, Integer> wordMap = new TreeMap<String, Integer>();
	if(nhap==null){
		return wordMap;
	}
	int size= nhap.length();
	StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if ((nhap.charAt(i) !=' ') && (nhap.charAt(i) != '\t') && (nhap.charAt(i) !='\n')) {
                
                sb.append(nhap.charAt(i));
            } else {
                
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
		 addWord(wordMap, sb);
        return wordMap;
}
 public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}