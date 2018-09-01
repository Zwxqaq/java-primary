package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate4 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("今天是： " +sdf.format(c.getTime()));
        c.add(Calendar.MONTH,2);
        c.add(Calendar.DATE,-3);
        System.out.println("下个月倒数第三天是： " + sdf.format(c.getTime()));
    }
}
