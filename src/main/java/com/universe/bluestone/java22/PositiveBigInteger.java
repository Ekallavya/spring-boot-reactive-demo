package com.universe.bluestone.java22;

import java.math.BigInteger;

public class PositiveBigInteger extends BigInteger {
    
    public PositiveBigInteger(long value) {
        // 1. PROLOGUE (Statements before super)
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
        
        // 2. INVOCATION
        super(Long.toString(value)); 
        
        // 3. EPILOGUE
        System.out.println("Object successfully created!");
    }
}