package org.example.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> name;
    private Set<Integer> roll;
    private Map<Integer,String> teacher;
    private Properties student;

    public Person() {
    }

    public Person(List<String> name, Set<Integer> roll, Map<Integer, String> teacher, Properties student) {
        this.name = name;
        this.roll = roll;
        this.teacher = teacher;
        this.student = student;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Set<Integer> getRoll() {
        return roll;
    }

    public void setRoll(Set<Integer> roll) {
        this.roll = roll;
    }

    public Map<Integer, String> getTeacher() {
        return teacher;
    }

    public void setTeacher(Map<Integer, String> teacher) {
        this.teacher = teacher;
    }

    public Properties getStudent() {
        return student;
    }

    public void setStudent(Properties student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", roll=" + roll +
                ", teacher=" + teacher +
                ", student=" + student +
                '}';
    }
}
