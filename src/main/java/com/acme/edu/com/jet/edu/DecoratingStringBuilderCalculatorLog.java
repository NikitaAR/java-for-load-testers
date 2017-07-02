package com.acme.edu.com.jet.edu;


public class DecoratingStringBuilderCalculatorLog extends StringBuilderCalculatorLog {

    public DecoratingStringBuilderCalculatorLog(){
        super();
    }

    public DecoratingStringBuilderCalculatorLog(StringBuilder log){
        super(log);
    }

    public void addToLog(String command, double arg1, double arg2, double result){
        super.addToLog("[PROD]" + command, arg1, arg2, result);
    }
}
