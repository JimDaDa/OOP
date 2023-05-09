import java.util.Scanner;
public class cau1clab2 {
	
	public static void xuat_mang(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
	public static void chen_pt(int arr[] ,int n ,int gt,int x){
			for (int i=n;i>x;i--){
			arr[i]=arr[i-1];
			}
			arr[x]=gt;
			n++;
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
			int gt;
			// Nhap vi tri can chen
		System.out.println("Nhap 1 so can chen: ");
		gt=sa.nextInt();
		System.out.println("Nhap vi tri chen: ");
		x=sa.nextInt();
		
		System.out.println("mang sau khi xoa ");
		chen_pt(arr,n,gt,x);
			}
	
	
	
	
}