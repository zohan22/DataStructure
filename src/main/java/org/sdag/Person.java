package org.sdag;

public class Person {
    private final String name;
    private final int age;

    public Person(){
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person: "+this.name+" age: "+this.age;
    }
    public void print(){
        System.out.println("Name: "+this.name+", Age: "+this.age);
    }
}
