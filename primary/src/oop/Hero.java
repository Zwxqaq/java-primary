package oop;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    void keng() {
        System.out.println("坑队友");
    }

    float getArmor() {
        return armor;
    }

    void addSpead(int speed) {
        moveSpeed = moveSpeed + speed;
    }

    void legendary() {
        System.out.println("超神了！");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood) {
        this.hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 500;
        System.out.println("当前盖伦血量 ：" + garen.hp);
        System.out.println("盖伦回血100");
        garen.recovery(100);
        System.out.println("现在盖伦血量 ：" + garen.hp);
    }
}
