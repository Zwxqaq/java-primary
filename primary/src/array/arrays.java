package array;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[][] arr = new int[5][8];
        int[] copy_ = new int[40];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomNum();
            }
        }
        System.out.println("打印二维数组:");
        for (int[] i: arr ) {
            System.out.println(Arrays.toString(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i],0,copy_,i*arr[i].length,arr[i].length);
        }
        Arrays.sort(copy_);
        for (int i = 0; i < 5; i++) {
            System.arraycopy(copy_,i*arr[i].length,arr[i],0,arr[i].length);
        }
        System.out.println("打印排序后的二维数组:");
        for (int[] i: arr ) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int randomNum() {
        return (int) (Math.random()*100);
    }
}
