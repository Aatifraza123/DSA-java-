import java.util.*;
public class ZeroToOneArray {
    static void printArray(int[] arr){
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void ZeroesToOne(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for (int j : arr) {
            if (j == 0) {
                zero++;
            }

        }
        for (int i = 0; i < n; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
       }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        ZeroesToOne(arr);
        System.out.println("Sorted array");
        printArray(arr);

    }
}
