package pk.wieik.fibfactorial;

import java.math.BigInteger;

public class FibBigInteger {
    public static void main(String[] args) {
        int j=1;
        while(true){
            long start = System.currentTimeMillis();
            BigInteger value = fibonacci(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(time > 50000) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static BigInteger fibonacci(int n) {
        if (n <= 0) {
            return BigInteger.ZERO;
        } else if (n == 1 || n==2) {
            return BigInteger.ONE;
        } else {
            return fibonacci(n - 1).add(fibonacci(n - 2));
        }
    }
}
