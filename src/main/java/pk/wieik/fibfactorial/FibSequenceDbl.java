package pk.wieik.fibfactorial;

public class FibSequenceDbl {

    public static int MAX_ARGUMENT = 49;
    public static void main(String[] args) {
        int j=1;
        while(true){
            long start = System.currentTimeMillis();
            double value = fibonacci(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(value==(Double.MAX_VALUE) || value<0 || time > 50000) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static double fibonacci(int n) {
        if(n>MAX_ARGUMENT) throw new RuntimeException("argument too big!");
        if(n<0) throw new RuntimeException("argument cannot be negative");
        if (n == 0) {
            return 0;
        } else if (n == 1 || n==2) {
            return 1;
        } else {
            return fibonacci(n - 1) + (fibonacci(n - 2));
        }
    }
}
