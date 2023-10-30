package org.example.Autowiring.Xml;

import org.example.Autowiring.Xml.Aadhar;

public class Employee {

    private Aadhar address;

    public Aadhar getAddress() {
        return address;
    }

    public void setAddress(Aadhar address) {
        this.address = address;
    }

    public Employee(Aadhar address) {
        System.out.println("call by construtor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
