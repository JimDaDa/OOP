public class Bao extends QuanLyTaiLieu{
	
	private int soTrang;
	private int ngayPhatHanh;
	private int ngayHienTai;
	private double giaBan;
	public Bao(){
		super();
		
		this.soTrang=0;
		this.ngayPhatHanh=0;
		this.ngayHienTai=0;
		this.giaBan=0;
	}
	public Bao(String maTaiLieu,String tenNSX,int soPhatHanh,double giaNhap,int soTrang,int ngayPhatHanh,int ngayHienTai){
		super(maTaiLieu,tenNSX,soPhatHanh,giaNhap);
		this.soTrang=soTrang;
		this.ngayPhatHanh=ngayPhatHanh;
		this.ngayHienTai=ngayHienTai;
		this.giaBan=giaBan;
	}
	
	
	public int getSoTrang(){
		return this.soTrang;
	}
	public int getNgayPhatHanh(){
		
	if(this.ngayPhatHanh <=31 ){
			return this.ngayPhatHanh;
		}
		else{
			return 30;
		}
		
	}
	public int getNgayHienTai(){
		
	if(this.ngayHienTai <=31 ){
			return this.ngayHienTai;
		}
		else{
			return 30;
		}
		
	}
	public double getGiaBan(){
		if(this.ngayHienTai-this.ngayPhatHanh >2){
			
			return super.getGiaNhap()*0.8;
		}else 
		
		return super.getGiaNhap()*1.2;
	}
	
	public void setSoTrang(int SoTrang){
		this.soTrang=soTrang;
		
	}
	public void setNgayPhatHanh(int ngayPhatHanh){
		this.ngayPhatHanh=ngayPhatHanh;
		
	}
	public void setNgayHienTai(int ngayHienTai){
		this.ngayHienTai=ngayHienTai;
		
	}
	
	@Override
	
	public String toString(){
		return "BAO :[ MA TAI LIEU:"+getMaTaiLieu()+" - TEN NHA SAN XUAT: "+getTenNSX()+" - SO PHAT HANH: "+getSoPhatHanh()+" - SO TRANG: "+getSoTrang()+" - NGAY PHAT HANH: "+getNgayPhatHanh()+" - NGAY HIEN TAI: "+getNgayHienTai()+" - GIA NHAP: "+getGiaNhap()+" - GIA BAN: "+getGiaBan();
	}
	}