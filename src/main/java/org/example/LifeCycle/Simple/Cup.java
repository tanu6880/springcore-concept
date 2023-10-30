package org.example.LifeCycle.Simple;

public class Cup {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "price=" + price +
                '}';
    }

    public void init()
    {
        System.out.println("Init Method");
    }

    public void Destroy()
    {
        System.out.println("destroy Method");
    }

}
