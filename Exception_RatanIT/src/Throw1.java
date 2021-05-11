import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw1 {
    void m2() throws InterruptedException, FileNotFoundException{
        System.out.println("m2 does not handle exceptions, its just delegate those exceptions by using Throw keywords");
        Thread.sleep(1000);
        FileInputStream fis = new FileInputStream("abc.text");
        //fis.close();
    }

    void m1() throws InterruptedException{
        try{
            m2();
        }catch(FileNotFoundException ae){
            System.out.println(ae.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
            Throw1 th = new Throw1();
            th.m1();
        }catch(InterruptedException ae){
            ae.printStackTrace();
        }
    }
}
