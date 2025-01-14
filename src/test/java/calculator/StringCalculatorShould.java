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
    @Test
    public final void newLineBetweenNumbers() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
 }
    @Test
	 public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
    	StringCalculator stringCalculator = new StringCalculator();
		 RuntimeException exception = null;
		    try {
		        stringCalculator.add("3,-6,15,46,33");
		    } catch (RuntimeException e) {
		        exception = e;
		    }
    }
    
    @Test
	 public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
    	StringCalculator stringCalculator = new StringCalculator();
	     assertEquals(3+1000+6, stringCalculator.add("3,1000,1001,6,1234"));
	 }
    @Test
    public void addNumber() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2 ,stringCalculator.add("E1,5,6"));
    	assertEquals(3,stringCalculator.add("E1,5,6"));
    	
    }

}
