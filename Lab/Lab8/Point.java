import java.util.ArrayList;
import java.lang.*;

public class Point{
	
	private double x=0.0;
	private double y=0.0;
	public Point(){
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public boolean isInside(){
		double distance = Math.sqrt((Math.pow(this.x,2))+Math.pow(this.y,2));
		if(distance < 1)
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString(){
		return "Point{" + "x: " + this.x + "; y: " + this.y + "}"; 
	}
}