public class Square2 extends Rectangle2{
	public Square2(){
		super();
	}
	public Square2(double side, String color , boolean filled){
		super(side,side,color,filled);
	}
	public double getSide(){
		return super.getWidth();
	}
	public void setSide(double side){
		super.setWidth(side);
	}
	public double getArea(){
		return super.getArea();
	}
	public double getPerimeter(){
		return super.getPerimeter();
	}
	@Override
	public void setWidth(double side){
		super.setWidth(side);
	}
	
	public void setLength(double side){
		this.length = side;
	}

	public double getLength(){
		return getLength();
	}
	@Override
	public String toString(){
		return "Square{Side= "+getSide()+"}";
	}
}