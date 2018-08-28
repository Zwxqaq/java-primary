package loop;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查询的季节月份：");
        int seanson = scanner.nextInt();
        System.out.println("季节为：");
        switch (seanson) {
            case 12:
            case  1:
            case  2:
                System.out.println("冬天");
                break;
            case  3:
            case  4:
            case  5:
                System.out.println("春天");
                break;
            case  6:
            case  7:
            case  8:
                System.out.println("夏天");
                break;
            case  9:
            case  10:
            case  11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("输入有误");

        }
    }
}
