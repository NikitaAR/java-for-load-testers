package com.acme.edu.com.jet.edu;

public class StringBuilderCalculatorLogger implements CalculatorLogger {
    private StringBuilder log = new StringBuilder();

    public void addToLog(String command, double arg1, double arg2, double result, int id) {
        log.append(arg1 + " " + command + " " + arg2 + " = " + result + " in session " + id + "\n");
    }

    public String[] getLog(){
        return log.toString().split("\n ");
    }
}
