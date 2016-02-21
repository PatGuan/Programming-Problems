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


import java.util.HashMap;

public class SimpleCalculator {


    public static final Character OPENING_BRACKET = '(';
    public static final Character CLOSING_BRACKET = ')';

    public static final Character ADDITION = '+';
    public static final Character SUBTRACTION = '-';

    public static final String HASHMAP_TOTALVALUE_KEY = "currentTotal";
    public static final String HASHMAP_EXPRESSIONLENGTH_KEY = "expressionLength";



    public static int calculateValueFromStringExpression(String expression) {
        return calculateStringExpression(expression).get(HASHMAP_TOTALVALUE_KEY);
    }

    public static HashMap<String, Integer> calculateStringExpression(String expression) {

        int currentTotal = 0;
        int i;
        Character operator = null;

        for (i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);

            //Handles the case of opening bracket
            if (isOpeningBracket(character)) {
                HashMap calculatedResult = calculateStringExpression(expression.substring(i+1));
                int subTotalInBrackets = (Integer) calculatedResult.get(HASHMAP_TOTALVALUE_KEY);
                currentTotal = handleSubtotalInBrackets(operator, currentTotal, subTotalInBrackets);
                i += (Integer) calculatedResult.get(HASHMAP_EXPRESSIONLENGTH_KEY);
            }
            else if (isClosingBracket(character)) {
                return mapTotalValueAndExpressionLength(currentTotal, i);
            }
            //Handles the case of addition character
            else if (isAddition(character)) {
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
                currentTotal = applyOperatorToValues(currentTotal, Character.getNumericValue(character), operator);
            }
        }

        return mapTotalValueAndExpressionLength(currentTotal, i);
    }

    public static HashMap mapTotalValueAndExpressionLength(int currentTotal, int expressionLength) {
        HashMap<String, Integer> currentTotalAndSubExpressionLength = new HashMap<String, Integer>();
        currentTotalAndSubExpressionLength.put(HASHMAP_TOTALVALUE_KEY, currentTotal);
        currentTotalAndSubExpressionLength.put(HASHMAP_EXPRESSIONLENGTH_KEY, expressionLength + 1);
        return currentTotalAndSubExpressionLength;
    }

    public static int handleSubtotalInBrackets(Character operator, int currentTotal, int subTotal) {
        if (operator != null) {
            return applyOperatorToValues(currentTotal, subTotal, operator);
        }
        else {
            return subTotal;
        }
    }

    public static int applyOperatorToValues(int total, int valueToBeSummed, Character operator) {
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
    public static boolean isOpeningBracket(Character c) {
        return OPENING_BRACKET.equals(c);
    }
    public static boolean isClosingBracket(Character c) {
        return CLOSING_BRACKET.equals(c);
    }

}
