package oop;

public class Support extends Hero {
    public void heal() {
        System.out.println(name + "治疗了xxx" );
    }
    public void heal(Hero... heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(name + "治疗了" + heroes[i].name);
        }
    }

    public static void main(String[] args) {
        Support naima = new Support();
        naima.name = "奶妈";

        Hero garen = new Hero();
        Hero timor = new Hero();
        garen.name = "盖伦";
        timor.name = "提莫";
        naima.heal(garen,timor);
    }
}
