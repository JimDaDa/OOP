
public class TestStudentStaff{
	public static void main (String[] args){
		Student a=new Student("Cao Nguyen Ky Duyen","15/3 district 7","Dai Hoc",2019,20000000.0);
		System.out.println("Name:"+a.getName());
		System.out.println("Address:"+a.getAddress());
		System.out.println("Program:"+a.getProgram());
		System.out.println("Year:"+a.getYear());
		System.out.println("Fee:"+a.getFee());
		
		Staff b =new Staff("Cao Nguyen Ky Duyen","15/3 district 7","Ton Duc Thang",3000000.0);
		System.out.println("Name:"+b.getName());
		System.out.println("Address:"+b.getAddress());
		System.out.println("School:"+b.getSchool());
		System.out.println("Pay:"+b.getPay());
		
	
}
}