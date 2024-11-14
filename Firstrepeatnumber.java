import java.util.*;
public class Firstrepeatnumber {
    static int firstrepeat(int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1;j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
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
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating number is " + firstrepeat(arr));
    }
}

