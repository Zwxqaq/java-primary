package str;

public class TestNum2 {
    public static void main(String[] args) {
        String str = "999";
        Integer i = Integer.valueOf(str);
        System.out.println(i instanceof Integer);
        System.out.println(i);
        int ii = Integer.parseInt(str);
        System.out.println(ii);
    }
}
