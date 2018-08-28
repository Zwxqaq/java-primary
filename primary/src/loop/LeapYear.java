package loop;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查询闰年的年份");
        int leapYear = scanner.nextInt();
        if (leapYear%4 == 0 && leapYear%100 != 0) {
            System.out.println(leapYear + "是闰年");
        } else if (leapYear % 400 == 0) {
            System.out.println(leapYear + "是闰年");
        } else {
            System.out.println(leapYear + "不是闰年");
        }
    }
}
