public class Sach extends QuanLyTaiLieu{
	private String tenTacGia;
	private int soTrang;
	private double giaBan;
	public Sach(){
		super();
		this.tenTacGia="";
		this.soTrang=0;
		this.giaBan=0;
	}
	public Sach(String maTaiLieu,String tenNSX,int soPhatHanh,double giaNhap,String tenTacGia,int soTrang){
		super(maTaiLieu,tenNSX,soPhatHanh,giaNhap);
		this.tenTacGia=tenTacGia;
		this.soTrang=soTrang;
		this.giaBan=giaBan;
	}
	
	public String getTenTacGia(){
		return this.tenTacGia;
	}
	public int getSoTrang(){
		return this.soTrang;
	}
	
	public double getGiaBan(){
		if( this.tenTacGia == "DINH MAC" || this.tenTacGia == "NGUYEN NHAT ANH" || this.tenTacGia == "DIEP LAC VO TAM"){
			return super.getGiaNhap()*1.2;
		}
		else{
			return super.getGiaNhap()*1.1;
		}
		
	}
	public void setTenTacGia(String tenTacGia){
		this.tenTacGia=tenTacGia;
		
	}
	public void setSoTrang(int SoTrang){
		this.soTrang=soTrang;
		
	}
	
	
	@Override
	
	public String toString(){
		return "SACH:[ MA TAI LIEU:"+getMaTaiLieu()+" - TEN NHA SAN XUAT: "+getTenNSX()+" - SO PHAT HANH: "+getSoPhatHanh()+" - TAC GIA : "+getTenTacGia()+" - SO TRANG: "+getSoTrang()+" - GIA NHAP: "+getGiaNhap()+" - GIA BAN: "+getGiaBan();
	}
	}