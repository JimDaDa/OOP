public class TapChi extends QuanLyTaiLieu{
	
	private int soTrang;
	private int thangPhatHanh;
	private int thangHienTai;
	private double giaBan;
	public TapChi(){
		super();
		
		this.soTrang=0;
		this.thangPhatHanh=0;
		this.thangHienTai=0;
		this.giaBan=0;
	}
	public TapChi(String maTaiLieu,String tenNSX,int soPhatHanh,double giaNhap,int soTrang,int thangPhatHanh,int thangHienTai){
		super(maTaiLieu,tenNSX,soPhatHanh,giaNhap);
		this.soTrang=soTrang;
		this.thangPhatHanh=thangPhatHanh;
		this.thangHienTai=thangHienTai;
		this.giaBan=giaBan;
	}
	
	
	public int getSoTrang(){
		return this.soTrang;
	}
	public int getThangPhatHanh(){
		if(this.thangPhatHanh <=12 ){
			return this.thangPhatHanh;
		}
		else{
			return 12;
		}
		
	}
	public int getThangHienTai(){
		if(this.thangHienTai <=12 ){
			return this.thangHienTai;
		}
		else{
			return 12;
		}
	}
	
	
	public double getGiaBan(){
		
		if(this.thangHienTai-this.thangPhatHanh >2){
			
			return super.getGiaNhap()*0.8;
		}else 
		
		
		return super.getGiaNhap()*1.2;
	}
	
	public void setSoTrang(int SoTrang){
		this.soTrang=soTrang;
		
	}
	public void setThangPhatHanh(int thangPhatHanh){
		this.thangPhatHanh=thangPhatHanh;
		
	}
	public void setThangHienTai(int thangHienTai){
		this.thangHienTai=thangHienTai;
	}
	@Override
	
	public String toString(){
		return "TAP CHI :[ MA TAI LIEU:"+getMaTaiLieu()+" - TEN NHA SAN XUAT: "+getTenNSX()+" - SO PHAT HANH: "+getSoPhatHanh()+" - SO TRANG: "+getSoTrang()+" - THANG PHAT HANH: "+getThangPhatHanh()+" - THANG HIEN TAI: "+getThangHienTai()+" - GIA NHAP: "+getGiaNhap()+" - GIA BAN: "+getGiaBan();
	}
	}