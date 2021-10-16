package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    @Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
    	StringCalculator stringCalculator = new StringCalculator();
	    assertEquals(3, stringCalculator.add("3"));
	}
    @Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
    	StringCalculator stringCalculator = new StringCalculator();
	    assertEquals(3+6, stringCalculator.add("3,6"));
	}
    
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));
 }
}
