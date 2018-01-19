package com.lab111.labwork5;

public class Record {
    private String name, gender, city;
    private int age;

    public Record(String name, int age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", gender: " + gender + ", city: " + city +";";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
