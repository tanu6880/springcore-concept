package org.example.Autowiring.Anootations;

public class Address {

    private String city;

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
