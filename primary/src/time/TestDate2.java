package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        Date d = new Date();
        String str = sdf.format(d);
        System.out.println(str);
    }
}
