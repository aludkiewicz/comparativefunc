package hijava;

import java.math.BigInteger;

public class Factorial {
    
    public static void main(String[] args) {
        System.out.println(factorial(10000000)); // Iterative, so runs okay. Well, the long overflows!
        System.out.println(facBig(10000)); // Using BigInt instead of long
        System.out.println(factorialRecursive(10000000)); // StackOverflow
    }
    
    /**
     * Iterative solution using BigInteger. Runs just fine, but i mean look at it
     * So verbose!
     */
    private static BigInteger facBig(int n) {
        BigInteger fac = BigInteger.ONE;
        for(Integer i = 1; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i.longValue()));
        }
        return fac;
    }
    
    /*
     * Iterative factorial. Runs just fine except that the long overflows
     */
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
    
    /*
     * StackOverflow! Besides, the long would overflow anyway
     */
    private static long factorialRecursive(int n) {
        if(n == 0) {
            return 1;
        } else {
            return factorialRecursive(n-1) * n;
        }
    }

}
