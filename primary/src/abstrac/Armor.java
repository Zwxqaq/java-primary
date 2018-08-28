package abstrac;

/**
 * ac 护甲等级
 */
public class Armor extends Item{
    int ac;
    @Override
    public boolean disposable() {
        return false;
    }
}
