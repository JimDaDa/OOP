import java.util.Scanner;
public class cau1dlab2{
	
	
	public static void xuat_mang(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
public static int tim_max(int arr[] ,int n){
	int max=arr[0];
	for (int i=0;i<n;i++)
	{
		if (max<arr[i]){
			max=arr[i];
		}
	}
	return max ;
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
	System.out.println("Gia tri lon nhat cua mang la : "+tim_max(arr,n));
	
}
}