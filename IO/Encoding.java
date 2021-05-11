import java.util.Arrays;

public class Encoding{
    public static void apply(){
        printEncoding("k");
        printEncoding("K");
        printEncoding("8");
    }

    public static void printEncoding(String symbol){
        System.out.println("ENCODING OF "+symbol);

        try{
            System.out.println("ASCII--->"+Arrays.toString(symbol.getBytes("US-ASCII")));
            System.out.println("UTF-8---->"+Arrays.toString(symbol.getBytes("UTF-8")));
            System.out.println("UTF-16---->"+Arrays.toString(symbol.getBytes("UTF-16")));
            System.out.println("UTF 16 BE ---->"+Arrays.toString(symbol.getBytes("UTF-16BE")));
            System.out.println("UTF 16 LE ----->"+Arrays.toString(symbol.getBytes("UTF-16LE")));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        apply();
    }
}