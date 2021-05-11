import java.io.*;
import java.util.*;
public class TryResource {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number");
            int num = sc.nextInt();
            System.out.println(num + " automatically closed the scanner object");
            System.out.println("Scanner--->closeable--->Autocloseable");
            System.out.println("sc.close() implicitly implemented by java.lang.Autocloseable()");
        }

        try(FileInputStream fis = new FileInputStream("abc.txt")){
            System.out.println("Resource throws checked exception, catch block manadatory, but for unchecked exception catch is not mandatory");
        }catch(IOException ar ){
            System.out.println(ar.getMessage());
            System.out.println("try resource can take multiple resources");
        }
    }
}
