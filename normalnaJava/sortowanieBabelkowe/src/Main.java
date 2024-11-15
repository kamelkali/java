import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        int size = scanner.nextInt();
        double[] numbers = new double[size];

        System.out.println("Czy chcesz aby program wygenerował ci losowe liczby? (n/T)");
        String decyzja = scanner.nextLine().toUpperCase();

        while (!decyzja.isEmpty()){
            if (decyzja.contains("N")){
                System.out.println("Podaj liczby: ");
                for (int i = 0; i < size; i++) {
                    numbers[i] = scanner.nextDouble();
                }
            } else if (decyzja.contains("T")) {
                for(int i =0; i < size; i++){
                    double liczbaLosowa = (int)((Math.random()) *(800-210)+210)*0.1;
                    numbers[i] = liczbaLosowa;
                }
            }  else {
                System.out.println("Podano nieprawidlowa decyzje");
            }
        }


        double[] sortedNumbers = szyfrowanieBombelkowe(numbers);
        System.out.println("Rosnąco posortowana tablica: ");
        for (int i = 0; i < sortedNumbers.length; i++){
            System.out.print(sortedNumbers[i] + ",");
            System.out.println();
        }
    }
    public static double[] szyfrowanieBombelkowe(double[] arr){
        for(int i = 0;i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1;j++){
                if(arr[j] < arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}