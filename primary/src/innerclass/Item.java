package innerclass;

public abstract class Item {
    private String name;
    public abstract boolean disposable();
    class nonStatic {
        public void print() {
            System.out.println("我是非静态内部类");
        }
    }
    static class staticClass {
        public void print() {
            System.out.println("我是静态内部类");
        }
    }
    public static void main(String[] args) {

        Item item = new Item() {
            @Override
            public boolean disposable() {
                System.out.println("正常情况物品不消失...");
                return true;
            }
        };
        item.disposable();

        class LifePotion extends Item {
            @Override
            public boolean disposable() {
                System.out.println("血瓶用完消失...");
                return false;
            }
        }
        LifePotion lifePotion = new LifePotion();
        lifePotion.disposable();

    }
}
