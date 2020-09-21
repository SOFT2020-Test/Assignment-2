import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void reverseString() {
        String result = Converter.ReverseString("ABC");
        String expected = "CBA";
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