package Impl;

import Abs.simpleCal_Abs;

public class simpleCal_Impl implements simpleCal_Abs {
    @Override
    public int add(int value1, int value2) {
        return value1 + value2;
    }

    @Override
    public int minus(int value1, int value2) {
        return value1 - value2;
    }

    @Override
    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int divide(int value1, int value2) {
        return value1 / value2;
    }
}
