import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Reading data from file without buffer
public class IOByteStreamDemo{
    public static void filecopyNoBuffer() throws FileNotFoundException{
        System.out.println("Inside No fileCopyNoBuffer");
        long startTime, elapsedtime;

        File fileIn = new File("870886.jpg");
        System.out.println("File size is "+ fileIn.length()+ " bytes");

        try(FileInputStream fis = new FileInputStream("870886.jpg");
            FileOutputStream fos = new FileOutputStream("ouput.jpg")){
                startTime = System.nanoTime();
                int byteRead;
                while((byteRead = fis.read())!=-1){
                    fos.write(byteRead);
                }
                elapsedtime = System.nanoTime() - startTime;
                System.out.println("Elapsed Time is :"+elapsedtime);
        }catch(IOException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            filecopyNoBuffer();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
}