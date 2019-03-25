package eit2019.grise.upm.es;

import java.util.ArrayList;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		System.out.println(getRomanNumber(2));
		System.out.println(getRomanNumber(5));
		System.out.println(getRomanNumber(14));
		System.out.println(getRomanNumber(44));
		System.out.println(getRomanNumber(69));
		System.out.println(getRomanNumber(101));
		System.out.println(getRomanNumber(269));
		System.out.println(getRomanNumber(788));
		System.out.println(getRomanNumber(1788));
		System.out.println(getRomanNumber(5101));
	}
	
	public static String getRomanNumber(int number) throws NegativeNumbersNotAllowed {
		String roman = "";
		
		if (number < 0) {
			throw new NegativeNumbersNotAllowed();
		}
		if (number == 0) {
			throw new RuntimeException("0 cannot be converted to a roman number");
		}

		ArrayList<String[]> digitMap = new ArrayList<>();
		digitMap.add(new String[]{"I", "V", "X"});
		digitMap.add(new String[]{"X", "L", "C"});
		digitMap.add(new String[]{"C", "D", "M"});

		String maxChar = "M";

		int index = 0;
		while (number > 0) {
			if (digitMap.size() <= index) {
				break;
			}
			String[] chars = digitMap.get(index);

			int firstDigit = number % 10;
			roman = convertDigit(chars[0], chars[1], chars[2], firstDigit) + roman;

			number = number / 10;

			index++;
		}

		if (number > 0) {
			for (int i = 0; i < number; i++) {
				roman = maxChar + roman;
			}
		}

		return roman;
	}

	private static String convertDigit(String lowerChar, String middleChar, String upperChar, int firstDigit) {
		String roman = "";
		switch (firstDigit) {
			case 1: roman = lowerChar;
				break;
			case 2: roman = lowerChar + lowerChar;
				break;
			case 3: roman = lowerChar + lowerChar + lowerChar;
				break;
			case 4: roman = lowerChar + middleChar;
				break;
			case 5: roman = middleChar;
				break;
			case 6: roman = middleChar + lowerChar;
				break;
			case 7: roman = middleChar + lowerChar + lowerChar;
				break;
			case 8: roman = middleChar + lowerChar + lowerChar + lowerChar;
				break;
			case 9: roman = lowerChar + upperChar;
				break;
		}
		return roman;
	}

}
