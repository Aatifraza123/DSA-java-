import java.util.Scanner;

public class UniqueFind {
    static int UniqueNumber(int[] arr){
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++ ){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int j : arr) {
            if (j > 0) {
                ans = j;
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
        for (int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter Number: ");
//        int number = sc.nextInt();
        System.out.println("UniqueNumber is " + UniqueNumber(arr));
    }
}