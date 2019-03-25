package eit2019.grise.upm.es;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		// TODO Auto-generated method stub
		primeRomanNumber(122);

	}
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		
		
		String roman = new String();
		
		int M = number / 1000;
		number = (number - (M * 1000));
		int D =  number / 500;
		number = (number - (D * 500));
		int C = number / 100;
		number = (number - (C * 100));
		int L = number / 50;
		number = (number - (L * 50));
		int X = number / 10;
		number = (number - (X * 10));
		int V = number / 5;
		number = (number - (V * 5));
		int I = number;
		
		

		for (int i = 0; i < M; i++) {
			roman = roman.concat("M");
		}
		for (int i = 0; i < D; i++) {
			roman = roman.concat("D");
		}
		for (int i = 0; i < C; i++) {
			roman = roman.concat("C");
		}
		for (int i = 0; i < L; i++) {
			roman = roman.concat("L");
		}
		for (int i = 0; i < X; i++) {
			roman = roman.concat("X");
		}
		for (int i = 0; i < V; i++) {
			roman = roman.concat("V");
		}
		for (int i = 0; i < number; i++) {
			roman = roman.concat("I");
		}
		
		System.out.println(roman);

	
		
		return roman;
	}	
}




