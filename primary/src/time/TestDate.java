package time;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(5000);
        System.out.println(d2);
        System.out.println(d2.toString());
        System.out.println(d1.getTime());
        long total_million_second = d1.getTime();
        System.out.println("year = " + total_million_second/1000/60/60/24/365);
        System.out.println("month = " + total_million_second/1000/60/60/24);
        Date d3 = new Date(0);
        System.out.println(d3);
        System.out.println(System.currentTimeMillis());
    }
}
