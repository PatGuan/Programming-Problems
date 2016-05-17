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

    @Test
    public void should_return_XXI_given_21() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(21), "XXI");
    }

    @Test
    public void should_return_XXIV_given_24() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(24), "XXIV");
    }

    @Test
    public void should_return_XXV_given_25() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(25), "XXV");
    }

    @Test
    public void should_return_XXIX_given_29() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(29), "XXIX");
    }

    @Test
    public void should_return_XXX_given_30() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(30), "XXX");
    }

    @Test
    public void should_return_XXXI_given_31() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(31), "XXXI");
    }

    @Test
    public void should_return_XXXIV_given_34() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(34), "XXXIV");
    }

    @Test
    public void should_return_XXXV_given_35() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(35), "XXXV");
    }

    @Test
    public void should_return_XXXVI_given_36() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(36), "XXXVI");
    }

    @Test
    public void should_return_XXXIX_given_39() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(39), "XXXIX");
    }

    @Test
    public void should_return_XL_given_40() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(40), "XL");
    }

    @Test
    public void should_return_XLV_given_45() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(45), "XLV");
    }

    @Test
    public void should_return_L_given_50() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(50), "L");
    }

    @Test
    public void should_return_LIV_given_54() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(54), "LIV");
    }

    @Test
    public void should_return_LV_given_55() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(55), "LV");
    }

    @Test
    public void should_return_LX_given_60() {
        assertEquals(RomanNumeral.convertNumberArabicToRoman(60), "LX");
    }

}
