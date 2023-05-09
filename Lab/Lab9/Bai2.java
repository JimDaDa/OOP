import java.util.*;
import java.io.*;
public class Bai2{
	public static void main(String[] args){
BufferedReader in=null;
BufferedWriter out=null;
try{
	in =new BufferedReader(new FileReader("D:/51900491_lab9/input.txt"));
	out=new BufferedWriter(new FileWriter("D:/51900491_lab9/output.txt"));
	String str;
	while ((str =in.readLine())!=null){
		out.write(str.toUpperCase());
		out.newLine();
		
	}
	
}
   catch(FileNotFoundException e){
	e.printStackTrace();
}
catch (IOException e){
	e.printStackTrace();
} finally {
	if (in!=null){
		try{
			in.close();
		}catch(IOException e){
			e.printStackTrace();
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
}