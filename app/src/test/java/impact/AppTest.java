package impact;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testEmptyListArgument(){
        int[] numbers = {};
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = RangeBuilder.createRanges(numbers);
        assertEquals(expected, actual);
        assertEquals(0, actual.size());
    }

    @Test
    void testOneNumber(){
        int[] numbers = {2};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        ArrayList<String> actual = RangeBuilder.createRanges(numbers);
        assertEquals(expected,actual);
    }

    @Test
    void testRangesOutputList(){
        int[] numbers = {1,2,3,20,34,35};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1-3");
        expected.add("20");
        expected.add("34-35");
        ArrayList<String> actual = RangeBuilder.createRanges(numbers);
        assertEquals(expected,actual);
    }

    @Test
    void testRangeNormalNumber(){
        Range rangeUnderTest = new Range(3,5);
        assertEquals("3-5", rangeUnderTest.toString());
    }

    @Test
    void testRangeWithSingleNumber(){
        Range rangeUnderTest = new Range(3,3);
        assertEquals("3", rangeUnderTest.toString());
    }

    @Test
    void testFourRangesLength(){
        int[] numbers = {20,21,22,44,73,74,75, 100,101};
        ArrayList<String> underTest = RangeBuilder.createRanges(numbers);
        int actual = underTest.size();
        assertEquals(4, actual);
    }
}
