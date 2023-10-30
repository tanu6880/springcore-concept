package org.example.Constructor_injection.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private List<String> name;
    private Set<Integer> roll;
    private Map<Integer,String> teacher;
    private Properties student;

    public Student() {
    }

    public Student(List<String> name, Set<Integer> roll, Map<Integer, String> teacher, Properties student) {
        this.name = name;
        this.roll = roll;
        this.teacher = teacher;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", roll=" + roll +
                ", teacher=" + teacher +
                ", student=" + student +
                '}';
    }
}
