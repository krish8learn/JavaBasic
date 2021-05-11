public class Throw {
    void m1() throws InterruptedException{
        System.out.println("Inside m1");
        System.out.println(10/0);
        System.out.println("End of m1");
    }

    void m2(){
        m1();
        /*try{
            System.out.println("Inside m2");
            m1();
        }catch(Exception ae){
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        Throw th = new Throw();
        th.m2();
        System.out.println("The m1 throws the exception which is handled by m2");
    }
}
