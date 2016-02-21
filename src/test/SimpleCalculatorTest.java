package src.test;

import org.junit.Ignore;
import org.junit.Test;
import src.main.RobotPath.SimpleCalculator;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdditionOfTwoDigits() {
        assertEquals(5, SimpleCalculator.calculate("2+3"));
    }

    @Test
    public void testSubtractionOfTwoDigits() {
        assertEquals(4, SimpleCalculator.calculate("7-3"));
    }

    @Test
    public void testAdditionAndSubtractionOfDigits() {
        assertEquals(4, SimpleCalculator.calculate("2+2+7-4-3"));
    }

    @Test
    public void testAdditionOfTwoDigitsWithBrackets() {
        assertEquals(9, SimpleCalculator.calculate("(6+3)"));
    }

    @Test
    public void testSubtractionOfTwoDigitsWithBrackets() {
        assertEquals(-2, SimpleCalculator.calculate("(1-3)"));
    }

    @Test
    public void testSubtractionAndAdditionWithOneSetOfBrackets() {
        assertEquals(-1, SimpleCalculator.calculate("(1+(1-3))"));
    }

    @Test
    public void testSubtractionAndAdditionWithManyBrackets() {
        assertEquals(-6, SimpleCalculator.calculate("(1+(1-9)+1)"));
    }

    @Test
    public void testSubtractionAndAdditionWithNestedBrackets() {
        assertEquals(9, SimpleCalculator.calculate("(1+(3+(5)))"));
    }

    public void testSubtractionAndAdditionWithClosingBrackets() {
        assertEquals(7, SimpleCalculator.calculate("2+(2+(3+1)-1)"));
    }

    @Test
    public void testSubtractionAndAdditionWithComplexNestedBrackets() {
        assertEquals(-7, SimpleCalculator.calculate("(1+(2-3-(4+1))-2)"));
    }

    @Test
    public void testBracketsContainingOnlyValues() {
        assertEquals(4, SimpleCalculator.calculate("1+(2)+(4)-(3)"));
    }

    @Test
    public void testNestedBracketsContainingOnlyValues() {
        assertEquals(4, SimpleCalculator.calculate("1+((2)+(4))-(3)"));
    }

}
