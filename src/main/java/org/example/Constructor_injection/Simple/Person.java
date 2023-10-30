package org.example.Constructor_injection.Simple;

public class Person {
    private int emp_id;
    private String name;

    public Person() {
    }

    public Person(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                '}';
    }
}
