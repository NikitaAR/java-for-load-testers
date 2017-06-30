package com.acme.edu.com.jet.edu;

import static com.acme.edu.com.jet.edu.Calculator.*;

/**
 * Class Calculator for Int and Double types, values from -10 to 10
 */
public class Calculator {
    private static double state = 0;
    private static double mem = 0;

     public static double add(int a, int b) {
        state = a + b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double sub(int a, int b) {
        state = a - b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double mul(int a, int b) {
        state = a * b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double div(int a, int b) {
        state = a / b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double add(double a, double b) {
        state = a + b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double sub(double a, double b) {
        state = a - b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double mul(double a, double b) {
        double result = getValidatedInterval(a * b);
        state = result;
        return state;
    }

    public static double div(double a, double b) {
        state = a / b;
        state = getValidatedInterval(state);
        return state;
    }

    public static double absolute(int a){
        if(a < 0){
            a = -a;
        }
        state = a;
        getValidatedInterval(state);
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

    public static void addMem() {
        mem = mem + state;
    }

    public static void clearMemory() {
        mem = 0;
    }
    public static double getState(){
        return state;
    }
    public static double getMem(){
        return mem;
    }
}

class CalculatorApp {
    public static void main(String[] args) {

        System.out.println(add(3, 1));
        System.out.println(sub(4, 2));

        addMem();

        System.out.println(mul(2, 3));
        System.out.println(div(6, 6));

        System.out.println(getMem());
        clearMemory();
        System.out.println(getMem());

        mul(5, 5);
        System.out.println("last state = " + getState());


        System.out.println(add(1.1, 1));
        System.out.println(sub(4, 2.1));

        System.out.println(mul(2.5, 6));
        System.out.println(div(-3, 6));

        System.out.println(mul(-2.5, 6));

        System.out.println(absolute(-5));



    }

}
