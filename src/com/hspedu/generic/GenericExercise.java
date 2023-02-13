package com.hspedu.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author Agony
 * @Create 2023/2/12 13:35
 * @Version 1.0
 */
public class GenericExercise {

    public static void main(String[] args) {


        Student jack = new Student("jack", 18);
        Student tom = new Student("tom", 14);
        Student smith = new Student("smith", 28);
        HashSet<Student> students = new HashSet<>();
        students.add(jack);
        students.add(tom);
        students.add(smith);

        for (Student student : students) {
            System.out.println(student);
        }

        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put(jack.name, jack);
        stringStudentHashMap.put(tom.name, tom);
        stringStudentHashMap.put(smith.name, smith);

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}