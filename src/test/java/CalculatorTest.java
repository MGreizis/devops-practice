import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    void setUp() {
        calculator = new Calculator();
    }

    void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result);
    }

    void testSubtract() {
        int result = calculator.subtract(3, 2);
        assertEquals(1, result);
    }

    void testMultiply() {
        int result = calculator.multiply(3, 2);
        assertEquals(6, result);
    }

    void testDivide() {
        int result = calculator.divide(3, 2);
        assertEquals(1, result, 0.001);
    }

    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(3, 0));
    }
}
