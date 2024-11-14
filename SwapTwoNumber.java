public class SwapTwoNumber {

    static void swapwithoutemp(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);


        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }


    static void swap(int a, int b){
        System.out.println("Before Swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
//        swap(a,b);
        swapwithoutemp(a,b);
    }
}
