package pk.wieik.fibfactorial;

import org.junit.jupiter.api.Test;
import pk.wieik.fibfactorial.fibonacci.FibBinet;
import pk.wieik.fibfactorial.fibonacci.FibIterative;
import pk.wieik.fibfactorial.fibonacci.FibSequenceDbl;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void checkIfCountsWell() {
        // FIB SEQUENCE DOUBLE
        assertEquals(FibSequenceDbl.fibonacci(1), 1.0);
        assertEquals(FibSequenceDbl.fibonacci(2), 1.0);
        assertEquals(FibSequenceDbl.fibonacci(3), 2.0);
        assertEquals(FibSequenceDbl.fibonacci(4), 3.0);
        assertEquals(FibSequenceDbl.fibonacci(5), 5.0);
        assertEquals(FibSequenceDbl.fibonacci(6), 8.0);
        assertEquals(FibSequenceDbl.fibonacci(7), 13.0);
        assertEquals(FibSequenceDbl.fibonacci(8), 21.0);
        assertEquals(FibSequenceDbl.fibonacci(9), 34.0);
        assertEquals(FibSequenceDbl.fibonacci(10), 55.0);
        assertEquals(FibSequenceDbl.fibonacci(11), 89.0);
        assertEquals(FibSequenceDbl.fibonacci(12), 144.0);
        assertEquals(FibSequenceDbl.fibonacci(13), 233.0);
        assertEquals(FibSequenceDbl.fibonacci(14), 377.0);
        assertEquals(FibSequenceDbl.fibonacci(15), 610.0);
        // FIB BINET
        assertEquals(FibBinet.fibonacci(1), BigInteger.valueOf(1));
        assertEquals(FibBinet.fibonacci(2), BigInteger.valueOf(1));
        assertEquals(FibBinet.fibonacci(3), BigInteger.valueOf(2));
        assertEquals(FibBinet.fibonacci(4), BigInteger.valueOf(3));
        assertEquals(FibBinet.fibonacci(5), BigInteger.valueOf(5));
        assertEquals(FibBinet.fibonacci(6), BigInteger.valueOf(8));
        assertEquals(FibBinet.fibonacci(7), BigInteger.valueOf(13));
        assertEquals(FibBinet.fibonacci(8), BigInteger.valueOf(21));
        assertEquals(FibBinet.fibonacci(9), BigInteger.valueOf(34));
        assertEquals(FibBinet.fibonacci(10), BigInteger.valueOf(55));
        assertEquals(FibBinet.fibonacci(11), BigInteger.valueOf(89));
        assertEquals(FibBinet.fibonacci(12), BigInteger.valueOf(144));
        assertEquals(FibBinet.fibonacci(13), BigInteger.valueOf(233));
        assertEquals(FibBinet.fibonacci(14), BigInteger.valueOf(377));
        assertEquals(FibBinet.fibonacci(15), BigInteger.valueOf(610));
        // FIB ITERATIVE
        assertEquals(FibIterative.fibonacci(1), BigInteger.valueOf(1));
        assertEquals(FibIterative.fibonacci(2), BigInteger.valueOf(1));
        assertEquals(FibIterative.fibonacci(3), BigInteger.valueOf(2));
        assertEquals(FibIterative.fibonacci(4), BigInteger.valueOf(3));
        assertEquals(FibIterative.fibonacci(5), BigInteger.valueOf(5));
        assertEquals(FibIterative.fibonacci(6), BigInteger.valueOf(8));
        assertEquals(FibIterative.fibonacci(7), BigInteger.valueOf(13));
        assertEquals(FibIterative.fibonacci(8), BigInteger.valueOf(21));
        assertEquals(FibIterative.fibonacci(9), BigInteger.valueOf(34));
        assertEquals(FibIterative.fibonacci(10), BigInteger.valueOf(55));
        assertEquals(FibIterative.fibonacci(11), BigInteger.valueOf(89));
        assertEquals(FibIterative.fibonacci(12), BigInteger.valueOf(144));
        assertEquals(FibIterative.fibonacci(13), BigInteger.valueOf(233));
        assertEquals(FibIterative.fibonacci(14), BigInteger.valueOf(377));
        assertEquals(FibIterative.fibonacci(15), BigInteger.valueOf(610));
    }

    @Test
    void checkIfMaxArgumentExecutesQuick(){
        //FIB SEQUENCE DOUBLE
        long start = System.currentTimeMillis();
        FibSequenceDbl.fibonacci(FibSequenceDbl.MAX_ARGUMENT);
        long end = System.currentTimeMillis();
        long time = end - start;
        assertTrue(time<5000, "function with max argument executes in more than 5 seconds for class Fib Sequence Double");
        //FIB BINET
        start = System.currentTimeMillis();
        FibBinet.fibonacci(FibBinet.MAX_ARGUMENT);
        end = System.currentTimeMillis();
        time = end - start;
        assertTrue(time<5000, "function with max argument executes in more than 5 seconds for class Fib Binet");
        //FIB ITERATIVE
        start = System.currentTimeMillis();
        FibIterative.fibonacci(FibIterative.MAX_ARGUMENT);
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("time iterative: " + time);
        assertTrue(time<5000, "function with max argument executes in more than 5 seconds for class Fib iterative");
    }

    @Test
    void checkIfThrowsExceptionForTooBigArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(FibSequenceDbl.MAX_ARGUMENT+3),
                "function doesn't throw an exception for too big argument for class Fib Sequence Double");
        assertThrows(RuntimeException.class, () -> FibBinet.fibonacci(FibBinet.MAX_ARGUMENT+3),
                "function doesn't throw an exception for too big argument for class Fib Binet");
        assertThrows(RuntimeException.class, () -> FibIterative.fibonacci(FibIterative.MAX_ARGUMENT+3),
                "function doesn't throw an exception for too big argument for class Fib Iterative");
    }

    @Test
    void checkIfThrowsExceptionForNegativeArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(-7),
                "function doesn't throw an exception for negative argument for class Fib Sequence Double");
        assertThrows(RuntimeException.class, () -> FibBinet.fibonacci(-7),
                "function doesn't throw an exception for negative argument for class Fib Binet");
        assertThrows(RuntimeException.class, () -> FibIterative.fibonacci(-7),
                "function doesn't throw an exception for negative argument for class Fib Iterative");
    }




}