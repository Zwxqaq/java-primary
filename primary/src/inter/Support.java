package inter;

public class Support extends Hero implements Healer {

    public Support(String name) {
        super(name);
        System.out.println(name + "对象被初始化....");
    }

    @Override
    public void heal() {
        System.out.println(this.getName() + "正在治愈.....");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        Object object = Class.forName("inter.Support");
        Support support = new Support("wind girl");
        support.heal();
    }
}
