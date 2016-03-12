package src.test.java;

import org.junit.Test;
import src.main.java.PalindromicSums;

import static org.junit.Assert.assertEquals;

public class PalindromicSumsTest {

    @Test
    public void testPalindromeForThreeDigitNumber() {
        assertEquals(true, PalindromicSums.isNumberPalindrome(101));
    }

}
