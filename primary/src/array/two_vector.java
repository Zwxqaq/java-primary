package array;

import java.util.Arrays;

public class two_vector {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNum();
                System.out.print(arr[i][j] + "  ");
                if (j == 4) {
                    System.out.println();
                }
            }
        }
        System.out.println("------------");
        int max = 0;
        int target_i = 0;
        int target_j = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }
        System.out.println("最大数为 ：" + max);
        System.out.println("其坐标为 ：[" + (target_i+1) + "]["  + (target_j+1) + "]");
        int[] a = {99, 8, 7 ,11};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 99));
    }

    public static int randomNum() {
        return (int) (Math.random()*100);
    }
}
