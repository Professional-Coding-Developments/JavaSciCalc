package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
    private static int result;

    public static int sum(int firstNum, int secondNum) {
        result = firstNum + secondNum;
        return result;
    }

    public int subtract(int firstNum, int secondNum) {
        result = firstNum - secondNum;
        return result;
    }
}
