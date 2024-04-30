package pk.wieik.fibfactorial;

import pk.wieik.fibfactorial.factorial.FactorialIterative;
import pk.wieik.fibfactorial.factorial.FactorialIterative2;
import pk.wieik.fibfactorial.factorial.FactorialRecursive;
import pk.wieik.fibfactorial.fibonacci.FibBinet;
import pk.wieik.fibfactorial.fibonacci.FibIterative;

public class MethodChooser {
    public static void main(String[] args) {
        System.out.println(wyborFibonacci());
        System.out.println(wyborSilnia());
    }

    public static String wyborFibonacci(){
        // ponieważ algorytm rekurencyjny Fibonacci ma dużo mniejszą wartość maximum argumentu pozostał wykluczony
        // od wyboru, bo dla mniejszych wartości algorytmy iteracyjne mają podobne czasy, ale dla większych argumentów mają
        // dużo korzystniejsze czasy
        int minArgumentFibonacci = Math.min(FibIterative.MAX_ARGUMENT, FibBinet.MAX_ARGUMENT);
        long start = System.currentTimeMillis();
        FibBinet.fibonacci(minArgumentFibonacci);
        long end = System.currentTimeMillis();
        long timeBinet = end - start;
        start = System.currentTimeMillis();
        FibIterative.fibonacci(minArgumentFibonacci);
        end = System.currentTimeMillis();
        long timeIterative = end - start;
        if(timeBinet < timeIterative)
            return "Wybrany zostaje algorytm Binet dla obliczania liczby z ciągu Fibonacciego!";
        else
            return "Wybrany zostaje algorytm Iteracyjny dla obliczania liczby z ciągu Fibonacciego!";
    }

    public static String wyborSilnia(){
        // odpuszczamy factorial recursive, bo wyrzuca stack overflow dla dużych wartości
        int minArgumentFactorial = Math.min(FactorialIterative2.MAX_ARGUMENT, FactorialIterative.MAX_ARGUMENT);

        long start = System.currentTimeMillis();
        FactorialIterative.factorial(minArgumentFactorial);
        long end = System.currentTimeMillis();

        long timeFactorialIterative = end - start;
        start = System.currentTimeMillis();
        FactorialIterative2.factorial(minArgumentFactorial);
        end = System.currentTimeMillis();
        long timeFactorialIterative2 = end - start;

        long min_time = Math.min(timeFactorialIterative2, timeFactorialIterative);
        if(min_time==timeFactorialIterative) return "Wybrany zostaje algorytm iteracyjny 1 do obliczania silni!";
        else return "Wybrany zostaje algorytm iteracyjny 2 do obliczania silni!";

    }
}
