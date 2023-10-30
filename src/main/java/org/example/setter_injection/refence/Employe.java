package org.example.setter_injection.refence;

public class Employe {
    private int roll_number;
    private String name;
    private Contact contact;

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "roll_number=" + roll_number +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                '}';
    }
}
