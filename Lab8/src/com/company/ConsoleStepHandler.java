package com.company;

public class ConsoleStepHandler implements IStepHandler {

    @Override
    public void handleStep(double t, double x, double wartosc, int k) {
        System.out.println("t= "+t +" x= "+x+ " blad= "+(Math.abs((wartosc-x)/x)*100)+" %"+ " k= "+k);
        //System.out.println(t +" : "+x+ " : "+(Math.abs((wartosc-x)/x)*100)+ " : "+k);
    }
}
