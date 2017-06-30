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
            state = 10;
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

        }
    }

    private static void doCalculate(String command, double arg1, double arg2) {
        switch (command) {
            case "add": {
                System.out.println(add(arg1, arg2));
            } break;
            case "sub": {
                System.out.println(sub(arg1, arg2));
            } break;
            case "mul": {
                System.out.println(mul(arg1, arg2));
            } break;
            case "div": {
                System.out.println(div(arg1, arg2));
            } break;

            default: {
                System.out.println("done");
            } break;
        }
    }
}
