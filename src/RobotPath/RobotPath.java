package RobotPath;

/*
You have created a computer simulation of a mobile robot. The robot moves on an infinite plane, starting from position (0,0).
Its movements are described by command string of your choosing composed of three instructions you have provided:

        G means go forward one step
        L means turn left
        R means turn right

        The movments described in the input string are repeated for an infinite time. Your task to find if there exists a circle,
        whose radius is some positive real number R such that the bot never leaves it. If such a circle exists then return "YES" otherwise "NO"

        You have to complete the function string doesCircleExist(string commands) which reads the input command as argument and returns the output.

        Constraints
        - commands will consists of only G, L, R
        1 <= length (commands) <= 2500

        Sample:

        commands: "L"
        returns: "YES"
        Explanation: Bot never moves a step in his life. It just rotates by 90 degrees at each turn.

        Sample #2:

        commands: "GRGL"
        returns: "NO"
        Explanation: The original direction of the robot is north. It will repeatedly follow the steps. Going north, turn right, go east, turn left, go north.
        This will cause the robot to zigzag.
*/

public class RobotPath {

    public static final Character RIGHT = 'R';
    public static final Character LEFT = 'L';
    public static final Character GOFORWARD = 'G';

    public static final String NO = "NO";
    public static final String YES = "YES";

    public static int NORTHANDSOUTHCOUNTER = 0;
    public static int EASTANDWESTCOUNTER = 0;

    public static final String NORTH = "North";
    public static final String SOUTH = "South";
    public static final String WEST = "West";
    public static final String EAST = "East";

    public static String direction;


    public static String doesCircleExist(String commands) {

        direction = NORTH;
        for (int i = 0; i < commands.length(); i++) {
            Character c = commands.charAt(i);
            determineNextMoveNetValue(c);
        }
        if (NORTHANDSOUTHCOUNTER == 0 && EASTANDWESTCOUNTER == 0) {
            return YES;
        }
        return NO;
    };

    public static void determineNextMoveNetValue(Character nextMove) {
        if (nextMove.equals(GOFORWARD)) {
            handleFowardMovement();
        } else if (nextMove.equals(RIGHT)) {
            handleRightMovement();
        } else if (nextMove.equals(LEFT)) {
            handleLeftMovement();
        }
    };

    public static void handleFowardMovement() {
        if (direction.equals(NORTH)) {
            NORTHANDSOUTHCOUNTER++;
        } else if (direction.equals(EAST)) {
            EASTANDWESTCOUNTER++;
        } else if (direction.equals(WEST)) {
            EASTANDWESTCOUNTER--;
        } else if (direction.equals(SOUTH)) {
            NORTHANDSOUTHCOUNTER--;
        }
    };

    public static void handleRightMovement() {
        if (direction.equals(NORTH)) {
            direction = EAST;
        } else if (direction.equals(EAST)) {
            direction = SOUTH;
        } else if (direction.equals(WEST)) {
            direction = NORTH;
        } else if (direction.equals(SOUTH)) {
            direction = WEST;
        }
    };

    public static void handleLeftMovement() {
        if (direction.equals(NORTH)) {
            direction = WEST;
        } else if (direction.equals(EAST)) {
            direction = NORTH;
        } else if (direction.equals(WEST)) {
            direction = SOUTH;
        } else if (direction.equals(SOUTH)) {
            direction = EAST;
        }
    };


    public static void main (String[] args) {
        System.out.println("YES".equals(RobotPath.doesCircleExist("R")));
        System.out.println("YES".equals(RobotPath.doesCircleExist("GRGRGRG")));
        System.out.println("YES".equals(RobotPath.doesCircleExist("GRGLGRGRGLGRGRGLGRGRGLG")));
        System.out.println("NO".equals(RobotPath.doesCircleExist("GRGL")));
        System.out.println("NO".equals(RobotPath.doesCircleExist("GRGLGGRRGGGGRRRLLLGRR")));
    }


}
