public class QuanLyTaiLieu{
	private String maTaiLieu;
	private String tenNSX;
	private int soPhatHanh;
	private double giaNhap;
	
	public QuanLyTaiLieu(){
		this.maTaiLieu="A1234";
		this.tenNSX="NXB KIM DONG ";
		this.soPhatHanh=12;
		this.giaNhap=1;
		
	}
	public QuanLyTaiLieu(String maTaiLieu,String tenNSX,int soPhatHanh,double giaNhap){
		this.maTaiLieu=maTaiLieu;
		this.tenNSX=tenNSX;
		this.soPhatHanh=soPhatHanh;
		this.giaNhap=giaNhap;
		
	}
	public  String getMaTaiLieu(){
		return this.maTaiLieu;
	}
	public  String getTenNSX(){
		return this.tenNSX;
	}
	public  int getSoPhatHanh(){
		return this.soPhatHanh;
	}
	public  double getGiaNhap(){
		return this.giaNhap;
	}
	
	public void setMaTaiLieu(String maTaiLieu){
		this.maTaiLieu=maTaiLieu;
	}
	public void setTenNSX(String tenNSX){
		this.tenNSX=tenNSX;
	}
	public void setSoPhatHanh(int soPhatHanh){
		this.soPhatHanh=soPhatHanh;
	}
	public void setGiaNhap(double giaNhap){
		this.giaNhap=giaNhap;
	}
	public double getGiaBan(){
		return getGiaNhap()*1.2;
	}
	@Override
	public String toString(){
		return "QUAN LY TAI LIEU : [MA TAI LIEU :"+this.maTaiLieu+" - TEN NHA SAN XUAT: "+this.tenNSX+" - SO PHAT HANH: "+this.soPhatHanh+" - GIA NHAP: "+this.giaNhap+" - GIA BAN: "+getGiaBan()+"]";
	}
	
}