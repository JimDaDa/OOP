public class Employee{
		private String id;
		private String fullName;
		private int yearJoined;
		private double coefficientsSalary;
		private int numDayOff;
		
		public Employee(){
		this.id="";
		this.fullName="";
		this.yearJoined=2020;
		this.coefficientsSalary=1.0;
		this.numDayOff=0;
		}
		public Employee(String id , String fullName ,double coefficientsSalary){
			
			this.id=id;
			this.fullName=fullName;
			this.yearJoined=2020;
			this.coefficientsSalary=coefficientsSalary;
			this.numDayOff=0;
		}
		public Employee(String id , String fullName ,int yearJoined,double coefficientsSalary,int numDayOff){
			this.id=id;
			this.fullName=fullName;
			this.yearJoined=yearJoined;
			this.coefficientsSalary=coefficientsSalary;
			this.numDayOff=numDayOff;
		}
		public String getId (){
			return this.id;
		}
		public String getFullName(){
			return this.fullName;
		}
		public int getYearJoined(){
			return this.yearJoined;
		}
		public double getCoefficientsSalary(){
			return this.coefficientsSalary;
		}
		public int getNumDayOff(){
			return this.numDayOff;
		}
		public void setId(String id){
			this.id=id;
		}
		public void setFullName(String fullName){
			this.fullName=fullName;
		}
		public void setYearJoined(int yearJoined){
			 this.yearJoined=yearJoined;
		}
		public void setCoefficientsSalary(double coefficientsSalary){
			 this.coefficientsSalary=coefficientsSalary;
		}
		public void setNumDayOff(int numDayOff ){
			 this.numDayOff=numDayOff;
		}
		//
		public double getSenioritySalary(){
			double basicSalary=1150;
			 double senioritySalary;
		 if (this.yearJoined<=2015){
			 return this.yearJoined*basicSalary/100;
		 }
		 return this.getCoefficientsSalary();
		}
		
		
		
		public String considerEmulation(){
			
			 
			if(this.numDayOff<=1){
				return "Class A";
			}
			if (this.numDayOff<=3){
				return "Class C";
			}
			return "Class B";
		}
		
		public double getSalary(){
			double	salary;
			double basicSalary =1150;
			double emulationcoefficient;
		if(this.considerEmulation()=="Class A"){
			return  basicSalary*this.getCoefficientsSalary()*1.0+this.getSenioritySalary();
		 
	 }
	 if(this.considerEmulation()=="Class B"){
			return basicSalary*this.getCoefficientsSalary()*0.75+this.getSenioritySalary();
		 
	 }
	 if(this.considerEmulation()=="Class C"){
			return basicSalary*this.getCoefficientsSalary()*0.5+this.getSenioritySalary();
		 
	 }
		
	return this.getSalary();
}
}