package abstrac;

/**
 * LifePotion血瓶
 */
public class LifePotion extends Item{
    public void useLifePotion() {
        System.out.println("使用血瓶，可以回血");
    }
    @Override
    public boolean disposable() {
        return true;
    }
}
