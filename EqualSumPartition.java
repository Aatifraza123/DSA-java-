import java.util.*;
public class EqualSumPartition {

    public static int FindSum(int[] arr){
        int totalsum = 0;
        for (int j : arr) {
            totalsum += j;
        }
      return  totalsum;
    }
public static boolean SumOfPartition(int[] arr){
        int TotalSum = FindSum(arr);
        int prefsum = 0;
        for (int j : arr) {
        prefsum += j;
        int SuffSum = TotalSum - prefsum;
        if (SuffSum == prefsum) {
            return true;
        }
    }
        return false;
}
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " element");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SumOfPartition(arr));

    }
}
