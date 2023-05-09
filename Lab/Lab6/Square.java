public class Square extends Rectangle{
	
	  public Square(double side ){
		super(side,side);
	 
	 }
	
	 public Square(double side ,String color,boolean filled){
		 super(side,side,color,filled);
		 
		 
	 }
	 public double getSide(){
		 return super.getWidth();
	
	 }
	
	 public void setSide(double side){
		 super.setWidth(side);
		 
	 }
	 
	@Override
	 public void setWidth(double side) {
        super.setWidth(side);
        
    }

  
	 	
@Override
 public String toString() {
       return "Square [side =" +this.getSide() +" , color= " +super.getColor()+ "filled: "+super.isFilled()+"Area"+super.getArea()+"Perimeter"+super.getPerimeter()+ "]";
    }

}