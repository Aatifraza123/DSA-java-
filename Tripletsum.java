import java.util.*;
public class Tripletsum {
    static int triplesum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println("Target " + target + " is " + triplesum(arr,target));
    }
}