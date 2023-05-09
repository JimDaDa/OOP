import java.util.Scanner;
public class cau2blab2{
public static void main (String[] args){
int a,b;
Scanner sa= new Scanner(System.in);
		do{
		System.out.println("Nhap so hang : ");
		a=sa.nextInt();
		System.out.println("Nhap so cot : ");
		b=sa.nextInt();
		}while(a<1||b<1);
		int arr[][]=new int[a][b];
		
		System.out.println("Nhap ma tran ");
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("arr["+i+","+j+"]=");
				arr[i][j]=sa.nextInt();
			}
		}
		System.out.println("MA TRAN 1");
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.print( "\n");
		}
		System.out.println(" Nhap vao 1 so : ");
		int k=sa.nextInt();
		for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr[i][j]=arr[i][j]*k;
			}
		}
		
		
		
		System.out.println(" Ket qua ma tran la :");
				for (int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println( "\n");
				}
}
}