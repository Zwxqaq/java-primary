package array;

public class reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9};
        int[] new_ = new int[5];
        for (int i = 0; i < arr.length; i++) {
            new_[i] = arr[arr.length - i - 1];
        }
        for (int num: new_) {
            System.out.print(num + " ");
        }
    }
}
