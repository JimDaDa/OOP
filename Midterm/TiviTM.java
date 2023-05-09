public class TiviTM extends Tivi{
	private int heMau;
	private String loaiManHinh;
	private double giaBan;
	
	public TiviTM(){
		super();
		this.heMau=8;
		this.loaiManHinh="4K";
		this.giaBan=0;
	}
	public TiviTM(String maTivi ,String hangSX ,int soInche,double giaNhap,int heMau ,String loaiManHinh){
		super(maTivi,hangSX,soInche,giaNhap);
		this.heMau=heMau;
		this.loaiManHinh=loaiManHinh;
	}
	public int getHeMau(){
		if(this.heMau == 8 || this.heMau == 16 || this.heMau == 32){
			return this.heMau;
		}
		else{
			return 16;
		}
	}
	public String getLoaiManHinh(){
		if( this.loaiManHinh == "HD" || this.loaiManHinh == "4K" || this.loaiManHinh == "QLED"){
			return this.loaiManHinh;
		}
		else{
			return "HD";
		}
	}
	public void setHeMau(int heMau){
		this.heMau=heMau;
		
	}
	public void setLoaiManHinh(String loaiManHinh){
		this.loaiManHinh=loaiManHinh;
		
	}
	public double getGiaBan(){
		
		return super.getGiaNhap()*1.2;
	}
	@Override
	
	public String toString(){
		return "SMARTTIVI: [ MA TI VI :"+getMaTiVi()+" - HANG SAN XUAT: "+getHangSX()+" - INCHE: "+getSoInche()+" - HE MAU : "+getHeMau()+" - LOAI MAN HINH: "+getLoaiManHinh()+" - GIA NHAP: "+getGiaNhap()+" - GIA BAN: "+getGiaBan()+"]";
	}
}