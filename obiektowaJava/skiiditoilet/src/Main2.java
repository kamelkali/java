import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ciagu: ");
        int n = scanner.nextInt();
        double element= calculateElement(n);
        for(int i = 1; i <= element; i++){
            System.out.println(calculateElement(i));
        }
        System.out.println("Suma :" + sequenceSum(n));

    }

    public static double calculateElement(int n){
        if(n==1) return 3;
        return (calculateElement(n-1) +2) /3;
    }

    public static double sequenceSum(int n){
        if(n==0) return 0;
        return calculateElement(n ) + sequenceSum(n-1);
    }

}
