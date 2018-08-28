package loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算阶乘的数字：");
        int num = scanner.nextInt();
        int res = 1;
        while (num > 1) {
            res *= num;
            num--;
        }
        System.out.println("阶乘是：" + res);
    }
}
