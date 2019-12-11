package com.company;

public class ModifiedEulerSingleStep implements IODESingleStep{
    @Override
    public double singleStep(IFirstOrderODE ode, double t, double x, double h) {
        double tempx = x+ode.f(t,x)*h/2;
        double tempt = t+1/2;
        return x+ode.f(tempt,tempx)*h;
    }
}
