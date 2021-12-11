package az.iktlab.juniors.lessons.lesson_6;

import org.junit.*;

public class FirstUnitTest {
    @Test
    public void testFindMax(){
        Assert.assertEquals(5,UnitTestEx.findMax(5,3));
    }
}

