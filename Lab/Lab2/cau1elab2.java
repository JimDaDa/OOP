import java.util.Scanner;
public class cau1elab2{
	
	
	public static void xuat_mang(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
public static int tim_min(int arr[] ,int n){
	int min=arr[0];
	for (int i=0;i<n;i++)
	{
		if (min>arr[i]){
			min=arr[i];
		}
	}
	return min ;
}
public static void main(String[] args){
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
	System.out.println("Gia tri nho nhat cua mang la : "+tim_min(arr,n));
	
}
}