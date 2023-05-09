import java.util.*;

public class Person{
	
	private String name;
	private int birthyear;
	
	public Person(String name, int birthyear){
		this.name = name;
		this.birthyear = birthyear;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getBirthyear(){
		return this.birthyear;
	}
	
	
	
	public void setBirthyear(int birthyear){
		this.birthyear = birthyear;
	}
	
	@Override
	public String toString(){
		return "Person:" + "\nName: " + this.name + "\nBirthyear: " + this.birthyear;
	}
}