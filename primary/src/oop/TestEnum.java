package oop;

public class TestEnum {
    public static void main(String[] args) {
        for (HeroType heroType: HeroType.values() ) {
            System.out.println(heroType);
        }
    }
}
