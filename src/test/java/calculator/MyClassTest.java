package calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testAdd() {
        MyClass myClass = new MyClass();

        Assert.assertEquals(3, myClass.add(1, 2));
        Assert.assertEquals(0, myClass.add(-1, 1));
        Assert.assertEquals(0, myClass.add(0, 0));
    }
}
