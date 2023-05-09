import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
 
public class Bai4d {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "D:/51900491_lab9/file4d.txt";
             FileWriter fw = new FileWriter(filename,true); 
            
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("D:/51900491_lab9/file4d.txt"));
            
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
  }
