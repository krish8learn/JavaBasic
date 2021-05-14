import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Demo2 {
    public static void NewDateTime(){
        //software renewal
        LocalDate expDate = LocalDate.of(2020, Month.DECEMBER, 18);
        System.out.println(expDate);
        System.out.println(expDate.plusMonths(9));
        System.out.println(expDate.getYear()+" "+expDate.getDayOfWeek()+" "+expDate.getDayOfYear());
        System.out.println(expDate.getMonthValue() +" "+expDate.lengthOfMonth());
        //System.out.println(expDate.get(ChronoField.EPOCH_DAY));
        System.out.println(expDate.get(ChronoField.YEAR));

        LocalDate epoch = LocalDate.parse("1970-01-02");
        System.out.println(epoch.getYear());

        //start time
        LocalTime time = LocalTime.of(9, 00,00);
        System.out.println(time +" "+time.getHour());
        System.out.println(LocalTime.now());


        //start date time
        LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/London"));
        System.out.println(zdt);

        //age calculation
        LocalDate birthday = LocalDate.of(1995, 9, 17);
        Period age = birthday.until(LocalDate.now());
        System.out.println(age);
        System.out.println(age.toString());
        System.out.println(age.getYears()+","+age.getMonths()+","+age.getDays());
        System.out.println(age.toTotalMonths());

        Instant s = Instant.now();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Demo2.NewDateTime();
    }
}
