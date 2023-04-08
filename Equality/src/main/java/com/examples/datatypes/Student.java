package com.examples.datatypes;

import java.util.Objects;

public record Student(int id, String name, String department) implements Comparable<Student> {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id() == student.id() && name().equals(student.name()) && department().equals(student.department());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id(), name(), department());
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
