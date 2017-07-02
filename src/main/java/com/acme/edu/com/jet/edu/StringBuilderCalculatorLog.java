package com.acme.edu.com.jet.edu;

public class StringBuilderCalculatorLog implements CalculatorLogger {
    private StringBuilder log;

    public StringBuilderCalculatorLog(){
        this.log = new StringBuilder();
    }

    public StringBuilderCalculatorLog(StringBuilder log){
        this.log = log;
    }

    public void addToLog(String command, double arg1, double arg2, double result) {
        log.append(arg1 + " " + command + " " + arg2 + " = " + result + "\n");
    }

    public String[] getLog(){
        return log.toString().split("\n ");
    }
}
