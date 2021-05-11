import java.util.Scanner;

public class FromConsole1 {
    public static void ReadConsole(){
        System.out.println("Inside Console");
        String data ;

        System.out.println("Enter only \"start\"....");
        try (Scanner sc = new Scanner(System.in)) {
            while ((data = sc.nextLine())!= null && !data.equals("start")) {
                System.out.println("try again");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
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
