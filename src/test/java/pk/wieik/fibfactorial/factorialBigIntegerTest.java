package pk.wieik.fibfactorial;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class factorialBigIntegerTest {

    @Test
    void checkIfCountsWell() {
        assertEquals(factorialBigInteger.factorial(1), BigInteger.ONE);
        assertEquals(factorialBigInteger.factorial(2), BigInteger.valueOf(2));
        assertEquals(factorialBigInteger.factorial(3), BigInteger.valueOf(6));
        assertEquals(factorialBigInteger.factorial(4), BigInteger.valueOf(24));
        assertEquals(factorialBigInteger.factorial(5), BigInteger.valueOf(120));
        assertEquals(factorialBigInteger.factorial(6), BigInteger.valueOf(720));
        assertEquals(factorialBigInteger.factorial(7), BigInteger.valueOf(5040));
        assertEquals(factorialBigInteger.factorial(8), BigInteger.valueOf(40320));
        assertEquals(factorialBigInteger.factorial(9), BigInteger.valueOf(362880));
        assertEquals(factorialBigInteger.factorial(10), BigInteger.valueOf(3628800));
        assertEquals(factorialBigInteger.factorial(11),  BigInteger.valueOf(39916800));
    }

    @Test
    void checkIfMaxArgumentExecutesQuick(){
        assertDoesNotThrow(() -> factorialBigInteger.factorial(factorialBigInteger.MAX_ARGUMENT),
                "Stack Overflow error thrown");
    }

    @Test
    void checkIfThrowsExceptionForTooBigArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(10000),
                "function doesn't throw an exception for too big argument");
    }

    @Test
    void checkIfThrowsExceptionForNegativeArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(-7),
                "function doesn't throw an exception for negative argument");
    }

}