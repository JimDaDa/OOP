public class StudentTest{
	public static void main (String[] args){
		Student outerObject =new Student();
		Student.StudentOperator innerObject=outerObject.new StudentOperator();
		innerObject.print();
		innerObject.type();
		
	}
}