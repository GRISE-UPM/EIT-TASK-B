package eit2019.grise.upm.es;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		
		String roman = new String();
		
		// TODO Method stub
		
		String[] romanCharacters = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
		int[] romanValues = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };

		for (int i = 0; i < romanValues.length; i++) {
			int numberInPlace = number / romanValues[i];
			if (numberInPlace == 0) continue;
			roman += numberInPlace == 4 && i > 0? romanCharacters[i] + romanCharacters[i - 1]:
				new String(new char[numberInPlace]).replace("\0",romanCharacters[i]);
			number = number % romanValues[i];
		}
		return roman;
	}

}
