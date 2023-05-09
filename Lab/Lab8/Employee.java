import java.util.*;

public class Employee extends Person{
	
	private int id;
	private double salary;
	
	public Employee(String name, int birthyear, int id, double salary){
		super(name,birthyear);
		this.id = id;
		this.salary = salary;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public double getSalary(){
		return this.salary;
	}
	
	
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nEmployee:" + "\nId: " + this.id + "\nSalary: " + this.salary;
	}
}