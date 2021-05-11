class Test{
    static void status(int age) throws IsInvalidException{
        if (age>20){
            System.out.println("Eligible");
        }else{
            throw new IsInvalidException();
        }
    }

    public static void main(String[] args) throws IsInvalidException{
        Test.status(10);
    }
}