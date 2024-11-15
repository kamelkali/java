import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort your array ");
        System.out.println("Array lenght: ");
        int arrlen = scanner.nextInt();
        int array[] = new int[arrlen];
        System.out.println("------------------");
        for (int i = 0; i < arrlen; i++){
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: "+ Arrays.toString(array));
        selectionSort(array);

    }
    public static void selectionSort(int[] array){
        int k;
        int arrLen = array.length;
        for (int i = 0; i < arrLen; i++){
            k = i;
            for (int j = i + 1; j < arrLen; j++){
                if(array[j] < array[k]){
                    k = j;
                }
                int array_element = array[k];
                array[k] = array[i];
                array[i] = array_element;
            }

        }

        System.out.println("Sorted array:" + Arrays.toString(array));
    }
}