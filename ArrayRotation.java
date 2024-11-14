import java.util.Arrays;
import java.util.Scanner;

 class ArrayRotation {
   static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static int[] rotation(int[] arr,int k){
        int n = arr.length;
        k = n % k ;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k  ; i > n ; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k ; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Original array");
        printarray(arr);
        int [] ans = rotation(arr,k);
        System.out.println("Array after rotation");
        printarray(ans);

    }
}