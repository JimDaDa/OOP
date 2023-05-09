import java.util.*;
import java.io.*;

public class Bai4e{
    public static void main(String [ ] args) throws FileNotFoundException
	{
        new Bai4e().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException
	{
		String longest_word = "";
		String current;
		Scanner sc = new Scanner(new File("test.txt"));

		while (sc.hasNext())
		{
			current = sc.next();
			if (current.length() > longest_word.length())
			{
				longest_word = current;
			}
		}
        System.out.println(longest_word);
        return longest_word;
    }
}