package src.test;

import org.junit.Test;
import src.main.RobotPath.SimpleCalculator;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdditionOfTwoDigits() {
        int answer = 5;
        assertEquals(answer, SimpleCalculator.calculateStringExpression("2+3"));
    }

    @Test
    public void testSubtractionOfTwoDigits() {
        int answer = 4;
        assertEquals(answer, SimpleCalculator.calculateStringExpression("7-3"));
    }

    @Test
    public void testAdditionAndSubtractionOfDigits() {
        int answer = 4;
        assertEquals(answer, SimpleCalculator.calculateStringExpression("2+2+7-4-3"));
    }

}
