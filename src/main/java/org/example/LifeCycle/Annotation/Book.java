package org.example.LifeCycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

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
        return "Book{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void hey()
    {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy method");
    }
}
