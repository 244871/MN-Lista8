package com.company;

public class RK4SingleStep implements IODESingleStep {

    double k1;
    double k2;
    double k3;
    double k4;

    @Override
    public double singleStep(IFirstOrderODE ode, double t, double x, double h) {

        k1=ode.f(t,x);
        k2=ode.f(t+h/2,x+k1/2);
        k3=ode.f(t+h/2,x+k2/2);
        k4=ode.f(t+h/2,x+k3);
        x=(k1+2*k2+2*k3+k4)/6*h +x;
        return x;


        /*
        𝑥0 = 𝑥(𝑡0)
        𝑘1 = 𝑓(𝑡𝑖, 𝑥𝑖)
        𝑘2 = 𝑓(𝑡𝑖 +ℎ/2, 𝑥𝑖 +ℎ𝑘1/2)
        𝑘3 = 𝑓(𝑡𝑖 +ℎ/2, 𝑥𝑖 +ℎ𝑘2/2)
        𝑘4 = 𝑓(𝑡𝑖 + ℎ, 𝑥𝑖 + ℎ𝑘3)
        𝑥𝑖+1 = 𝑥𝑖 +1/6*(𝑘1 + 2𝑘2 + 2𝑘3 + 𝑘4)ℎ
        𝑡𝑖+1 = 𝑡𝑖 + ℎ

         */
    }
}
