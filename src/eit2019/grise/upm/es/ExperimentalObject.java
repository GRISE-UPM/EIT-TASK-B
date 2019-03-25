package eit2019.grise.upm.es;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		//Number to be transformed
		int number = 42;
		
		//Check Number
		if (number <= 0) {
			throw new NegativeNumbersNotAllowed ("Negative numbers and the number 0 are not allowed.");
		}

		//Call function
		String romanNumber = primeRomanNumber(number);
		
		//Print roman number
		System.out.println(romanNumber);
	}
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		
		String roman = new String();

		while(number>=1000) {
			roman = roman + "C";
			number -= 1000;
		}
		
		while(number>=900) {
			roman = roman + "CM";
			number -= 900;
		}
		
		while(number>=500) {
			roman = roman + "D";
			number -= 500;
		}
		
		while(number>=400) {
			roman = roman + "CD";
			number -= 400;
		}
		
		while(number>=100) {
			roman = roman + "C";
			number -= 100;
		}
		
		while(number>=90) {
			roman = roman + "XC";
			number -= 90;
		}
		
		while(number>=50) {
			roman = roman + "L";
			number -= 50;
		}
		
		while(number>=40) {
			roman = roman + "XL";
			number -= 40;
		}
		
		while(number>=10) {
			roman = roman + "X";
			number -= 10;
		}
		
		while(number>=5) {
			roman = roman + "V";
			number -= 5;
		}
		
		while(number>=4) {
			roman = roman + "IV";
			number -= 4;
		}
		
		while(number>0){
			roman = roman + "I";
			number -= 1;
		}
		
		return roman;
	}

}
