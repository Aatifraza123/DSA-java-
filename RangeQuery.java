import java.util.*;
public class RangeQuery {
    public static void PrintArray(int[] arr){
        for (int j : arr){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static int[] PrefixRangeQuery(int[] arr){
        for (int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1] ;
        }
        return arr;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter " + n + " element");
        for (int i = 1;i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        PrintArray(arr);
        int[] QueryPrefix = PrefixRangeQuery(arr);
        PrintArray(QueryPrefix);


        System.out.println("Enter Query");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = QueryPrefix[r] - QueryPrefix[l-1];
            System.out.println("Sum " + ans);
        }
    }
}