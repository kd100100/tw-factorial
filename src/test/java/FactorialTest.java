import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldBe0IfValueLessThan0() {
        Factorial factorialCalc = new Factorial(-1);

        int actual = factorialCalc.check();

        assertEquals(0, actual);
    }

    @Test
    void shouldBe1IfTheValueIs0() {
        Factorial factorialCalc = new Factorial(0);

        int actual = factorialCalc.check();

        assertEquals(1, actual);
    }

    @Test
    void shouldBe1IfTheValueIs1() {
        Factorial factorialCalc = new Factorial(1);

        int actual = factorialCalc.check();

        assertEquals(1, actual);
    }

    @Test
    void shouldBe6IfTheValueIs3() {
        Factorial factorialCalc = new Factorial(3);

        int actual = factorialCalc.check();

        assertEquals(6, actual);
    }

    @Test
    void shouldBe3628800IfValueIs10() {
        Factorial factorialCalc = new Factorial(10);

        int actual = factorialCalc.check();

        assertEquals(3628800, actual);
    }
}
