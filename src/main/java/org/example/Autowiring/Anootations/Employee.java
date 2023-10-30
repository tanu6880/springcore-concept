package org.example.Autowiring.Anootations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

   @Autowired()
   @Qualifier("address")
    private Address address;

    public Employee() {
    }

    //@Autowired
    public Employee(Address address) {
        this.address = address;
        System.out.println("inside construtor method");
    }

    public Address getAddress() {
        return address;
    }

    //@Autowired(from setter method)
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("inside setter method");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
