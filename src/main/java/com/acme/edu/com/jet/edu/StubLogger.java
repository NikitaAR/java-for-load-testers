package com.acme.edu.com.jet.edu;

/**
 * Created by NA.Rukhlov on 01.07.2017.
 */
public class StubLogger implements CalculatorLogger{
    public void addToLog(String command, double arg1, double arg2, double result, int id){
        System.out.println("log input: " + command + " " + arg1 + " " + arg2 + " " + id);
    }
    public String[] getLog(){
        return new String[] {"Hello", "dear", "world"};
    }
}
