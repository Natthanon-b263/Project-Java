

public class Exercise07 {
  public static void main(String[]args) throws FileNotFoundException, IOException {
      long startTime = System.currentTimeMillis();
      String strIn= "C:\\JavaEx9\\Exercise01.java";
      String strOut= "C:\\JavaEx9\\Exercise01.txt";
      BufferedReader in = new BufferedReader (new FileReader(strIn));
      String strLine;
      PrintWriter out = new PrintWriter (new FileWriter(strOut));
      while((strLine=in.readLine())!=null){
          System.out.println(strLine);
          out.println(strLine);//println to Exercise01.txt
      }
    in.close(); out.close();
    System.out.println("Total time (nmillisecs) :"
           +(System.currentTimeMillis()-startTime));
    }
}