package pl.gornik.resistor;

public class Parallel {
    public static double paraller(double r1, double r2){
        return r1+r2;
    }

    public static double parallerSum(double r1, double r2){
        return (r1*r2)/(r1+r2);
    }
}
