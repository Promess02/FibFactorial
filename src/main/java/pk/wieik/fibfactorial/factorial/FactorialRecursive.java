package pk.wieik.fibfactorial.factorial;

import java.math.BigInteger;

public class FactorialRecursive {
    public static int MAX_ARGUMENT = 8500;
    public static void main(String[] args) {

        int j=8000;
        while(true){
            long start = System.currentTimeMillis();
            BigInteger value = factorial(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(time>5000) break;
            j+=100;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static BigInteger factorial(int n) {

        if(n>MAX_ARGUMENT) throw new RuntimeException("argument too big!");
        if(n<0) throw new RuntimeException("argument cannot be negative");

        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            return factorial(n - 1).multiply(new BigInteger("" + n));
        }
    }
}
