public class Circle4 extends Shape{
	private double radius;
	
	 public Circle4(){
		 super();
		 this.radius=1.0;
		 
	 }
	 
	
	 public Circle4(double radius ,String color,boolean filled){
		 super(color,filled);
		 this.radius=radius;
		 
	 }
	 public double getRadius(){
		 return this.radius;
	 }
	
	 public void setRadius(double radius){
		 this.radius=radius;
	 }
	 
public double getArea(){
	return this.radius*this.radius*3.14;
}
public double getPerimeter(){
	return (2*this.radius)*3.14;
}
@Override
public String toString(){
	return "Circle4(  radius " +getRadius()+ " , color= " +getColor()+ "filled"+isFilled()+"Area"+getArea()+"Perimeter"+getPerimeter()+" )";
}

}