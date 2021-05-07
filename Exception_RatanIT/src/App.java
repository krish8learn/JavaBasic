import java.io.FileInputStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("UNCHECKED EXCEPTION");

        //ArithmeticException
        //System.out.println(10/0);

        //ArrayIndexoutofBoundException
        //int[] a = {20,23};
        //System.out.println(a[4]);

        //NumberFormatException
        //Integer i = Integer.valueOf("ten");

        //stringIndexoutofBoundException
        //System.out.println("ratan".charAt(19));

        System.out.println("CHECKED EXCEPTION");
        //Thread.sleep(100); //Interrupted exception, will not compile

        //File Not found Exception
        //FileInputStream fis = new FileInputStream("abc.text"); 

        //these are not compiled exception, runtime exception

        System.out.println("ERRORS, UNCHECKED EXCEPTION");
        //errors
        //int[] a = new int[10000000000000];
    }
}
