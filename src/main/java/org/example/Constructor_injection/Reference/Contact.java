package org.example.Constructor_injection.Reference;

import java.util.List;

public class Contact {
    private List<Long> number;

    public Contact() {
    }

    public Contact(List<Long> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number=" + number +
                '}';
    }
}
