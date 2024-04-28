package pk.wieik.fibfactorial;

public class factorialInt {
    public static void main(String[] args) {
        int j=1;
        while(true){
            long start = System.currentTimeMillis();
            int value = factorial(j);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("time: " + time + ", j: " + j + ", value: " + value);
            if(value>=(Integer.MAX_VALUE) || value<0) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1)*n;
        }
    }
}
