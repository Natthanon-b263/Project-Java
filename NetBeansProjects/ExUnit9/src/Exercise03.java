import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise03 {
    public static void main(String[]args) 
            throws FileNotFoundException , IOException {
        FileOutputStream out1 = new FileOutputStream
                ("C:\\JavaEx9\\Outputt1.txt",false);
        byte [] data1={65,66,67,68,69};
        out1.write(data1);
            
        FileOutputStream out2 = new FileOutputStream     
                ("C:\\JavaEx9\\Outputt1.txt",true);
        byte [] data2={70,71,72,73,74};
        out2.write(data2);
            
        out1.close();
        out2.close();
    }
}
