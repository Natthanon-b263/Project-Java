import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exercise01 {
    public static void main(String[]args) {
        try{
            File file=new File("C:\\JavaEx9\\friends.txt");
            FileInputStream in=new FileInputStream(file);
            int ch;
            while((ch=in.read())!=-1)
            System.out.print((char)ch);
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.print("File Not Found Exception occure in Main");
        }
        catch(IOException e){
           System.out.print("IOException occure in Main");  
        }
    }    
}