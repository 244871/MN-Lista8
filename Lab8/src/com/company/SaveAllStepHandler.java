package com.company;

import java.util.ArrayList;
import java.util.List;

public class SaveAllStepHandler implements IStepHandler {
    List<Double> tValues = new ArrayList<>();
    List<Double> xValues = new ArrayList<>();


    @Override
    public void handleStep(double t, double x, double wartosc, int k) {
        tValues.add(t);
        xValues.add(x);
    }
}
