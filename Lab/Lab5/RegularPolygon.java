public class RegularPolygon{
	
	private String name ;
	private int egdeAmount;
	private double egdeLength;
	
	public RegularPolygon(){
		this.name="";
		this.egdeAmount=3;
		this.egdeLength=1;
		
		
	}
	
	public RegularPolygon(String name ,int egdeAmount ,double egdeLength){
		this.name=name;
		this.egdeAmount=egdeAmount;
		this.egdeLength=egdeLength;
		
	}
	public RegularPolygon(RegularPolygon polylon){
	this.name=polylon.name;
	this.egdeAmount=polylon.egdeAmount;
	this.egdeLength=polylon.egdeLength;
		
		
	}
	
	public String getName(){
		return this.name;
	}
	public int getEgdeAmount(){
		return this.egdeAmount;
	}
	public double getEgdeLength(){
		return this.egdeLength;
	}
	
	public void setName(String name){
			this.name=name;
		}
	public void setEgdeAmount(int num){
			this.egdeAmount=num;
	}
	public void setEgdeLength(double length){
			this.egdeLength=length;
	}
	
	public String getPolygon(){
		if(this.egdeAmount==3){
			return "Triangle";
		}
		if(this.egdeAmount==4){
			return "Quadrangle";
		}
		if(this.egdeAmount==5){
			return "Pentagon";
		}
		if(this.egdeAmount==6){
			return "Hexagon";
		}
		
			return "Polygon has the number of edges greater than 6";
		
	}
	public double getPerimeter(){
		double perimeter =this.egdeAmount*this.egdeLength;
		return perimeter;
		
	}
	public double getArea(){
		if(this.egdeAmount==3){
			return (this.egdeLength*this.egdeLength)*0.433;
		}
		if(this.egdeAmount==4){
			return (this.egdeLength*this.egdeLength)*1;
		}
		if(this.egdeAmount==5){
			return (this.egdeLength*this.egdeLength)*1.72;
		}
		if(this.egdeAmount==6){
			return (this.egdeLength*this.egdeLength)*2.595;
		}
		return -1;
			
		}
		
	
		
	
	public String toString(){
		return ""+this.name+"-"+getPolygon()+"-"+getArea();
	}
}
	
