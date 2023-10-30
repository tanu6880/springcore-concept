package org.example.Constructor_injection.Reference;

public class Employe {
    private int roll_number;
    private String name;
    private Contact contact;

    public Employe() {
    }

    public Employe(int roll_number, String name, Contact contact) {
        this.roll_number = roll_number;
        this.name = name;
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
