public class ReverseArray {

    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

      static  int[] reversearray(int[] arr){
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--){
           ans[j++] = arr[i];
        }
        return ans;
}
    public static void main(String[] args) {

     int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array ");
        printarray(arr);
        System.out.println("After reverse");
     int[] ans  = reversearray(arr);
    printarray(ans);
    }
}