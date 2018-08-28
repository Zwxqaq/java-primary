package innerclass;

/**
 * 静态内部类
 * 不能访问外部类对象属性
 */
public class Hero2 {
    private static String name = "蓝方";
    float hp;
    private static void win() {
        System.out.println(name + "获得了胜率");
    }
    static class EnemyCrystal {
        int hp = 5000;
        public void victory() {
            if (hp == 0) {
                System.out.println(name + "获得了胜率" );
            }
        }
    }

    public static void main(String[] args) {
        Hero2.EnemyCrystal crystal = new Hero2.EnemyCrystal();
        crystal.hp = 0;
        crystal.victory();
    }
}
