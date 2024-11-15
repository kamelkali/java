import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów do wydruku i dodania");
        int n = scanner.nextInt();


        for(int i =0; i<n;i++){
            double sum = sumOfElement(n);
            System.out.printf("\nSuma %d elementów ciągu wynosi %1.5fn", n ,sum);
        }
    }

    public static double calculateElement(int n){
        if(n==1) return 1.5;
        if(n==2) return -4;
        return 2* (calculateElement(n-2)+ calculateElement(n-1)-1);
    }

    public static double sumOfElement(int n){
        if(n==1) return 1.5;
        if(n==2) return -2.5;
        return calculateElement(n-1) + calculateElement(n);
    }
}
