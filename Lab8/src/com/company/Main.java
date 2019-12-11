package com.company;

public class Main {

    public static void main(String[] args) {

        double wartosc = 75.33896;
        /*
        FirstOrderODESolver solver = new FirstOrderODESolver(new EulerSingleStep());
        double xStop=solver.integrate((t,x) -> 4*Math.exp(0.8*t)-0.5*x,0,2, 4 , 4, 8 );
        System.out.println(xStop);

        FirstOrderODESolver solver2 = new FirstOrderODESolver(new ModifiedEulerSingleStep());
        solver2.addStepHandler(new ConsoleStepHandler());
        double xStop2=solver2.integrate((t,x) -> 4*Math.exp(0.8*t)-0.5*x,0,2, 4 , 64,128  );
        System.out.println(xStop2);

*/


        System.out.println("dla h=0.5");
        System.out.println("Euler");

        FirstOrderODESolver solver1=new FirstOrderODESolver(new EulerSingleStep());
        solver1.addStepHandler(new ConsoleStepHandler());
        double xStop1=solver1.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,15, 8, wartosc,1);
        System.out.println("x koncowe " +xStop1);

        System.out.println("Modified Euler");
        solver1=new FirstOrderODESolver(new ModifiedEulerSingleStep());
        solver1.addStepHandler(new ConsoleStepHandler());
        xStop1=solver1.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,15,8, wartosc,2);
        System.out.println("x koncowe " +xStop1);
        System.out.println("Rengeg-Kutt");
        solver1= new FirstOrderODESolver(new RK4SingleStep());
        solver1.addStepHandler(new ConsoleStepHandler());
        xStop1=solver1.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,15,8, wartosc,5);
        System.out.println("x koncowe " +xStop1);

        System.out.println("dla h=0.25");
        System.out.println("Euler");
        FirstOrderODESolver solver2=new FirstOrderODESolver(new EulerSingleStep());
        solver2.addStepHandler(new ConsoleStepHandler());
        double xStop2=solver2.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,10,16, wartosc,1);
        System.out.println("x koncowe " +xStop2);
        System.out.println("Modified Euler");
        solver2=new FirstOrderODESolver(new ModifiedEulerSingleStep());
        solver2.addStepHandler(new ConsoleStepHandler());
        xStop2=solver2.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,10,16, wartosc,2);
        System.out.println("x koncowe " +xStop2);
        System.out.println("Rengeg-Kutt");
        solver2= new FirstOrderODESolver(new RK4SingleStep());
        solver2.addStepHandler(new ConsoleStepHandler());
        xStop2=solver2.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,10,16, wartosc,5);
        System.out.println("x koncowe " +xStop2);

        System.out.println("dla h=0.05");
        System.out.println("Euler");
        FirstOrderODESolver solver3=new FirstOrderODESolver(new EulerSingleStep());
        solver3.addStepHandler(new ConsoleStepHandler());
        double xStop=solver3.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,5,80, wartosc,1);
        System.out.println("x koncowe " +xStop);
        System.out.println("Modified Euler");
        solver3=new FirstOrderODESolver(new ModifiedEulerSingleStep());
        solver3.addStepHandler(new ConsoleStepHandler());
        xStop=solver3.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,5,80, wartosc,2);
        System.out.println("x koncowe " +xStop);
        System.out.println("Rengeg-Kutt");
        solver3= new FirstOrderODESolver(new RK4SingleStep());
        solver3.addStepHandler(new ConsoleStepHandler());
        xStop=solver3.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,2,4,5,80, wartosc,5);
        System.out.println("x koncowe " +xStop);

    }
}
