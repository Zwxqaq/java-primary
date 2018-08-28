package str;

public class TestNum3 {
    public static void main(String[] args) {
        float f = 3.14f;
        String s = String.valueOf(f);
        System.out.println(s instanceof String);
        float ff = Float.parseFloat(s);
        System.out.println(ff + 3.14f);
//        float fff = Float.parseFloat("3.1a4");
//        System.out.println(fff);
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1+1d/n, n));
    }
}
