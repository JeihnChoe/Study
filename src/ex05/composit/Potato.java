package ex05.composit;

public class Potato {
    private int price;
    private String desc;

    public Potato(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public Potato() {
        this(800, "감자");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}