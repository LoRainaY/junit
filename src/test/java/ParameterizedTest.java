import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private int sideA;
    private int sideB;
    private int sideC;
    private boolean expected;

    public ParameterizedTest(int sideA, int valueB, int sideC, boolean expected) {
        this.sideA = sideA;
        this.sideB = valueB;
        this.sideC = sideC;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:side {0}, {1} and {2} is triangle?")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {2, 5, 4, true},
                {12, 9, 30, false},
                {10, 15, 12, true},
                {999, 1000, 1100, true}
        });
    }

    @Test
    public void paramTestIsTriangle() {
        assertEquals(expected, new Triangle(sideA, sideB, sideC).isTriangle());
    }


}
