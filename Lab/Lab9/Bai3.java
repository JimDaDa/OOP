import java.util.*;
import java.io.*;
public class Bai3{
	public static void main(String[] args){
Scanner in=null;
BufferedWriter out=null;
try{
	in =new Scanner(new FileReader("D:/51900491_lab9/input3.txt"));
	out=new BufferedWriter(new FileWriter("D:/51900491_lab9/output3.txt"));
	int sum=0;
	while (in.hasNextInt()){
	sum+=in.nextInt(10);
		
		
	}
	out.write(String.valueOf(sum));
}
   catch(FileNotFoundException e){
	e.printStackTrace();
}
catch (IOException e){
	e.printStackTrace();
} finally {
	if (in!=null){
		in.close();
		
			
		}
	}
	if(out !=null){
		try{
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
}
