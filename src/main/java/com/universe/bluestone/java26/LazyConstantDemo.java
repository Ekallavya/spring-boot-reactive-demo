//package com.universe.bluestone.java26;
//
//import java.lang.LazyConstant;
//
//public class LazyConstantDemo {
//    // 1. Declare the LazyConstant with an initialization "recipe" (Supplier)
//    private static final LazyConstant<String> CONFIG_VALUE =
//        LazyConstant.of(() -> {
//            System.out.println("--> Loading heavy configuration...");
//            return "Production_v2.4";
//        });
//
//    public static void main(String[] args) {
//        System.out.println("Application started.");
//        System.out.println("Config initialized? " + CONFIG_VALUE.isInitialized());
//
//        // 2. First access triggers the initialization logic
//        System.out.println("Value: " + CONFIG_VALUE.get());
//
//        // 3. Subsequent accesses return the cached value directly
//        System.out.println("Value again: " + CONFIG_VALUE.get());
//    }
//}