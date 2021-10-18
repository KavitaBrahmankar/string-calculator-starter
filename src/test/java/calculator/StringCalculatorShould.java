package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        assertEquals(1, StringCalculator.add("1"));
    }
    
    @Test
    public void sum_of_string_with_two_numbers_seperatedBy_comma() {
    	assertEquals(3, StringCalculator.add("1,2"));
    }
    
    @Test
    public void accept_newLineAs_Valid_delimiter() {
    	assertEquals(6, StringCalculator.add("1,2\n3"));
    }
    
    @Test
    public void accept_customdelimiter_syntax() {
    	assertEquals(3, StringCalculator.add("//:\n1:2"));
    }
    
}
