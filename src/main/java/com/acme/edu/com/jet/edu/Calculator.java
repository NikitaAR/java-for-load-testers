package com.acme.edu.com.jet.edu;

/**
 * Created by NA.Rukhlov on 26.06.2017.
 */
public class Calculator {
    private static int state = 0;
    private static int mem = 0;

    public static int add(int a, int b) {
        state = a + b;
        return state;
    }

    public static int sub(int a, int b) {
        state = a - b;
        return state;
    }

    public static int mul(int a, int b) {
        state = a * b;
        return state;
    }

    public static int div(int a, int b) {
        state = a / b;
        return state;
    }

    public static void addMem() {
        mem = mem + state;
    }

    public static void clearMem() {
        mem = 0;
    }
    public static int showState(){
        return state;
    }
    public static int showMem(){
        return mem;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        
        System.out.println(Calculator.add(3, 1));
        System.out.println(Calculator.sub(4, 2));

        Calculator.addMem();

        System.out.println(Calculator.mul(2, 3));
        System.out.println(Calculator.div(6, 6));

        System.out.println(Calculator.showMem());
        Calculator.clearMem();
        System.out.println(Calculator.showMem());

        Calculator.mul(5, 5);
        System.out.println("last state = " + Calculator.showState());

    }

}
