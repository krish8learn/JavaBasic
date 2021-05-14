import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Demo1{
    public static void DateAPI(){
        System.out.println("INSIDE LEGACY API ");

        System.out.println("DATE CLASS");
        Date currentDate = new Date();
        System.out.println(currentDate+","+currentDate.getTime()+"ms");

        System.out.println("CALENDER CLASS");
        GregorianCalendar expDate = new GregorianCalendar(1995, 03, 17);
        System.out.println(expDate);
        System.out.println(expDate.getTime());
        expDate.add(01, 02);
        System.out.println(expDate);
        System.out.println(expDate.getTime());
        expDate.roll(3, 3);
        System.out.println(expDate.getTime());

        String[] timezone = TimeZone.getAvailableIDs();
        for(String ans : timezone){
            System.out.println(ans);
        }
        GregorianCalendar gametime = new GregorianCalendar(TimeZone.getTimeZone("Asia/Calcutta"));
        gametime.set(2020,GregorianCalendar.JANUARY, 03,9,00);
        System.out.println("time:"+gametime.getTime());
        System.out.println(gametime);
    }

    public static void main(String[] args) {
        Demo1.DateAPI();
    }
}