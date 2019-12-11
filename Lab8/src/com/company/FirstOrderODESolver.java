package com.company;

public class FirstOrderODESolver {
    private IODESingleStep odeSingleStep;
    private IStepHandler stepHandler;

    public FirstOrderODESolver(IODESingleStep odeSingleStep) {
        this.odeSingleStep = odeSingleStep;
    }

    public void addStepHandler (IStepHandler stepHandler) {
        this.stepHandler = stepHandler;
    }

    public double integrate(IFirstOrderODE ode, double tStart, double xStart, double tStop, double xStop, int n, double wartosc, int k) {//uzyskiwanie ostatniej wartości// w parametrach równanie, wartość początkowa, warotść końcowa
        double h = (tStop - tStart) / n; //ilość kroków całkowania
        double x = xStart;
        double t = tStart;
        int j=k;
        for(int i=0;i<n;i++){
            if(stepHandler!=null) stepHandler.handleStep(t,x,wartosc,j);
            x=odeSingleStep.singleStep(ode,t,x,h);
            t+=h;
            j=j+k;
        }
        if(stepHandler!=null) stepHandler.handleStep(t,x,wartosc,j);
        return x;
    }
}
