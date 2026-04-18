package com.universe.bluestone.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
