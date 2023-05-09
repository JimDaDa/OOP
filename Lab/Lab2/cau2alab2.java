import java.util.Scanner;
public class cau2alab2{
public static void main (String[] args){
int a,b;
Scanner sa= new Scanner(System.in);
		do{
		System.out.println("Nhap so hang : ");
		a=sa.nextInt();
		System.out.println("Nhap so cot : ");
		b=sa.nextInt();
		}while(a<1||b<1);
		
		 int arr1[][]=new int[a][b];
		 int arr2[][]=new int[a][b];
		 int sum[][]=new int[a][b];
		 
		 
		System.out.println("Nhap ma tran 1:");
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("arr1["+i+","+j+"]=");
				arr1[i][j]=sa.nextInt();
			}
		}
		System.out.println("Nhap ma tran 2:");
		
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("arr2["+i+","+j+"]=");
				arr2[i][j]=sa.nextInt();
			}
		}
		
		
	
	System.out.println("MA TRAN 1");
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr1[i][j] + "\t");
				
			}
			System.out.print( "\n");
		}
		System.out.println("MA TRAN 2");
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr2[i][j] + "\t");
				
			}
			System.out.print( "\n");
		}
	
	for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				sum[i][j]=arr1[i][j]+arr2[i][j];
		}
		}
				System.out.println("Tong 2 ma tran la :");
				for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println( "\n");
				}

}
}
				
				