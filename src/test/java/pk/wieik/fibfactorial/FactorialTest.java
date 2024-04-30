package pk.wieik.fibfactorial;

import org.junit.jupiter.api.Test;
import pk.wieik.fibfactorial.factorial.FactorialIterative;
import pk.wieik.fibfactorial.factorial.FactorialIterative2;
import pk.wieik.fibfactorial.factorial.FactorialRecursive;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void checkIfCountsWell() {
        //FACTORIAL BIG INTEGER RECURSIVE TESTS
        assertEquals(FactorialRecursive.factorial(1), BigInteger.ONE);
        assertEquals(FactorialRecursive.factorial(2), BigInteger.valueOf(2));
        assertEquals(FactorialRecursive.factorial(3), BigInteger.valueOf(6));
        assertEquals(FactorialRecursive.factorial(4), BigInteger.valueOf(24));
        assertEquals(FactorialRecursive.factorial(5), BigInteger.valueOf(120));
        assertEquals(FactorialRecursive.factorial(6), BigInteger.valueOf(720));
        assertEquals(FactorialRecursive.factorial(7), BigInteger.valueOf(5040));
        assertEquals(FactorialRecursive.factorial(8), BigInteger.valueOf(40320));
        assertEquals(FactorialRecursive.factorial(9), BigInteger.valueOf(362880));
        assertEquals(FactorialRecursive.factorial(10), BigInteger.valueOf(3628800));
        assertEquals(FactorialRecursive.factorial(11),  BigInteger.valueOf(39916800));
        //FACTORIAL ITERATIVE 1 TESTS
        assertEquals(FactorialIterative.factorial(1), BigInteger.ONE);
        assertEquals(FactorialIterative.factorial(2), BigInteger.valueOf(2));
        assertEquals(FactorialIterative.factorial(3), BigInteger.valueOf(6));
        assertEquals(FactorialIterative.factorial(4), BigInteger.valueOf(24));
        assertEquals(FactorialIterative.factorial(5), BigInteger.valueOf(120));
        assertEquals(FactorialIterative.factorial(6), BigInteger.valueOf(720));
        assertEquals(FactorialIterative.factorial(7), BigInteger.valueOf(5040));
        assertEquals(FactorialIterative.factorial(8), BigInteger.valueOf(40320));
        assertEquals(FactorialIterative.factorial(9), BigInteger.valueOf(362880));
        assertEquals(FactorialIterative.factorial(10), BigInteger.valueOf(3628800));
        assertEquals(FactorialIterative.factorial(11),  BigInteger.valueOf(39916800));
        //FACTORIAL ITERATIVE 2 TESTS
        assertEquals(FactorialIterative2.factorial(1), BigInteger.ONE);
        assertEquals(FactorialIterative2.factorial(2), BigInteger.valueOf(2));
        assertEquals(FactorialIterative2.factorial(3), BigInteger.valueOf(6));
        assertEquals(FactorialIterative2.factorial(4), BigInteger.valueOf(24));
        assertEquals(FactorialIterative2.factorial(5), BigInteger.valueOf(120));
        assertEquals(FactorialIterative2.factorial(6), BigInteger.valueOf(720));
        assertEquals(FactorialIterative2.factorial(7), BigInteger.valueOf(5040));
        assertEquals(FactorialIterative2.factorial(8), BigInteger.valueOf(40320));
        assertEquals(FactorialIterative2.factorial(9), BigInteger.valueOf(362880));
        assertEquals(FactorialIterative2.factorial(10), BigInteger.valueOf(3628800));
        assertEquals(FactorialIterative2.factorial(11),  BigInteger.valueOf(39916800));
    }

    @Test
    void checkIfMaxArgumentExecutes(){
        assertDoesNotThrow(() -> FactorialRecursive.factorial(FactorialRecursive.MAX_ARGUMENT),
                "Error thrown for max argument for Factorial Big Integer class");
        assertDoesNotThrow(() -> FactorialIterative.factorial(FactorialIterative.MAX_ARGUMENT),
                "Error thrown for max argument for Factorial Big Integer class");
        assertDoesNotThrow(() -> FactorialIterative2.factorial(FactorialIterative2.MAX_ARGUMENT),
                "Error thrown for max argument");
    }

    @Test
    void checkIfThrowsExceptionForTooBigArgument(){
        assertThrows(RuntimeException.class, () -> FactorialRecursive.factorial(FactorialRecursive.MAX_ARGUMENT+5),
                "function doesn't throw an exception for too big argument for class Factorial Big Integer");
        assertThrows(RuntimeException.class, () -> FactorialIterative.factorial(FactorialIterative.MAX_ARGUMENT+4),
                "function doesn't throw an exception for too big argument for class Factorial Iterative");
        assertThrows(RuntimeException.class, () -> FactorialIterative2.factorial(FactorialIterative2.MAX_ARGUMENT+4),
                "function doesn't throw an exception for too big argument for class Factorial Iterative2");
    }

    @Test
    void checkIfThrowsExceptionForNegativeArgument(){
        assertThrows(RuntimeException.class, () -> FactorialRecursive.factorial(-7),
                "function doesn't throw an exception for negative argument for class Factorial Big Integer");
        assertThrows(RuntimeException.class, () -> FactorialIterative.factorial(-7),
                "function doesn't throw an exception for negative argument for class Factorial Iterative");
        assertThrows(RuntimeException.class, () -> FactorialIterative2.factorial(-7),
                "function doesn't throw an exception for negative argument for class Factorial Iterative 2");
    }

}