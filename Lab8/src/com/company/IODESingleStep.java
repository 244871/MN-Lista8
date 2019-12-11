package com.company;

public interface IODESingleStep { //interface przekazujący metodę za pomocą której będziemy obliczać kolejne wartości
    double singleStep(IFirstOrderODE ode, double t, double x, double h);
}
