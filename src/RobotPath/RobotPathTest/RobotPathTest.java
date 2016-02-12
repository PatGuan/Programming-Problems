package RobotPath.RobotPathTest;

import RobotPath.RobotPath;
import org.junit.Test;

public class RobotPathTest {


    @Test
    public void testDoesCircleExist() throws Exception {
        assert "YES".equals(RobotPath.doesCircleExist("R"));
    }
}