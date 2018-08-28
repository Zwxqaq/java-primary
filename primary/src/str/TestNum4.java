package str;

public class TestNum4 {
    public static void main(String[] args) {
        String name = "xiawu";
        int count = 10000;
        String str = "%s 正在进行 %d 次杀人活动 %n";
        System.out.format(str,name,count);
    }
}
