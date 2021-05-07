class ExceptionMessage{
    void method(){
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("sys call tostring internally and print the all details"+ae.toString());
            System.out.println("this print only description "+ae.getMessage());
            ae.printStackTrace();  
        }
    }
    
    public static void main(String[] args) {
        ExceptionMessage em = new ExceptionMessage();
        em.method();   
    }
}