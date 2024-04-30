package pk.wieik.fibfactorial.fibonacci;

import java.math.BigInteger;

public class FibIterative {
    public static int MAX_ARGUMENT = 420000;
    public static void main(String[] args) {
        int j=420000;
        while(true){
            long start = System.currentTimeMillis();
            BigInteger value = fibonacci(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(time > 5000) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static BigInteger fibonacci(int n)
    {
        if(n>MAX_ARGUMENT) throw new RuntimeException("argument too big");
        if(n<0) throw new RuntimeException("argument cannot be negative");
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(2);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }

        return a;
    }
}
