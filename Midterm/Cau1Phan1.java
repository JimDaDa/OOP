import java.util.Scanner;
public class Cau1Phan1{
	
	// cau b : Xuat mang A 
public static void xuatMang(int arr[] ,int n){
	System.out.println("Gia tri cua mang la ");
		for(int i=0;i<n;i++){
			System.out.println("A["+i+"]= "+arr[i]);
		}
	}
	
	// cau c : Liet ke phan tu am trong mang 
	public static void lietKeAm (int arr[] ,int n){
		int i;
		
		for (  i=0;i<n;i++){
			if(arr[i]<0){
				System.out.println("Phan tu am trong mang : "+arr[i]);
				
	} 
	   
	}
	
		do{
				System.out.println("Khong co phan tu am trong mang ");
		}while(i==n-1);
		
	    
		
	}
	
	//d : liet ke  so nguyen to 
	public static boolean checkNT(int n){
        if(n<=1) 
			
			return false;
			
        for (int i = 2;i <= Math.sqrt(n); i++)
            if(n%i==0) 
				return false;
        
        return true;
    }
	
	public static void lietKeNT( int arr[], int n){
		int i;
		
		for(i = 0; i<n;i++){
			if(checkNT(arr[i])==true){
				System.out.print("\nSo nguyen to trong mang la: ");
				System.out.print(arr[i]);
			}
		}
		System.out.print("\n");
	}
	
	//cau e :vi tri am dau tien
	public static void amDau (int arr[] ,int n){
		int i;
		int in=arr[0];
		for ( i=0;i<n;i++){
			if(arr[i]<0){
				in=arr[i];
				System.out.println("Vi  tri am dau tien trong mang:"+(i+1));
				
				
				break;

	}if(i==n-1) {
		System.out.println("Khong co phan tu am nao ");
		break;
	}
	
		}
		
	}
	
	// cau f : tim max am 

public static int maxAm(int arr[] ,int n){
	
	
	int max1=0;
	for (int i=0;i<n;i++)
	{
		if(arr[i]<0){
			  max1=arr[i];
		}
		for(int j=0;j<n;j++){
		if ((arr[j] >  max1 ||  max1==0 )&& arr[j]<0){
			 max1=arr[j];
			
		
		}
		
		} 
	
	}

return  max1;
}

// cau g : Tinh tong cac phan tu am 
public static int sumAm(int arr[] ,int n){
	int tongAm=0;
	for(int i=0;i<n;i++){
		if(arr[i]<0){
			tongAm+= arr[i];
		}
	}
	return tongAm;
}
//f trung binh cong cua so am 
public static void tbcAm (int arr[] ,int n){   
int sa=0;
int dem=0;
float tbca;
int i;
for ( i = 0; i < n; i++) {
        if (arr[i] <0 ) {
            sa += arr[i];
            dem++;   
        }
		
    }
         
    tbca = (float)sa / dem;
    System.out.println("Trung binh cong so am  " +tbca);
       
}
	
	
public static void main(String[] args){
	int arr[]=new int[100];
	int n;
	int min,max ,sum;
	Scanner sa= new Scanner(System.in);

			do 
		{
			// cau a Nhap n phan tu nguyen 
			System.out.println("Nhap so phan tu cua mang");
			n=sa.nextInt();
		}while (n<=0|| n>=100);
			System.out.println("Nhap gia tri cho mang:");
			
			//cau b xuat mang A 
			System.out.println("Gia tri cua mang : ");
		for(int i=0;i<n;i++){
			System.out.print("A["+i+"]=: ");
			arr[i]=sa.nextInt();
		}
		//cau b 
		xuatMang(arr,n);
		// cau c
		lietKeAm(arr,n);
		//cau d
		lietKeNT(arr,n);
		//cau e
		amDau(arr,n);
		//cau f 
		System.out.println("Gia tri am lon nhat cua mang la : "+maxAm(arr,n));
		//cau g
		System.out.println("Tong cac so am trong mang la  : " +sumAm(arr,n));
		//cau h
		tbcAm(arr,n);
		
		
}
}