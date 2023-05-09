import java.util.Scanner;
public class bai3lab2{
	public static void main (String[] args){
		Scanner sa=new Scanner(System.in);
		String hoten;
		System.out.print("Nhap ho va ten: ");
		hoten=sa.nextLine();
		System.out.println(hoten);
		//tach ho va ten
		hoten=hoten.trim();
		int i=hoten.lastIndexOf(" ");
		String ten=hoten.substring(i+1);
		String ho=hoten.substring(0,hoten.indexOf(" "));
		System.out.println("Ho : " +ho);
		System.out.println("Holot: " +hoten.split(" ")[1]);
		System.out.println("Ten : " +ten);
		
		String strUpper=hoten.toUpperCase();
		System.out.println("Chuoi goc: " +hoten);
		System.out.println("Chuoi duoc viet hoa : " +strUpper);
		
	}
}