package com.example.numsai99.calculator;

/**
 * Created by numsai99 on 11/5/2559.
 */
public class MainController {
    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double first,double secound){
        listener.onSucess(String.valueOf(calculator.addPlus(first,secound)));
    }

    public void sub(double first,double secound){
        listener.onSucess(String.valueOf(calculator.addMinus(first,secound)));
    }

    public void div(double first,double secound){
        listener.onSucess(String.valueOf(calculator.addDiv(first,secound)));
    }

    public void mul(double first,double secound){
        listener.onSucess(String.valueOf(calculator.addMulti(first,secound)));
    }
}
