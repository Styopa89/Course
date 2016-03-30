package lesson8.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MYBirthday {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yy");
        Date birthday = format1.parse("01.05.89");
//        System.out.println(format1.format(birthday));
        System.out.println(format.format(birthday));
        Calendar c = new GregorianCalendar();
        c.setTime(birthday);
        SimpleDateFormat mount = new SimpleDateFormat("EEEE");
        System.out.println(mount.format(birthday));
        System.out.println(c.getDisplayName(7, 2, Locale.forLanguageTag("en")));
    }
}
