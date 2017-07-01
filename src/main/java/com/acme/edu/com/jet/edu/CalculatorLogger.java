package com.acme.edu.com.jet.edu;

/**
 * Created by NA.Rukhlov on 01.07.2017.
 */
public interface CalculatorLogger {
    public void addToLog(String command, double arg1, double arg2, double result, int id);
    public String[] getLog();
}
