public class MainP1{
	public static void main (String[] args){
       Tivi a1=new Tivi("TV456789","Sony" ,43,10500000.0);

       System.out.println("TIVI ");
       System.out.println("MA TIVI :"+a1.getMaTiVi() );
       System.out.println("HANG SAN XUAT:"+a1.getHangSX());
       System.out.println("SO INCHE :"+a1.getSoInche());
       System.out.println("DON GIA  :"+a1.getGiaNhap());
	   System.out.println(a1.toString());

	   TiviTM b1 =new TiviTM("TV373299","SamSung",35,12500000,35,"QLED");
		System.out.println("\n ");
        System.out.println("TIVI THONG MINH " );
        System.out.println("MA TIVI :"+b1.getMaTiVi() );
        System.out.println("HANG SAN XUAT:"+b1.getHangSX());
        System.out.println("SO INCHE :"+b1.getSoInche());
        System.out.println("DON GIA  :"+b1.getGiaBan());
		System.out.println("HE MAU :"+b1.getHeMau());
        System.out.println("LOAI MAN HINH  :"+b1.getLoaiManHinh());
		System.out.println(b1.toString());
		
}

}