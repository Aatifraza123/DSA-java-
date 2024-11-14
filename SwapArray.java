import java.util.*;
public class SwapArray {

    static void PrintArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    static void SwapInArray(int[] arr, int i, int j){
       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void ReverseArray(int[] arr, int i, int j){
//        int i = 0; int j = arr.length - 1;
        while(i < j){
            SwapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static  void RotateInPlace(int[] arr, int k){
        int n = arr.length;
         k = k % n;
        ReverseArray(arr,0, n - k -1);
        ReverseArray(arr,n - k,n - 1);
        ReverseArray(arr,0,n - 1);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k");
        int k = sc.nextInt();
        System.out.println("Original array");
        PrintArray(arr);
        RotateInPlace(arr,k);
        System.out.println("Array After Rotation");
        PrintArray(arr);
    }
}