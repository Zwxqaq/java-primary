package except;

public class Hero {
    String name;
    float hp;
    public void attackHero (Hero hero) throws DeadException {
        if (hero.hp == 0) {
            throw new DeadException(hero.hp + "死了....还打？？？");
        }
    }
    class DeadException extends Exception {
        public DeadException() {
        }

        public DeadException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws DeadException {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 0;
        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 1231;
        try {
            teemo.attackHero(garen);
        } catch (DeadException e) {
            System.out.println("异常信息:" + e.getMessage());
//            e.printStackTrace();
        }
    }
}
