package src.main.java;


public class RomanNumeral {

    public static String convertNumberArabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();

        if (number == 4) {
            sb.append("IV");
            number -= 4;
        }
        if (number == 9) {
            sb.append("IX");
            number -= 9;
        }
        if (number >= 10) {
            sb.append("X");
            number -= 10;
        }
        if (number >= 5) {
            sb.append("V");
            number -= 5;
        }
        for (int i = 0; i < number; i++) {
            sb.append("I");
        }
        return new String(sb);
    }
}
