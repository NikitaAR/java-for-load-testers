package com.acme.edu.com.jet.edu;

import static com.acme.edu.com.jet.edu.Calculator.*;
import static java.lang.Double.*;

/**
 * Class Calculator for Int and Double types, values from -10 to 10
 */
public class Calculator {
    private static double state = 0;
    private static double memory = 0;

    public static double add(double a, double b) {
        double result = getValidatedInterval(a + b);
        state = result;
        return state;
    }

    public static double sub(double a, double b) {
        double result = getValidatedInterval(a - b);
        state = result;
        return state;
    }

    public static double mul(double a, double b) {
        double result = getValidatedInterval(a * b);
        state = result;
        return state;
    }

    public static double div(double a, double b) {
        if (b == 0){
            state = 0;
        } else {
            double result = getValidatedInterval(a / b);
            state = result;
        }
        return state;
    }

    public static double absolute(double a){
        if(a < 0){
            a = -a;
        }
        state = a;
        getValidatedInterval(state);
        return state;
    }


    public static double getValidatedInterval(double value){
        if(value > 10) value = 10;
        else if(value < -10) value = -10;
        return value;
    }

    public static void addToMemory() {
        memory = memory + state;
    }

    public static void clearMemory() {
        memory = 0;
    }
    public static double getState(){
        return state;
    }
    public static double getMemory(){
        return memory;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        String command = "";
        String arg1 = "";
        String arg2 = "";
        int logCounter = 0;
        int position = -1;
        for (String current : args){
            switch (++position){
                case 0: command = current; break;
                case 1: arg1 = current; break;
                case 2: {
                    arg2 = current;
                    doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                    position = -1;
                } break;
            }
            logCounter++;
        }
    }

    private static void doCalculate(String command, double arg1, double arg2) {
        switch (command) {
            case "add": {
                log(command, arg1, arg2, add(arg1, arg2));
            } break;
            case "sub": {
                log(command, arg1, arg2, sub(arg1, arg2));
            } break;
            case "mul": {
                log(command, arg1, arg2, mul(arg1, arg2));
            } break;
            case "div": {
                log(command, arg1, arg2, div(arg1, arg2));
            } break;

            default: {
                System.out.println("done");
            } break;
        }
    }

    private static void log(String command, double arg1, double arg2, double result) {
        System.out.println(arg1+ " " + command + " " + arg2 + " = " + result);
    }
}
