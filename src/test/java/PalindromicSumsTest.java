package src.test.java;

import org.junit.Test;
import src.main.java.PalindromicSums;

import static org.junit.Assert.assertEquals;

public class PalindromicSumsTest {


//    PalindromicSums fixture;
//
//    @Test
//    public void testStartingWithADifferenceOfTwoAndLimitOf1000() {
//        ArrayList<Integer> solution = new ArrayList<Integer>();
//        solution.add(4164);
//        solution.add(3795);
//        assertEquals(solution, fixture.init(1000, 2));
//    }


    @Test
    public void testPalindromeForThreeDigitNumber() {
        assertEquals(true, PalindromicSums.isNumberPalindrome(101));
    }

}
