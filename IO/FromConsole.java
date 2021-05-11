import java.io.BufferedReader;

public class FromConsole {
    public static void ReadConsole(){
        System.out.println("Inside ReadConsole ");
        String data;
        System.out.println("Please Enter \"start\" to start ");

        try (BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in, "UTF-8"))) {
            while((data = br.readLine())!= null && !data.equals("start") ){
                System.out.println("DID NOT ENTER start, try again");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Correct");
    } 
    
    public static void main(String[] args) {
        try {
            ReadConsole();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
