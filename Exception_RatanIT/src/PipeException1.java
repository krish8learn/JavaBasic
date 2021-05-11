import java.io.FileNotFoundException;

public class PipeException1 {
    public static void main(String[] args) {
        try{
            thread.sleep(100);
            FileInputStream fis = new FileInputStream("ABC.txt");
        }catch(InterruptedException|FileNotFoundException e ){
            System.out.println("IE,NFE");
        }
        System.out.println("THESE ARE ALL CHECKED EXCEPTION, MEANS EXCEPTION RAISING CODE MUST BE IN THE TRY BLOCK");
    }
}
