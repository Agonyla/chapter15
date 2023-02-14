package com.hspedu.generic.homework;

/**
 * @Author Agony
 * @Create 2023/2/14 20:30
 * @Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {


    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}