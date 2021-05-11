import java.util.Scanner;

class PipeException{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int input = sc.nextInt();
            sc.close();
            System.out.println(10/input);
            System.out.println("ratan".charAt(19));
        }catch(ArithmeticException|NumberFormatException e){
            System.out.println("AE or NFE");
        }catch(ClassCastException|StringIndexOutOfBoundsException|NullPointerException e){
            System.out.println("CCE,SIOBE,NPE");
        }
        System.out.println("THESE ARE ALL UNCHECKED EXCEPTION");
    }
}