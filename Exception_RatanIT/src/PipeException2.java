public class PipeException2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int input = sc.nextInt();
            sc.close();
            System.out.println(10/input);
            System.out.println("ratan".charAt(19));
            Thread.sleep(1000);
        }catch(ArithmeticException|NumberFormatException |InterruptedException e){
            System.out.println("AE or NFE or IE");
        }catch(ClassCastException|StringIndexOutOfBoundsException|NullPointerException e){
            System.out.println("CCE,SIOBE,NPE");
        }
        System.out.println("MIXED CHECKED AND UNCHECKED EXCEPTION");
        System.out.println("UNCHECKED EXCEPTION CODE MUST BE IN THE TRY BLOCK, UNLESS IT WILL NOT COMPILED");
        System.out.println("IF CHILD CLASS EXCEPTION PRESENT, NO NEED OF PARENT CLASS, IF PARENT CLASS PRESENT, NO NEED OF CHILD CLASS");
    }
}
