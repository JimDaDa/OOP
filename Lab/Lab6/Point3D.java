public class Point3D extends Point2D{
		private float z;
		
		
	public Point3D( float x,float y,float z){
		super(x,y);
		this.z=z;
		
	}
	public Point3D(){
		super();
		this.z=0.0f;
		
	}
	
	
	public float getZ(){
		return this.z;
	}
	 public void setZ(float z){
		 this.z=z;
	}
	public float[] getXYZ(){
     float[] result = new float[3];
    super.getXY();
	
	 result[2] = this.z;

    return result;
	
    }
	public void setXYZ(float x, float y,float z){
		super.setXY(x,y);
		 this.z=z;
	}
	@Override
public String toString(){
	return "Point3D(  X " +super.getX()+ " , Y= " +super.getY()+ " Z =" +this.getZ()+ " )";
}
}