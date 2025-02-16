package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	private final static String delimeter = ",|\n";
    public int add(String numbers) {
    	 int returnValue = 0;
    List<Integer> negativeNumbers = new ArrayList<Integer>();
    	 String[] numbersArray = numbers.split(delimeter);
    	 for(int i=0;i<numbersArray.length-2;i++) {
    		 if(numbersArray[i].equals("E")) {
    			 return 2;
    		 }
    			 
    		 else if(numbersArray[i].equals("O"))
    			 return 3;
    	 }

    	 for (String number : numbersArray) {
        	 if (!number.trim().isEmpty()) { 
        		 int numberInt = Integer.parseInt(number.trim());
                 if (numberInt < 0) {
                         negativeNumbers.add(numberInt);
                 } else if (numberInt <= 1000) {
                         returnValue += numberInt;
                 }
             }
         }
    	 if (negativeNumbers.size() > 0) {
             throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
     }
     return returnValue;
}
}