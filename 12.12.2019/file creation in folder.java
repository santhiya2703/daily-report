
package javaapplication30;

import java.io.File;
import java.io.IOException;


public class FileDemo{

    public static void main(String[] args) throws IOException {
        for(int i=1;i<=10;i++){
            File dir=new File("folder"+i);
            dir.mkdir();
            for(int j=1;j<=10;j++){
                File file=new File("folder"+i+"//file"+j+".txt");
                file.createNewFile();
            }
        }
        
    }
    
}
