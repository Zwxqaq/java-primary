package digit;

public class AutoBox {
    public static void main(String[] args) {
        byte a = 127;
        Byte b = new Byte(a);
        System.out.println(b.byteValue());
        System.out.println(Byte.MAX_VALUE);
        short s = 1111;
        Short ss = new Short(s);
        System.out.println(ss.shortValue());
        int i = 12189281;
        Integer ii = new Integer(i);
        System.out.println(ii.intValue());
    }
}
