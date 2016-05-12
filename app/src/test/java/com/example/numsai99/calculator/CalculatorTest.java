package com.example.numsai99.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void oneaddone(){
        // Act
        double actualResult = calculator.addPlus(1,1);
        // Assert
        assertEquals(2.0,actualResult);
    }

    @Test
    public void oneminusone(){
        double actualResult = calculator.addMinus(1,1);
        assertEquals(0.0,actualResult);
    }

    @Test
    public void onemulone(){
        double actualResult = calculator.addMulti(1,1);
        assertEquals(1.0,actualResult);
    }

    @Test
    public void onedivone(){
        double actualResult = calculator.addDiv(1,1);
        assertEquals(1.0,actualResult);
    }

//    @Test(excepted = divbyzero.class)
//    public void onedivZero(){
//        Calculator calculator = new Calculator();
//        double actualResult = calculator.addDiv(1,0);
//    }
}
