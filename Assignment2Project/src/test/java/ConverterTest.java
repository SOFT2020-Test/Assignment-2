import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest extends TestCase {

    @Test
    void reverseString() {
        String result = Converter.ReverseString("ABC1");
        String expected = "1CBA";
        assertEquals(expected, result);
    }

    @Test
    void capitaliseString() {
        String result = Converter.CapitaliseString("abc");
        String expected = "ABC";
        assertEquals(expected, result);
    }

    @Test
    void lowercaseString() {
        String result = Converter.LowercaseString("ABC1,DEF2");
        String expected = "abc1,def2";
        assertEquals(expected, result);
    }
}