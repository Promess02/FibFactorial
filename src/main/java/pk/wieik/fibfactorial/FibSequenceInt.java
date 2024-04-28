package pk.wieik.fibfactorial;

public class FibSequenceInt {
    public static void main(String[] args) {
        int j=1;
        while(true){
            int value = fibonacci(j);
            System.out.println("j: " + j + ", value: " + value);
            if(value==(Integer.MAX_VALUE) || value<0) break;
            j+=1;
        }
        System.out.println("max n value: " + j);
        System.out.println("out of loop");

    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n==2) {
            return 1;
        } else {
            return fibonacci(n - 1) + (fibonacci(n - 2));
        }
    }
}