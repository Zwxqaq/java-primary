package oop;

public class Item extends Object{
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "对象正在被内存清除");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Item) {
            return this.price == ((Item) obj).price;
        }
        return false;
    }

    public static void main(String[] args) throws Throwable {
        Item item1 = new Item("垃圾箱",20.8f);
        Item item2 = new Item("垃圾桶",20.8f);
        System.out.println(item1.toString());
        item1.finalize();
        System.out.println(item1.equals(item2));
        System.out.println(item1 == item2);


    }
}
