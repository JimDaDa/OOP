import java.util.Scanner;
public class cau1blab2 {
	
	public static void xuat_mang(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
	public static void xoa_pt(int arr[] ,int n ,int x){
		int i,d;
			for (  d=i=0;i<n;i++){
				
					if(arr[i]!=x){
						arr[d]=arr[i];
						d++;
					}
					
				}
			
			n=d;
			xuat_mang(arr,n);
			}
			
			
			
			public static void main (String[] args){
				int arr[]=new int[100];
	            int n;
	            Scanner sa= new Scanner(System.in);

			do 
		{
			System.out.println("Nhap so phan tu cua mang");
			n=sa.nextInt();
		}while (n<=0|| n>=99);
			System.out.println("Nhap gia tri cho mang:");
		for(int i=0;i<n;i++){
			System.out.print("Gia tri cua mang ["+i+"]=: ");
			arr[i]=sa.nextInt();
		}
		xuat_mang(arr,n);
			int x;
			// Nhap vi tri can xoa 
			
		System.out.println("Nhap so can xoa: ");
		x=sa.nextInt();
		
		System.out.println("mang sau khi xoa ");
		xoa_pt(arr,n,x);
			}
	
	
	
	
}