import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.InputStreamReader;

public class Exercise04 {
    public static void main(String[]args) {
        try{
        PrintStream out = new PrintStream
               (new FileOutputStream("C:\\JavaEx9\\Outputt3.txt",true));
        BufferedReader in = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Enter 3 Lines :");
        String stLine;
        for(int i=0;i<3;i++){
            System.out.print((i+1)+"-");
            stLine=in.readLine(); //input data from keyboard
            out.println(stLine);//print to file 1 line per time
        }//end loop for
    }//end try
    catch(IOException e){
        System.out.print("Exception occured in main");
    }
}//end main
}//end file