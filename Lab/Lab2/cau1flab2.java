import java.util.Scanner;
public class cau1flab2 {
	
	public static void xuat_mang(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
	public static void gia_tri_trung(int arr[] , int n){
		int j;
		 for(int i = 0; i < n; i++) {  
            for( j = i + 1; j < n; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
	}
		 }
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
		
		System.out.println("Gia tri trung trong mang la :");
		gia_tri_trung(arr,n);
	}
}