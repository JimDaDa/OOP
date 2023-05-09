public class Tivi{
	private String maTivi;
	private String hangSX;
	private int soInche;
	private double giaNhap;
	public Tivi(){
		this.maTivi="TV123";
		this.hangSX="Sony";
		this.soInche=40;
		this.giaNhap=1;
		
	}
	public Tivi(String maTivi ,String hangSX ,int soInche,double giaNhap){
		this.maTivi=maTivi;
		this.hangSX=hangSX;
		this.soInche=soInche;
		this.giaNhap=giaNhap;
		
	}
	public  String getMaTiVi(){
		return this.maTivi;
	}
	public String getHangSX(){
		return this.hangSX;
	}
	public int getSoInche(){
	if(this.soInche == 32 || this.soInche == 40 || this.soInche == 43|| this.soInche == 49 || this.soInche == 50 || this.soInche == 55){
			return this.soInche;
		}
		else{
			return 32;
		}
	}
	
	
	public double getGiaNhap(){
		
		return this.giaNhap;
	}
	
	public void setMaTiVi(String maTivi){
		this.maTivi=maTivi;
	}
	public void setHangSX(String hangSX){
		this.hangSX=hangSX;
	}
	public void setSoInche(int soInche){
		this.soInche=soInche;
	}
	public void setGiaNhap(double giaNhap){
		this.giaNhap=giaNhap;
	}
	public double getGiaBan(){
		return getGiaNhap()*1.2;
	}
	public String toString(){
		return "TIVI: [MA TI VI: "+this.maTivi+" - HANG SAN XUAT: "+this.hangSX+" - INCHE: "+this.soInche+" - GIA NHAP: "+this.giaNhap+" - GIA BAN: "+getGiaBan()+"]";
	}
}
