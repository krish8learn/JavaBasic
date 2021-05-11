public class assertDemo {
    public static void main(String[] args) {
        assertDemo as = new assertDemo();
        as.test(1);
    }

    void test(int i){
        assert i>5 :"invalid";
        System.out.println("Good");
    }
}
