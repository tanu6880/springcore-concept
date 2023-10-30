package org.example.setter_injection.refence;

import java.util.List;

public class Contact {
    private List<Long> number;

    public List<Long> getNumber() {
        return number;
    }

    public void setNumber(List<Long> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number=" + number +
                '}';
    }
}
