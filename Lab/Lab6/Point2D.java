public class Point2D{
		private float x=0.0f;
		private float y=0.0f;
		
	
	public Point2D(){
		this.x=0.0f;
		this.y=0.0f;
	}
	public Point2D( float x,float y){
		this.x=x;
		this.y=y;
		
	}
	
	
	public float getX(){
		return this.x;
	}
	 public void setX(float x){
		 this.x=x;
	}
	public float getY(){
		return this.y;
	}
	public void setY(float y){
		 this.y=y;
	}
	public float[] getXY(){
     float[] result = new float[2];
     result[0] = this.x;
     result[1] = this.y;

    return result;
	
    }
	
	public void setXY(float x, float y){
		this.x=x;
		 this.y=y;
	}
	@Override
public String toString(){
	return "Point2D(  X = " +this.x+ " , Y = " +this.y+ " )";
}
}