public class ExceptionTest {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("tania".charAt(19));
        }finally{
            int[] ab = {10, 19};
            System.out.println(ab[8]);
            System.out.println("only finally block exception will be executed");
        }
    }
}
