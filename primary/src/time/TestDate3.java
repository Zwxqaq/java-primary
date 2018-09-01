package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate3 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println(now);
        c.add(Calendar.MONTH,1);
        System.out.println(sdf.format(c.getTime()));
        c.add(Calendar.YEAR,-1);
        System.out.println(sdf.format(c.getTime()));
        c.add(Calendar.DATE,-13);
        System.out.println(sdf.format(c.getTime()));
    }
}
