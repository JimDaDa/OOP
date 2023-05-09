import java.util.Scanner;
public class Array{
	
	
	
	// cau a
	public static int maxEven(int arr[] ,int n){
	int max=arr[0];
	for (int i=0;i<n;i++)
	{
		if (arr[i]% 2== 0){
			max=arr[i];
		for (int j=0;j<n;j++){
			if(arr[j]>max && arr[j]%2==0)
				max=arr[j];
			
		}
		}
	}
	return max ;
}
// cau b
public static int minOdd(int arr[] ,int n){
	int min=arr[0];
	for (int i=0;i<n;i++)
	{
		if (arr[i]% 2!= 0){
			min=arr[i];
		for (int j=0;j<n;j++){
			if(arr[j]<min && arr[j]%2!=0)
				min=arr[j];
			
		}
		}
	}
	return min ;
}
// cau c 
public static int sumMEMO(int arr[] ,int n){
	int summemo;
	summemo=maxEven(arr,n)+minOdd(arr,n);
	return summemo;
}
// cau d
public static int sumEven(int arr[] ,int n){
	int sumeven=0;
	for(int i=0;i<n;i++){
		if(arr[i]%2==0){
			sumeven+= arr[i];
		}
	}
	return sumeven;
}
// cau e 
public static int prodOdd(int arr[] ,int n){
	int tich=1;
	for(int i=0;i<n;i++){
		if(arr[i]%2!=0){
			tich= tich *arr[i];
		}
	}
	return tich;
}
//cau f
public static int idxFirstEven(int arr[] ,int n){
	int vt=0;
	int i;
	for( i=0;i<n;i++){
		if (arr[i]% 2== 0){
			vt= i+1;
			break;
		}
	}
	return vt;
}
// cau g 
public static int idxLastOdd(int arr[] ,int n){
	int vt1=n-1;
	int i;
	for( i=n-1;i>=0;i--){
		if (arr[i]% 2!= 0){
			vt1= i+1;
			break;
		}
	}
	return vt1;
}
// cau h 
public static void input(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.println("Gia tri cua mang la "+arr[i]);
		}
	}
	// cau i
public static void main(String[] args){
	int arr[]=new int[100];
	int n;
	int min,max ,sum;
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
		input(arr,n);
		System.out.println("Gia tri lon nhat cua mang la : "+maxEven(arr,n));
		System.out.println("Gia tri nho nhat cua mang la : "+minOdd(arr,n));
		System.out.println("Tong cua so chan lon nhat va so le nho nhat  : "+sumMEMO(arr,n));
		System.out.println("Tong cac so chan  : "+sumEven(arr,n));
	System.out.println("Tich cac so le : "+prodOdd(arr,n));
	System.out.println("vi tri chan dau : "+idxFirstEven(arr,n));
	System.out.println("vi tri le cuoi : "+idxLastOdd(arr,n));
}
}