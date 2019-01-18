package RepeatedWord;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void firstRepeatTest() {
        RepeatedWord classWithMethod = new RepeatedWord();
        String testString = "a dog has 1 pall A";
        String expected = "a";

        String testString1 = "";
        String expected1 = "no repeats";

        String testString2 = "a dog has 1 pall a";

        assertEquals(expected,classWithMethod.firstRepeat(testString));
        assertEquals(expected1,classWithMethod.firstRepeat(testString1));
        assertEquals(expected,classWithMethod.firstRepeat(testString2));


    }
}