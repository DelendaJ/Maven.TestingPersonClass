package com.zipcodewilmington.person;


/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private long hairProducts;
    private double favoriteMovie;
    private boolean isHappy;
    private char favFood;
    private String favVacationSpot;



    public Person() {
        this("", Integer.MAX_VALUE);

    }

    public Person(String name){
        this(name, Integer.MAX_VALUE);
    }

    public Person(int age) {
        this("", age);
    }

    public Person (long hairProducts) {
        this.hairProducts = hairProducts;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHairProducts (long hairProducts) {
        this.hairProducts = hairProducts;
    }

    public long getHairProducts() {
        return hairProducts;

    }
}
