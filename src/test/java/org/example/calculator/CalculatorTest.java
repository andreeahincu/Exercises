package org.example.calculator;

import org.example.streamexamples.testexamples.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddingNumbers(){
        int result = calculator.addNumbers(15, 5);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMultiplyingNumbers(){
        int result = calculator.multiplyNumbers(3, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testSubtrackingNumbers(){
        int result = calculator.subtractNumbers(3, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testDividingNumbers(){
        double result = calculator.divideNumbers(3, 5);
        Assertions.assertEquals(0.6, result);
    }

}
