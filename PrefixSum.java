import java.util.Scanner;
public class PrefixSum {

    public static void PrintArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static int[] MakePrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i] ;
        }
        return arr;
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
        System.out.println("Original array");
        PrintArray(arr);
        System.out.println("Sum of prefix array");
        int[] prefix = MakePrefixSum(arr);
       PrintArray(prefix);
    }
}
