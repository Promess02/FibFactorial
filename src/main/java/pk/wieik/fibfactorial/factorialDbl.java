package pk.wieik.fibfactorial;

public class factorialDbl {
    public static void main(String[] args) {
        int j=1;
        while(true){
            long start = System.currentTimeMillis();
            double value = factorial(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(value==(Double.MAX_VALUE) || Double.isInfinite(value)) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static double factorial(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1)*n;
        }
    }
}
