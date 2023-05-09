public class Manager extends Employee{
		
	    
		private String position;
		private double salaryCoefficientPosition;
		
		public Manager(){
			super();
			
			this.position="Head of the office";
			this.salaryCoefficientPosition=5.0;
			
			
		}
		public Manager(String id , String fullName ,double coefficientsSalary,String position,double salaryCoefficientPosition){
			super(id,fullName,coefficientsSalary);
			
			this.position=position;
			this.salaryCoefficientPosition=salaryCoefficientPosition;
			
			
		}
		public Manager(String id,String fullname, int yearJoined,double coefficientsSalary,int numDayOff,String position,double salaryCoefficientPosition){
	       super(id,fullname,yearJoined,coefficientsSalary,numDayOff);
	       this.position = position;
	       this.salaryCoefficientPosition = salaryCoefficientPosition;
}
        public String getPosition(){
			return this.position;
		}
		public void setPosition(String position){
			 this.position=position;
		}
        public double getSalaryCoefficientPosition(){
			return this.salaryCoefficientPosition;
		}
		public void setSalaryCoefficientPosition(double salaryCoefficientPosition){
			 this.salaryCoefficientPosition=salaryCoefficientPosition;
		}
		
@Override
		public String considerEmulation(){
			
			return  super.considerEmulation();
		}
		
		
		
		public double bonusByPosition(){
			double basicSalary=1150;
			
		 
		return basicSalary*this.getSalaryCoefficientPosition();
		}
		
		public double getSalary(){
			return super.getSalary() + this.bonusByPosition();
			
	}
}
