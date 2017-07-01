package com.acme.edu.com.jet.edu;

/**
 * Class Calculator for Int and Double types, values from -10 to 10
 */
public class Calculator {
    private double state = 0;
    private double memory = 0;

    private int id = 0;
    public void setId(int inputId){
        id = inputId;
    }

    public int getId(){
        return id;
    }

    private CalculatorLogger log;

    public void setLog(CalculatorLogger log){
        this.log = log;
    }

    public double add(double a, double b) {
        double result = getValidatedInterval(a + b);
        state = result;
        return state;
    }

    public double sub(double a, double b) {
        double result = getValidatedInterval(a - b);
        state = result;
        return state;
    }

    public double mul(double a, double b) {
        double result = getValidatedInterval(a * b);
        state = result;
        return state;
    }

    public double div(double a, double b) {
        if (b == 0){
            state = 0;
        } else {
            double result = getValidatedInterval(a / b);
            state = result;
        }
        return state;
    }

    public double absolute(double a){
        if(a < 0){
            a = -a;
        }
        state = a;
        getValidatedInterval(state);
        return state;
    }


    public double getValidatedInterval(double value){
        if(value > 10) value = 10;
        else if(value < -10) value = -10;
        return value;
    }

    public void addToMemory() {
        memory = memory + state;
    }

    public void clearMemory() {
        memory = 0;
    }
    public double getState(){
        return state;
    }
    public double getMemory(){
        return memory;
    }
    public String[] getLog(){
        return log.getLog();
    }


    public void doCalculate(String command, double arg1, double arg2) {
        switch (command) {
            case "add": {
                log.addToLog(command, arg1, arg2, add(arg1, arg2), id);
            } break;
            case "sub": {
                log.addToLog(command, arg1, arg2, sub(arg1, arg2), id);
            } break;
            case "mul": {
                log.addToLog(command, arg1, arg2, mul(arg1, arg2), id);
            } break;
            case "div": {
                log.addToLog(command, arg1, arg2, div(arg1, arg2), id);
            } break;

            default: {
                System.out.println("undeclared command");
            }
        }
    }
}


