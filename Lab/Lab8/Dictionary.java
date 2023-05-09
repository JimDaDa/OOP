import java.util.HashMap;


public class Dictionary{
	
	private HashMap<String,String> dict = new HashMap<String,String>();
	
	public Dictionary(){		
	}
	
	public void add(String word, String mean){
		word = word.toLowerCase();
		mean = mean.toLowerCase();
		if (!isExists(word)){
			this.dict.put(word,mean);
		}
	}
	
	public boolean isExists(String word){
		return this.dict.containsKey(word);
	}
	
	public String findMean(String word){
		word = word.toLowerCase();
		if (!isExists(word)){
			System.out.println("Not exists");
			return "";
		}
		return this.dict.get(word);
	}
	
	
}