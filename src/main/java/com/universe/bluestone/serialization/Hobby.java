package com.universe.bluestone.serialization;

class Hobby implements Cloneable {
    String name;
    Hobby(String name) { this.name = name; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Hobby hobby;

    Person(String name, Hobby hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Step 1: Clone the outer object (shallow copy)
        Person clonedPerson = (Person) super.clone();
        
        // Step 2: Manually clone the internal mutable fields (deep copy)
        clonedPerson.hobby = (Hobby) this.hobby.clone();
        
        return clonedPerson;
    }
}