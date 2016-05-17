package src.main.java;


import java.util.ArrayList;
import java.util.HashMap;

public class RomanNumeral {

    private static HashMap<Integer, String> mapOfArabicNumeralsToRoman = new HashMap<Integer, String>();
    private static ArrayList<Integer> listOfRomanNumerals = new ArrayList<Integer>();

    public static void initializeHashMappings() {
        mapOfArabicNumeralsToRoman.put(new Integer(50), "L");
        mapOfArabicNumeralsToRoman.put(new Integer(40), "XL");
        mapOfArabicNumeralsToRoman.put(new Integer(10), "X");
        mapOfArabicNumeralsToRoman.put(new Integer(9), "IX");
        mapOfArabicNumeralsToRoman.put(new Integer(5), "V");
        mapOfArabicNumeralsToRoman.put(new Integer(4), "IV");

        listOfRomanNumerals.add(50);
        listOfRomanNumerals.add(40);
        listOfRomanNumerals.add(10);
        listOfRomanNumerals.add(9);
        listOfRomanNumerals.add(5);
        listOfRomanNumerals.add(4);
    };

    public static String convertNumberArabicToRoman(int number) {

        initializeHashMappings();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < listOfRomanNumerals.size(); i += 0) {
            if (number >= listOfRomanNumerals.get(i)) {
                sb.append(mapOfArabicNumeralsToRoman.get(listOfRomanNumerals.get(i)));
                number -= listOfRomanNumerals.get(i);
            }
            else if (number < listOfRomanNumerals.get(i)) {
                i++;
            }
        }

        for (int i = 0; i < number; i++) {
            sb.append("I");
        }

        return new String(sb);
    }

}
