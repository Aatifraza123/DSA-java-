import java.util.*;
public class TargetSum {

    static int pairsum(int[] arr, int target){
//        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
               if( arr[i] + arr[j] == target){
                   sum++;
               }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +  n + " element");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(pairsum(arr,target));
    }
}

