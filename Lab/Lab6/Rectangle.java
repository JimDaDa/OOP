public class Rectangle extends Shape{
		private double width=1.0;
		private double length=1.0;
		
		public Rectangle(double width ,double length){
			super();
			this.width=width;
			this.length=length;
		}
		public Rectangle(double width ,double length,String color ,boolean filled){
			super(color,filled);
			this.width=width;
			this.length=length;
		}
		public double getWidth(){
			return this.width;
		}
		public double getLength(){
			return this.length;
		}
		public void setWidth(double width){
			this.width=width;
		}
		public void setLength(float length){
			this.length=length;
		}
		public double getArea(){
	return this.length*this.width;
}
public double getPerimeter(){
	return (this.length+this.width)*2;
}
		public String toString(){
			return "Rectangle[width=" +getWidth() +",length= "+getLength()+" , color= " +getColor()+ "filled"+isFilled()+"Area"+getArea()+"Perimeter"+getPerimeter()+ "]";
		}
	}