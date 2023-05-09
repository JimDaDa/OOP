public class Rectangle2 extends Shape2{
		protected double width;
		protected double length;
		
		public Rectangle2(){
			super();
			this.width=0.0;
			this.length=0.0;
		}
		
		public Rectangle2(double width ,double length,String color ,boolean filled){
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
@Override
	public boolean equals(Object obj) {
 if (obj instanceof Rectangle2) {
 Rectangle2 rec = (Rectangle2) obj;
 return (this.getLength() == rec.getLength()) && (this.getWidth() == rec.getWidth());
 }
	
	else return false;
	}
	@Override
	public String toString(){
		return "Rectangle {"+ "length="+this.length+"width " +this.width+"}";
	}
	}