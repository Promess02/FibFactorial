package pk.wieik.fibfactorial.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class FibBinet {
    public static int MAX_ARGUMENT = 150000;
    public static void main(String[] args) throws InterruptedException {
        int j=150000;
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

    public static BigInteger fibonacci(int n) {
        if(n> MAX_ARGUMENT) {
            throw new RuntimeException("argument too large");
        }
        if(n<0){
            throw new RuntimeException("argument negative!");
        }
        // Constants
        BigDecimal root5 = BigDecimal.valueOf(Math.sqrt(5));
        BigDecimal gr = BigDecimal.ONE.add(root5).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        BigDecimal igr = BigDecimal.ONE.subtract(gr);

        // Calculate (gr^n - igr^n) / root5
        BigDecimal grPowN = gr.pow(n);
        BigDecimal igrPowN = igr.pow(n);
        BigDecimal value = grPowN.subtract(igrPowN).divide(root5, RoundingMode.HALF_UP);

        // Round to the nearest integer
        return value.setScale(0, RoundingMode.HALF_UP).toBigInteger();
    }
}
