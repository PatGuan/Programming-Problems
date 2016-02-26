package src.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.main.java.RobotPath;

import static org.junit.Assert.assertEquals;

public class RobotPathTest {


    @Before
    public void clearAllDirectionCounters() {
        RobotPath.EASTANDWESTCOUNTER = 0;
        RobotPath.NORTHANDSOUTHCOUNTER = 0;
    }

    @Test
    public void testDoesCircleExistForTurningOnlyRight() {
        Assert.assertEquals(RobotPath.YES, RobotPath.doesCircleExist("R"));
    }

    @Test
    public void testDoesCircleExistForSquarePath() {
        assertEquals("YES", RobotPath.doesCircleExist("GRGRGRG"));
    }

    @Test
    public void testDoesCircleExistForCrossPath() {
        assertEquals(RobotPath.YES, RobotPath.doesCircleExist("GRGLGRGRGLGRGRGLGRGRGLG"));
    }

    @Test
    public void testDoesCircleExistForZigZagPath() {
        assertEquals(RobotPath.NO, RobotPath.doesCircleExist("GRGL"));
    }

    @Test
    public void testDoesCircleExistForRandomJunkInputPath() {
        assertEquals(RobotPath.NO, RobotPath.doesCircleExist("GRGLGGRRGGGGRRRLLLGRR"));
    }


}