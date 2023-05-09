import java.util.*;

public class Student extends Person{
	
	private int id;
	private String score;
	
	public Student(String name, int birthyear, int id, String score){
		super(name,birthyear);
		this.id = id;
		this.score = score;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getScore(){
		return this.score;
	}
	
	public void setScore(String score){
		this.score = score;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nStudent:" + "\nId: " + this.id + "\nScore: " + this.score;
	}
}