package pk.wieik.fibfactorial.factorial;

import java.math.BigInteger;

public class FactorialIterative {
    public static int MAX_ARGUMENT = 100000;
    public static void main(String[] args) {

        int j=100000;
        while(true){
            long start = System.currentTimeMillis();
            BigInteger value = factorial(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(time>5000) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static BigInteger factorial(int n) {
        if(n>MAX_ARGUMENT) throw new RuntimeException("too big argument");
        if(n<0) throw new RuntimeException("argument cannot be negative");
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

