package pl.gornik.tree;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
        System.out.println("podaj typ drzewa");
        tree.treeType = scanner.nextLine();
        System.out.println("Podaj Wysokośc");
        double wysykosc = scanner.nextDouble();
        System.out.println("Podaj srednice");
        double srednica = scanner.nextDouble();
        System.out.println("--------------------------");


        double cubicCapacity = tree.CubicCapacity();
        System.out.println("kubiki:"  + cubicCapacity);
        tree.describe();


    }
}
