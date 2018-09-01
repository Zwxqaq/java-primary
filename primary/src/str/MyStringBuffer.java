package str;

public class MyStringBuffer implements IsStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer() {
        value = new char[capacity];
    }

    public MyStringBuffer(String str) {
        this();
        if (str == null) {
            return;
        }

        if (capacity < str.length()) {
            capacity = value.length * 2;
            value = new char[capacity];
        }

        if (capacity >= str.length()) {
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        }

        length = str.length();
    }

    @Override
    public void append(String str) {
        insert(length,str);
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {

    }

    @Override
    public void insert(int pos, String b) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        for (int i = 0; i < length/2; i++) {
            char temp = value[i];
            value[i] = value[value.length - i -1];
            value[value.length -i -1] = temp;
        }
    }

    @Override
    public int length() {
        return 0;
    }
}
