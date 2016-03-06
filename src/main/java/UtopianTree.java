package src.main.java;

/**
 The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

 Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after NN growth cycles?

 Input Format

 The first line contains an integer, TT, the number of test cases.
 TT subsequent lines each contain an integer, NN, denoting the number of cycles for that test case.

 Constraints
 1 ≤ T ≤10
 0 ≤ N ≤ 60
 Output Format

 For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.

 Sample Input
 3
 0
 1
 4

 Sample Output
 1
 2
 7

 */
import java.util.Scanner;

public class UtopianTree {

    public static final String SPRING = "SPRING";
    public static final String SUMMER = "SUMMER";

    public static final int SUMMER_GROWTH_HEIGHT = 1;
    public static final int SPRING_GROWTH_FACTOR = 2;

    public static final int STARTING_HEIGHT = 1;

    public static int getHeightForRemainingCycles(int height, int cyclesRemaining, String season) {
        if (cyclesRemaining == 0) {
            return height;
        }
        else if (SUMMER.equals(season)) {
            return getHeightForRemainingCycles(height + SUMMER_GROWTH_HEIGHT, cyclesRemaining - 1, SPRING);
        }
        //There exists remaining cycles and it is currently Spring.
        else {
            return getHeightForRemainingCycles(height * SPRING_GROWTH_FACTOR, cyclesRemaining - 1, SUMMER);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getHeightForRemainingCycles(STARTING_HEIGHT, n, SPRING));
        }
    }
}
