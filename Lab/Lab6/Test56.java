public class Test56{
	public static void main (String[] args){
		Employee a2=new Employee("51900491","Cao Nguyen Ky Duyen",1.0);
		System.out.println("ID:"+a2.getId());
		System.out.println("Name:"+a2.getFullName());
		System.out.println("CoefficientsSalary :"+a2.getCoefficientsSalary());
		System.out.println("SenioritySalary:"+a2.getSenioritySalary());
		System.out.println("considerEmulation:"+a2.considerEmulation());
		System.out.println("Salary:"+a2.getSalary());
		
		Employee a3=new Employee("51900491","Cao Nguyen Ky Duyen",2014,1.0,1);
		System.out.println("ID:"+a3.getId());
		System.out.println("Name:"+a3.getFullName());
		System.out.println("Year Joined :"+a3.getYearJoined());
		System.out.println("CoefficientsSalary :"+a3.getCoefficientsSalary());
		System.out.println("NumDayOff:"+a3.getNumDayOff());
		System.out.println("SenioritySalary:"+a3.getSenioritySalary());
		System.out.println("considerEmulation:"+a3.considerEmulation());
		System.out.println("Salary:"+a3.getSalary());
		
	    Manager b=new Manager("51900491","Cao Nguyen Ky Duyen",1.0,"Head of the office",5.0);
		System.out.println("ID:"+b.getId());
		System.out.println("Name:"+b.getFullName());
		System.out.println("CoefficientsSalary :"+b.getCoefficientsSalary());
		System.out.println("Position:"+b.getPosition());
		System.out.println("salaryCoefficientPosition :"+b.getSalaryCoefficientPosition());
		System.out.println("considerEmulation:"+((Manager) b).considerEmulation());
		System.out.println("bonusByPosition:"+b.bonusByPosition());
		System.out.println("Salary:"+((Manager) b).getSalary());
		 Manager b1=new Manager("51900491","Cao Nguyen Ky Duyen",2020,1.0,1,"Head of the office",5.0);
		System.out.println("ID:"+b1.getId());
		System.out.println("Name:"+b1.getFullName());
		
		System.out.println("Year Joined :"+b1.getYearJoined());
		System.out.println("CoefficientsSalary :"+b1.getCoefficientsSalary());
		
		System.out.println("NumDayOff:"+b1.getNumDayOff());
		System.out.println("Position:"+b1.getPosition());
		System.out.println("salaryCoefficientPosition :"+b1.getSalaryCoefficientPosition());
		System.out.println("considerEmulation:"+((Manager) b1).considerEmulation());
		System.out.println("bonusByPosition:"+b1.bonusByPosition());
		System.out.println("Salary:"+((Manager) b1).getSalary());
}
}