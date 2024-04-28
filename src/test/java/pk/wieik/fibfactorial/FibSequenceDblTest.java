package pk.wieik.fibfactorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibSequenceDblTest {

    @Test
    void checkIfCountsWell() {
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
    }

    @Test
    void checkIfMaxArgumentExecutesQuick(){
        long start = System.currentTimeMillis();
        FibSequenceDbl.fibonacci(FibSequenceDbl.MAX_ARGUMENT);
        long end = System.currentTimeMillis();
        long time = end - start;
        assertTrue(time<50000, "function with max argument executes in more than 50 seconds");
    }

    @Test
    void checkIfThrowsExceptionForTooBigArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(60),
                "function doesn't throw an exception for too big argument");
    }

    @Test
    void checkIfThrowsExceptionForNegativeArgument(){
        assertThrows(RuntimeException.class, () -> FibSequenceDbl.fibonacci(-7),
                "function doesn't throw an exception for negative argument");
    }




}