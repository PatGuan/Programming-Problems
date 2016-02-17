package SimpleCalculator;

/**
     Simple Calculator

     Implement a function that takes a string as input and returns an integer. Its purpose is to return the numeric result of the expression - a simple calculator function.
     However, to make this simpler, the expression is limited to only the numbers 0-9 and the symbols ()+-.
     So the only mathematical operators you need to implement are Addition and Subtraction. Numbers are only single digits without negative numbers.
     The solution must also be able to handle parentheses properly.

     Assume valid expression and input and no space. Do not use eval to evaluate the expression.

     Sample:
     "1+3-(2+9)"

     Output:
     -7

     Sample:
     "(2-(6+1+3)-5)+(8+7)

     Output:
     2
 */

public class SimpleCalculator {

    public static Character OPENINGBRACKET = '(';
    public static Character CLOSINGBRACKET = ')';
    public static Character ADDITION = '+';
    public static Character SUBTRACTION = '-';



    public static int parseStringExpression(String expression) {

        int currentBracketTotal = 0;
        Character operatorToBeExecuted = null;

        for (int i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);

            if (isClosingBracket(character)) {
                return currentBracketTotal;
            }
            else if (isOpeningBracket(character)) {
                currentBracketTotal = parseStringExpression(expression.substring(i+1));
                i += expression.substring(i+1).length();
            }
            else if (character.equals(ADDITION)) {
                operatorToBeExecuted = ADDITION;
            }
            else if (character.equals(SUBTRACTION)) {
                operatorToBeExecuted = SUBTRACTION;
            }
            else if (!(character.equals(SUBTRACTION) || character.equals(SUBTRACTION)) && operatorToBeExecuted != null) {
                currentBracketTotal = applyOperator(currentBracketTotal, operatorToBeExecuted, character);
                operatorToBeExecuted = null;
            }
            else if (!(character.equals(SUBTRACTION) || character.equals(ADDITION))) {
                currentBracketTotal = Character.getNumericValue(character);
            }
        }
        return currentBracketTotal;
    }


//
//    public static void applyOperator(int total, int valueToBeSummed, Character operator, String expression) {
//        if (operator != null) {
//            if (operator == ADDITION) {
//                total += valueToBeSummed;
//            }
//            else {
//                total -= valueToBeSummed;
//            }
//        }
//        else {
//            total = parseStringExpression(expression.substring(i+1));
//        }
//    }

    /*
        Applies the operator to the values.
    */
    public static int applyOperator(int total, Character operator, Character c) {
        if (operator == null) {
            return total;
        }
        if (operator.equals(ADDITION)) {
            return total += Character.getNumericValue(c);
        }
        return total -= Character.getNumericValue(c);
    };

    /*
        Handling of opening and closing brackets.
     */
    public static boolean isOpeningBracket(Character c) {
        return c.equals(OPENINGBRACKET);
    }

    public static boolean isClosingBracket(Character c) {
        return c.equals(CLOSINGBRACKET);
    }


    public static void main(String[] args) {

        int answer1 = 4;
        int answer2 = 4;
        int answer3 = 14;
        int answer4 = 12;
        int answer5 = 8;

        int answer6 = -2;
        int answer7 = -2;
        int answer8 = 8;
        int answer9 = -2;
        int answer10 = 0;
        int answer11 = 1;

        System.out.println(answer1 == parseStringExpression("1+3"));
        System.out.println(answer2 == (parseStringExpression("(1+3)")));
        System.out.println(answer3 == (parseStringExpression("1+3+7+(1+2)")));
        System.out.println(answer4 == (parseStringExpression("1+3+7+(1)")));
        System.out.println(answer5 == (parseStringExpression("1+3+(1+2)+1")));

//        System.out.println(answer6 == parseStringExpression("1-3"));
//        System.out.println(answer7 == (parseStringExpression("(1-3)")));
//        System.out.println(answer8 == (parseStringExpression("1+3+7-(1+2)")));
//        System.out.println(answer9 == (parseStringExpression("1+3-7+(1)")));
//        System.out.println(answer11 == (parseStringExpression("1+3-(1+2)")));
//        System.out.println(answer10 == (parseStringExpression("1+3-(1+2)-1")));
    };

}
