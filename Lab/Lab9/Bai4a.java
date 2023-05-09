import java.io.*;
import java.io.FilenameFilter;
public class Bai4a {
       public static void main(String a[]){
        File file = new File("D:/51900491_lab9");
           String[] list = file.list(new FilenameFilter() {
           @Override
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}