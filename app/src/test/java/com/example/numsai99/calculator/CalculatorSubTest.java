package com.example.numsai99.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static junit.framework.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double first;
    private double secound;
    private double expecter;

    @Test
    public void  sub(){
        Calculator calculator = new Calculator();
        assertEquals("Test",this.expecter,calculator.addMinus(this.first,this.secound));
    }

    public CalculatorSubTest(double first, double secound, double expecter) {
        this.first = first;
        this.secound = secound;
        this.expecter = expecter;
    }


    @Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,0.0},
                {2,1,1.0},
                {2,3,-1.0},
        });
    }
}
