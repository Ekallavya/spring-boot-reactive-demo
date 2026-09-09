package com.universe.bluestone.java9;

public class ImmutableCollectionsDemo {
    public static void main(String[] args) {
        var list = java.util.List.of("A", "B", "C");
        System.out.println(list);
        list.add("D");//Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
