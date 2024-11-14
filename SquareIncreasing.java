import java.util.*;
public class SquareIncreasing {

    static void PrintArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

static void swap(int[] arr,int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i <= j){
           swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] SortSquare(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while(left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
        System.out.println("Original Array");
        PrintArray(arr);
        int[] ans = SortSquare(arr);
        System.out.println("Sorted Array");
        reverse(ans);
        PrintArray(ans);
    }
}