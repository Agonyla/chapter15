package com.hspedu.generic.homework;

import java.util.*;

/**
 * @Author Agony
 * @Create 2023/2/14 20:30
 * @Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

        Dao<User> userDao = new Dao<>();
        userDao.save("001", new User(1, 18, "jack"));
        userDao.save("002", new User(2, 13, "tom"));
        userDao.save("003", new User(3, 23, "smith"));
        userDao.save("004", new User(4, 34, "marry"));

        List<User> list = userDao.list();
        System.out.println(list);

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

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Dao<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {

        ArrayList<T> ts = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            ts.add(entry.getValue());
        }

        return ts;

    }

    public void delete(String id) {
        map.remove(id);
    }
}