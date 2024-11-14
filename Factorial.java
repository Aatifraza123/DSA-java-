public class Factorial {

    public static void PrintFact(int i, int n, int fact){
        if (i == n){
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        PrintFact(i+1,n,fact);
    }

    public static void main(String[] args) {

        PrintFact(1,5,1);
    }
}