public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(){
		super();
		this.school="";
		this.pay=0.0;
	}
	 
	public Staff(String name,String address, String school ,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
		
	}
	public String getSchool(){
		return this.school;
	}
	public void setSchool(String school){
		this.school=school;
	}
	
	
	public double getPay(){
		return this.pay;
	}
	public void setPay(double pay){
		this.pay=pay;
	}
	
	
	@Override
public String toString(){
	return "Student(  name " +getName()+ " , address= " +getAddress()+ "school="+getSchool()+ "pay =" +getPay()+ " )";
}
}