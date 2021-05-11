import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//reading data from file with the help of buffer
public class IOByteStreamDemo1 {
    public static void FileCopyBuffer() throws FileNotFoundException{
        System.out.println("Inside FileCopyBuffer");
        long startTime, elapsedtime;
        //open the file, printing the length
        File in = new File("870886.jpg");
        System.out.println("The file size in Bytes: "+in.length());
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("870886.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.jpg"))) {
                startTime = System.nanoTime();
                byte[] bytebuf = new byte[40000];
                int byteRead;
                while((byteRead = bis.read(bytebuf))!= -1){
                    bos.write(bytebuf, 0, byteRead);
                }
                elapsedtime = System.nanoTime() - startTime;
                System.out.println("Elapsed Time :"+elapsedtime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FileCopyBuffer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
