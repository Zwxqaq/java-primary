package str;

public class PrimeNum {
    public static void main(String[] args) {
        int i = 10000000;
        int count = 0;
        for (int num = 1; num <= i; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println("一千万内质数有" + count);
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
