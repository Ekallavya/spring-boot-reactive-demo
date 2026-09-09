package com.universe.bluestone.java21;

import java.lang.ScopedValue;

public class ScopedValueDemo {

    static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(USER, "Hello, Scoped World!")
            .run(() -> {
                System.out.println("Main: " + USER.get());
                child();
            });
    }

    static void child() {
        System.out.println("Child: " + USER.get());
    }
}