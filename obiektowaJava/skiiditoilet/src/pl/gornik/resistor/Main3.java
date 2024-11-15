package pl.gornik.resistor;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Podaj r1");
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();
        System.out.println("Podaj r2");
        double r2 = scanner.nextDouble();
        Parallel paraller = new Parallel();

        System.out.println(Parallel.paraller(r1,r2));
        System.out.println(Parallel.parallerSum(r1,r2));

    }
}
