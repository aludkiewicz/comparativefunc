package hijava;

public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(factorial(10000000)); // Iterative, so runs okay. Well, the long overflows!
        System.out.println(factorialRecursive(10000000)); // StackOverflow
    }

    private static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= factorial * i;
        }
        return factorial;
    }
    
    private static long factorialRecursive(int n) {
        if(n == 0) {
            return 1;
        } else {
            return factorialRecursive(n-1) * n;
        }
    }

}
