package com.acme.edu.com.jet.edu;

import static java.lang.Double.parseDouble;


public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(new StubLogger());

        Calculator calc2 = new Calculator(new DecoratingStringBuilderCalculatorLog(
                new StringBuilder("TEST ENV\n")
        ));

        String command = "";
        String arg1 = "";
        String arg2 = "";

        int position = -1;

        for (String current : args){
            switch (++position){
                case 0: command = current; break;
                case 1: arg1 = current; break;
                case 2: arg2 = current; break;
                case 3:{
                    if (Integer.parseInt(current) == 1) {
                        calc1.doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                        position = -1; break;
                    } else if (Integer.parseInt(current) == 2){
                        calc2.doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                        position = -1; break;
                    }
                }
            }
        }

        for (String logOutput : calc1.getLog()){
            System.out.println(logOutput);
        }
        for (String logOutput : calc2.getLog()){
            System.out.println(logOutput);
        }
    }

}