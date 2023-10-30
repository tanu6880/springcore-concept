package org.example.LifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Botel implements InitializingBean, DisposableBean {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("seeting price");
    }

    @Override
    public String toString() {
        return "Botel{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
}
