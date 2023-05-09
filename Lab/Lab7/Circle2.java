public class Circle2 extends Shape2{
	private double radius;
	
	 public Circle2(){
		 super();
		 
		 
	 }
	 public Circle2(double radius){
		
		 this.radius=radius;
		 
	 }
	
	 public Circle2(double radius ,String color,boolean filled){
		 super(color,filled);
		 this.radius=radius;
		 
	 }
	 public double getRadius(){
		 return this.radius;
	 }
	
	 public void setRadius(double radius){
		 this.radius=radius;
	 }
	@Override 
public double getArea(){
	return this.radius*this.radius*3.14;
}
@Override 
public double getPerimeter(){
	return (2*this.radius)*3.14;
}
@Override
	public boolean equals(Object obj){
	if(obj instanceof Circle2){
		Circle2 cir = (Circle2) obj;
		return (this.getRadius() == cir.getRadius());
	}
	else return false;
	}
	@Override
	public String toString(){
		return "Circle{"+ "Radus="+this.radius+"}";
	}
 



}
