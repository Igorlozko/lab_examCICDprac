import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalculator;

    @BeforeEach
    void setUp() {
        //Arrange
        myCalculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        int a = 15; int b = 20;
        int expectedResult = 35;
//Act
        long result = myCalculator.add(a, b);
//Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void subtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        long result = myCalculator.subtract(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        long result = myCalculator.multiply(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void divide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = myCalculator.divide(a, b);
        assertEquals(expectedResult, result, 0.00005);
    }
}