package com.tts.animal;

public class Pet {
    public Pet() {

    }

    public Pet(String name, int age, int location, int type) {
        this.name = name;
        this.age =age;


    }

    private String name;
    private int age;
    private String location;
    private String type;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    private String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}