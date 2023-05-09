public class Rectangle{
		private float width=1.0f;
		private float height=1.0f;
		
		public Rectangle(float width ,float height){
			this.width=width;
			this.height=height;
		}
		public float getWidth(){
			return this.width;
		}
		public float getHeight(){
			return this.height;
		}
		public void setWidth(float width){
			this.width=width;
		}
		public void setHeight(float height){
			this.height=height;
		}
		public String toString(){
			return "Rectangle[width=" +this.width +",height= "+this.height+ "]";
		}
	}
