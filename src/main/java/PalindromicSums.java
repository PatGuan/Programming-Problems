package src.main.java;

import java.util.ArrayList;

/**
     The palindromic number 595595 is interesting because it can be written as the sum of consecutive squares: 62+72+82+92+102+112+12262+72+82+92+102+112+122 .
     The palindromic number 696696 is also nice because it can be written as 102+122+142+162102+122+142+162, where the bases form an arithmetic progression with common difference 22.
     There are exactly eleven palindromes below one-thousand that can be written as consecutive square sums, and the sum of these palindromes is 41644164. Note that 1=02+121=02+12 has not been included as this problem is concerned with the squares of positive integers. Also, there has to be at least two terms in the sum.
     Given NN and dd, find the sum of all the numbers less than NN that are both palindromic and can be written as the sum of squares whose bases form an arithmetic progression with common difference dd.
     Input Format
     The first line of input contains TT, the number of test cases.
     Each test case consists of a single line containing two integers NN and dd, separated by a space.

     Constraints

     1≤T≤20
     1≤N≤10^9
     1≤d≤10^9

     Output Format
     For each test case, output a single line containing a single integer, the answer for that test case.

     Sample Input
     2
     1000 1
     1000 2

     Sample Output
     4164
     3795

     Explanation

     The first test case corresponds to the example given in the problem statement.

     In the second test case, d=2, and there are 66 such numbers less than 1000. Two such numbers are:

     696 = 10^2+12^2+14^2+16^2
     969 = 1^2+3^2+5^2+7^2+9^2+11^2+13^2+15^2+17^2
 */


public class PalindromicSums {

    public static ArrayList<Integer> init(int numericSumLimit, int baseDifference) {
        return getPalindromicSums(numericSumLimit, baseDifference, 1);
    }

    private static ArrayList<Integer> getPalindromicSums(int numericSumLimit, int baseDifference, int startingIteratingPosition) {
        int i;
        ArrayList<Integer> palindromicSums = new ArrayList<Integer>();
        int currentTotal = 0;
        for (i = startingIteratingPosition; i < Math.sqrt(numericSumLimit); i+=baseDifference) {
            currentTotal += i*i;
            if (currentTotal > numericSumLimit) {
                palindromicSums.addAll(getPalindromicSums(numericSumLimit, baseDifference, startingIteratingPosition + baseDifference));
            }
            else if ((currentTotal > 100) && isNumberPalindrome(currentTotal)){
                palindromicSums.add(currentTotal);
            }
        }
        return palindromicSums;
    }


    public static boolean isNumberPalindrome(int number) {
        String stringNumber = String.valueOf(number);
        int i;
        for (i = 0; i < stringNumber.length()/3; i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - i - 1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(init(1000, 1));
    }

}































