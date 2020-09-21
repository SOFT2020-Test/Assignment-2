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
}