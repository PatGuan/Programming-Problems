package src.test.java;


import org.junit.Test;
import src.main.java.RomanNumeral;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void should_return_I_given_1() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(1), "I");
    }

    @Test
    public void should_return_II_given_2() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(2), "II");
    }

    @Test
    public void should_return_III_given_3() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(3), "III");
    }

    @Test
    public void should_return_IV_given_4() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(4), "IV");
    }

    @Test
    public void should_return_V_given_5() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(5), "V");
    }

    @Test
    public void should_return_VI_given_6() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(6), "VI");
    }

    @Test
    public void should_return_VIII_given_8() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(8), "VIII");
    }

    @Test
    public void should_return_IX_given_9() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(9), "IX");
    }

    @Test
    public void should_return_X_given_10() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(10), "X");
    }

    @Test
    public void should_return_XI_given_11() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(11), "XI");
    }

    @Test
    public void should_return_XIV_given_14() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(14), "XIV");
    }

    @Test
    public void should_return_XV_given_15() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(15), "XV");
    }

    @Test
    public void should_return_XVI_given_16() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(16), "XVI");
    }

    @Test
    public void should_return_XIX_given_19() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(19), "XIX");
    }


    @Test
    public void should_return_XX_given_20() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(20), "XX");
    }
}
