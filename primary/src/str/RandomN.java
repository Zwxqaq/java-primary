package str;

public class RandomN {
    public static void main(String[] args) {
        String random = "";
        for (short i = '0'; i <= '9'; i++) {
            random += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            random += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i ++) {
            random += (char) i;
        }
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * random.length());
            System.out.println(index);
            arr[i] = random.charAt(index);
        }
        String random_code = new String(arr);
        System.out.println(random_code);
    }
}
