
import java.util.*;
public class SecondMax{



    static  int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int second(int[] arr){
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }

        }
        return findMax(arr);
    }




    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second maximum element: " + second(arr));


    }
}