public class MainP2{
	public static void main (String[] args){
		
		// cau a 
       QuanLyTaiLieu a1=new QuanLyTaiLieu("FHS12356","NXB VAN HOC " ,15,50000);

       System.out.println("QUAN LY TAI LIEU ");
       System.out.println("MA TAI LIEU :"+a1.getMaTaiLieu() );
       System.out.println("TEN NHA SAN XUAT:"+a1.getTenNSX());
       System.out.println("SO PHAT HANH :"+a1.getSoPhatHanh());
       System.out.println("GIA NHAP  :"+a1.getGiaNhap());
	   System.out.println(a1.toString());

	    Sach b1 =new Sach("345DFSDF","NXB VAN HOC",12,120000,"NGUYEN NHAT ANH",200);
		System.out.println("\n ");
        System.out.println("SACH  " );
       
       System.out.println("MA TAI LIEU :"+b1.getMaTaiLieu() );
       System.out.println("TEN NHA SAN XUAT:"+b1.getTenNSX());
       System.out.println("SO PHAT HANH :"+b1.getSoPhatHanh());
       System.out.println("GIA NHAP  :"+b1.getGiaNhap());
	   System.out.println("TAC GIA :"+b1.getTenTacGia());
	   System.out.println("SO TRANG :"+b1.getSoTrang());
	   System.out.println(b1.toString());
	   
	   
	   
	   TapChi c1 =new TapChi("345DFSDF","NXB VAN HOC",12,120000,200,7,12);
		System.out.println("\n ");
        System.out.println("TAP CHI   " );
       
       System.out.println("MA TAI LIEU :"+c1.getMaTaiLieu() );
       System.out.println("TEN NHA SAN XUAT:"+c1.getTenNSX());
       System.out.println("SO PHAT HANH :"+c1.getSoPhatHanh());
       System.out.println("GIA NHAP  :"+c1.getGiaNhap());
	   System.out.println("SO TRANG :"+c1.getSoTrang());
	   System.out.println("THANG PHAT HANH :"+c1.getThangPhatHanh());
	   System.out.println("THANG HIEN TAI :"+c1.getThangHienTai());
	   System.out.println(c1.toString());
	   
	   Bao d1 =new Bao("345DFSDF","NXB VAN HOC",12,120000,200,25,27);
		System.out.println("\n ");
        System.out.println("BAO " );
       
       System.out.println("MA TAI LIEU :"+d1.getMaTaiLieu() );
       System.out.println("TEN NHA SAN XUAT:"+d1.getTenNSX());
       System.out.println("SO PHAT HANH :"+d1.getSoPhatHanh());
       System.out.println("GIA NHAP  :"+d1.getGiaNhap());
	   System.out.println("SO TRANG :"+d1.getSoTrang());
	   System.out.println("NGAY PHAT HANH :"+d1.getNgayPhatHanh());
	   System.out.println("NGAY HIEN TAI :"+d1.getNgayHienTai());
	   System.out.println(d1.toString());   
		
		// cau b
		int n=4;
		QuanLyTaiLieu[] arrS=new QuanLyTaiLieu[n];
		arrS[0]=new QuanLyTaiLieu("FHS12356","NXB VAN HOC " ,15,50000);
		arrS[1]=new Sach("345DFSDF","NXB VAN HOC",12,120000,"NGUYEN NHAT ANH",200);
		arrS[2]=new TapChi("345DFSDF","NXB VAN HOC",12,120000,200,7,12);
		arrS[3]=new Bao("345DFSDF","NXB VAN HOC",12,120000,200,25,27);
		System.out.println("\nTHONG TIN TAI LIEU :");
		for(int i=0;i<n;i++){
		
       System.out.println(arrS[i].getMaTaiLieu() );
       System.out.println(arrS[i].getTenNSX());
       System.out.println(arrS[i].getSoPhatHanh());
       System.out.println(arrS[i].getGiaNhap());
	   System.out.println(arrS[i].getGiaBan());
	   System.out.println(arrS[i].toString());
		
		
		}
		
		
			
		
}

}