public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(){
		super();
		height=1.0;
		
	}
	public Cylinder(double height ){
		super();
		 this.height=height;
		 
	 }
	 public Cylinder(double radius ,double height){
		 super(radius);
		 this.height=height;
	 }
	public Cylinder(double radius  ,double height,String color){
		super(radius,color);
		this.height=height;
	}
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getVolume(){
		return super.getArea() * height;
	}
	@Override
	public double getArea(){
		return (2*3.14*getRadius()*height)+(2*getRadius()*getRadius()*3.14);
	}
	@Override
public String toString(){
	return "Cylinder(  radius " +getRadius()+ " , color= " +getColor()+ "height="+getHeight()+ " )";
}
}