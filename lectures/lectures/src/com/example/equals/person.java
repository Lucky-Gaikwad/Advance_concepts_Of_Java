package com.example.equals;

import java.util.Objects;

public class person {
    private String name;
    private int age;
    private String id;

    public person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }
    // Self made equals

   /* @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof person)) {
            return false;
        }
        person per = (person) obj;
        return per.name.equals(name) &&
                per.age == age &&
                per.id.equals(id);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
