public class ExceptionTest1 {
    public static void main(String[] args) {
        ExceptionTest1 t1 = new ExceptionTest1();
        System.out.println(t1.method()); 
    }

    int method(){
        try{
            return 10;
        }catch(Exception e){
            return 20;
        }finally{
            return 30;
        }
    }
}
