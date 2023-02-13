package com.hspedu.generic.homework;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author Agony
 * @Create 2023/2/13 20:09
 * @Version 1.0
 */
public class Homework {
    public static void main(String[] args) {

        // !!!!!!!!!!!  接口的属性是静态的！！！！！！！！！！！！！  而且是 pubic static final

        ArrayList<Employee> employees = new ArrayList<>();

        Employee jack = new Employee("jack", 10000, new MyDate(1999, 12, 9));
        Employee tom = new Employee("jack", 5000, new MyDate(1996, 4, 9));
        Employee smith = new Employee("jack", 6000, new MyDate(1888, 2, 6));

        employees.add(jack);
        employees.add(tom);
        employees.add(smith);

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        System.out.println("===========排序后=============");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int nameSort = o1.getName().compareTo(o2.getName());
                if (nameSort != 0) {
                    return nameSort;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    
    public void m1() {
        System.out.println("m1方法被调用");
    }
}


class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int mouth;
    private int day;

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "" + year + mouth + day;
    }

    @Override
    public int compareTo(MyDate o) {

        int yearSort = this.year - o.getYear();
        int monthSort = this.mouth - o.getMouth();
        int daySort = this.day - o.getDay();

        if (yearSort != 0) {
            return yearSort;
        } else if (monthSort != 0) {
            return monthSort;
        } else {
            return daySort;
        }

    }
}