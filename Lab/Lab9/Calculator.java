import java.util.Scanner;
import java.util.InputMismatchException; 
public class  Calculator {
public static double divide (int a,int b) throws ArithmeticException {
	
	if(b==0){
		throw new ArithmeticException("divide by zero");
		
	}
	return a/b;
}
public static int multiply (int a,int b) throws NumberOutOfRangeException{
	int result1=a*b;
	if(Math.abs(a) >1000 || Math.abs(b) >1000){
		throw new NumberOutOfRangeException("Number is outside the computation ");
		
	}
	return a*b;
}
public static void main(String[] args) {     
	 Scanner sc = new Scanner(System.in);      
	 boolean isError = false; 
 
        do {   
		System.out.println("Nhap a va b ");
		
		
		
		try {     
			System.out.println("Nhap a: ");
		int numerator = sc.nextInt(); 
		System.out.println("Nhap b: ");
		 int denominator = sc.nextInt();	
		
		
		divide(numerator,denominator);
		System.out.println("divide= "+ numerator / denominator); 	
		try{
			multiply(numerator,denominator);
       System.out.println("multiply= "+ numerator * denominator); 
		}catch (NumberOutOfRangeException e){
			
			sc.nextLine();
			System.err.println("Number is outside the computation");   
		}	   
		isError = false;          
		} catch (InputMismatchException e) {     
		System.err.println("Incorrect input");    
		sc.nextLine();          
		isError = true;             }     
		} while (isError);    
		}

}