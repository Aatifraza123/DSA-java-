import java.util.*;
public class PresentQuery {
    static int[] makefrequencyarray(int[] arr){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return  freq;
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
        int[] freq = makefrequencyarray(arr);
        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while (q > 0){
            System.out.println("Enter number to searched");
            int x = sc.nextInt();
            if (freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }
}