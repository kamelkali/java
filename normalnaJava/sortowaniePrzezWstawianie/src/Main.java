import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";
        do{
            System.out.println("Choose option");
            System.out.println("1. Enter array");
            System.out.println("2. Generate array");
            System.out.printf("Your decision: ");
            option = scanner.nextLine();

            if(option.equals("1")){
                System.out.println("Array lenght:");
                int arrLenght = scanner.nextInt();
                int[] arr = new int[arrLenght];
                System.out.println("Enter array numbers: ");
                for (int i = 0; i < arrLenght; i++){
                    System.out.printf((i+ 1) + ": ");
                    int arrNumber = scanner.nextInt();
                    arr[i] = arrNumber;
                }
                System.out.println("--------------------------------");
                System.out.println("Array: " + Arrays.toString(arr));
                insertionSort(arr);
                System.out.println("--------------------------------");
            }
            if(option.equals("2")){

                System.out.println("Array lenght:");
                int arrLenght = scanner.nextInt();
                int[] arr = new int[arrLenght];
                System.out.println("Choose range");
                System.out.printf("Min:");
                int min = scanner.nextInt();
                System.out.printf("Max:");
                int max = scanner.nextInt();
                for (int i = 0; i < arrLenght; i++){
                    int arrNumber = (int)((Math.random() * max+min) -min);
                    System.out.println((i+ 1) + "." +"Generated number: " + arrNumber);
                    arr[i] = arrNumber;
                }
                System.out.println("--------------------------------");
                System.out.println("Array: " + Arrays.toString(arr));
                insertionSort(arr);
                System.out.println("--------------------------------");
            }

        } while (!(option.equals("1") || option.equals("2")));


    }

    public static void insertionSort(int[] arr){
        int temp;
        int k;
        for (int i =0; i < arr.length; i++){
            temp = arr[i];
            k = i -1;
            while (k >=0 && arr[k] > temp){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = temp;

        }



        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}