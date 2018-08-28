package innerclass;

/**
 * 匿名类
 */
public abstract class Hero3 {
    String name;
    public abstract void attack();

    public static void main(String[] args) {
        int count = 3;
        Hero3 hero3 = new Hero3() {

            @Override
            public void attack() {
                System.out.println("new  attack...." + count + "次数");
            }

        };
        hero3.attack();

        class SomeHero extends Hero3 {

            @Override
            public void attack() {
                System.out.println(name + "attack...." + count + "次数");
            }
        }
        SomeHero hero = new SomeHero();
        hero.name = "德玛西亚皇子";
        hero.attack();


    }
}
