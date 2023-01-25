public class JavaApplication2 {
    public static void main(String[] args) {
        String t = null;
        try {
            String nt = t.toLowerCase();
            System.out.print("The values is :" + nt);
        } catch (ClassCastException e) {
            System.out.print("You aren't create String object ");
        }
        System.out.print(">>Exit block try-catch :Bye!");
    }
}
