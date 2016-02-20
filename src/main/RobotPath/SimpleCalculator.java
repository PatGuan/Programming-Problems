package src.main.RobotPath;

/*
    Simple Calculator

    Implement a function that takes a string as input and returns an integer. Its purpose is to return the numeric result of the expression - a simple calculator function.
    However, to make this simpler, the expression is limited to only the numbers 0-9 and the symbols ()+-. So the only mathematical operators you need to implement are Addition and Subtraction.
    Numbers are only single digits without negative numbers. The solution must also be able to handle parentheses properly.

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


    public static final Character OPENING_BRACKET = '(';
    public static final Character CLOSING_BRACKET = ')';

    public static final Character ADDITION = '+';
    public static final Character SUBTRACTION = '-';


    public static int calculateStringExpression(String expression) {

        int currentTotal = 0;
        Character operator = null;

        for (int i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);

            //Handles the case of addition character
            if (isAddition(character)) {
                operator = ADDITION;
            }
            //Handles the case of subtraction character
            else if (isSubtraction(character)) {
                operator = SUBTRACTION;
            }
            //First number being parsed
            else if (operator == null) {
                currentTotal = Character.getNumericValue(character);
            }
            //Is a numeric value that needs to be summed
            else if (!isAddition(character) && !isSubtraction(character)) {
                currentTotal = applyOperatorToValues(currentTotal, character, operator);
            }
        }
        return currentTotal;
    }

    public static int applyOperatorToValues(int total, Character character, Character operator) {
        int valueToBeSummed = Character.getNumericValue(character);
        if (isAddition(operator)) {
            return total += valueToBeSummed;
        }
        return total -= valueToBeSummed;
    }

    public static boolean isAddition(Character c) {
        return ADDITION.equals(c);
    }
    public static boolean isSubtraction(Character c) {
        return SUBTRACTION.equals(c);
    }

    public static void main(String[] args) {
        System.out.println(SimpleCalculator.calculateStringExpression("20-10"));
    }

}
