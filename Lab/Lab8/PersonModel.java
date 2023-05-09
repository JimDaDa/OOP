import java.util.ArrayList;

public class PersonModel < T >{
	
	private ArrayList<T> s1 = new ArrayList<T>();
	
	public void add(T obj){		
		s1.add(obj);
	}
	
	public void display(){
		for (T obj : s1){
			System.out.println(obj);
		}
	}
	
	
	public static void main(String []args){		
		PersonModel<Student> s2 = new PersonModel<Student>();
		s2.add(new Student("Ryujin", 2001, 1, "TDTU"));
		s2.add(new Student("Yuqi", 1999, 2, "TDTU"));
		s2.display();
		
		System.out.println("------------------------------------------------\n");
		
		PersonModel<Employee> s3 = new PersonModel<Employee>();
		s3.add(new Employee("Shuhua", 1999, 1, 1.5));
		s3.add(new Employee("Minho", 1993, 2, 300));
		s3.display();
		
		System.out.println("-------------------------------------------------\n");
		
		PersonModel<Person> s4 = new PersonModel<Person>();
		s4.add(new Person("Eunji", 1993));
		s4.add(new Student("Lucas", 1999, 1, "OP"));
		s4.add(new Employee("Miyeon", 1997, 2, 120));
		s4.display();
	}
}