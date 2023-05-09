import java.util.Scanner;
public class cau1alab2 {
	public static void main(String[] args){
		
		int n,tam,key,last,first,mid;
		Scanner sa= new Scanner(System.in);
		int arr[] =new int[100];
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
		System.out.println("Nhap 1 so can tim: ");
		key=sa.nextInt();
		first=0;
		last=n-1;
		while (first<=last){
			mid=(first+last)/2;
			if(arr[mid]==key){
				System.out.println("Phan tu " +key+ " tai vi tri " +mid);
				return;
			}
			else if(arr[mid]<key){
				first=mid+1;
			}
			else {
				last=mid-1;
			}
		}
		System.out.println("Khong co gia tri can tim");
	}
}