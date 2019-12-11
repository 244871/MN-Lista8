package com.company;

public class EulerSingleStep implements IODESingleStep {

    @Override
    public double singleStep(IFirstOrderODE ode, double t, double x, double h) {
        return x+ode.f(t,x)*h;// wzór na obliczanie  wg Eulera
    }
}
