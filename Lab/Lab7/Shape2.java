public abstract class Shape2{
	protected String color;
	protected boolean filled;
	 public Shape2(){
		 this.color="";
		 this.filled=true;
	 }
	
	 public Shape2(String color ,boolean filled){
		 this.color=color;
		 this.filled=filled;
	 }
	 
	
	 public String getColor(){
		 return this.color;
	 }
	 public void setColor(String color){
		  this.color=color;
	 }
	 public boolean isFilled(){
		 return this.filled;
	 }
	 
	 public void setFilled(boolean filled){
		 this.filled=filled;
	 }
public abstract double getArea();
public abstract double getPerimeter();
public abstract boolean equals(Object obj);
public abstract String toString();
	

}