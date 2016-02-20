package src.test;

import org.junit.Assert;
import org.junit.Test;
import src.main.RobotPath.RobotPath;

import static org.junit.Assert.*;

public class RobotPathTest {


    @Test
    public void testDoesCircleExistForTurningOnlyRight() {
        Assert.assertEquals(RobotPath.YES, RobotPath.doesCircleExist("R"));
    }

    @Test
    public void testDoesCircleExistForSquarePath() {
        assertEquals(RobotPath.YES, RobotPath.doesCircleExist("GRGRGRG"));
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