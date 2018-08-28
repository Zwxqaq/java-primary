package innerclass;

/**
 * 非静态内部类
 */
public class Hero {
    private String name;
    float hp;
    class BattleScore {
        int kill;
        int die;
        public void legendary() {
            if (kill > 8) {
                System.out.println(name + "已经超神了！");
            } else {
                System.out.println(name + ".....");
            }
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        BattleScore score = garen.new BattleScore();
        score.kill = 100;
        score.legendary();
    }
}
