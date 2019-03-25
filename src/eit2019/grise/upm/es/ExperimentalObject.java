package eit2019.grise.upm.es;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		
		String roman = new String();
		
		//  I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000
		
		int newNumber = number;
		int restante = 0;
		int numeroDeVeces;
		
		//<HashMap> [][] numerosRomanos  = new HashMap<> {{1,5,10,50,100,500,1000},{I,V,X,L,C,D,M}};
		
		
		
		while (newNumber > 1) {
			
			if(newNumber/1000 != 0) {
				numeroDeVeces = newNumber/1000;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"M";
				}
				restante = newNumber%1000;
			}
			else if(newNumber/500 != 0) {
				numeroDeVeces = newNumber/500;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"D";
				}
				restante = newNumber%500;
			}
			else if(newNumber/100 != 0 && 100-restante>30) {
				numeroDeVeces = newNumber/100;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"C";
				}
				restante = newNumber%100;
			}
			else if(newNumber/50 != 0 && 50-restante<=10) {
				numeroDeVeces = newNumber/50;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"L";
				}
				restante = newNumber%50;
			}
			else if(newNumber/10 != 0 && 50-restante>10) {
				numeroDeVeces = newNumber/10;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"X";
				}
				restante = newNumber%10;
			}
			else if(newNumber/5 != 0 && 5-restante>3) {
				numeroDeVeces = newNumber/5;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"V";
				}
				restante = newNumber%5;
			}
			else if(newNumber/1 != 0 && 5-restante<=3) {
				numeroDeVeces = newNumber/1;
				for(int ii=0; ii< numeroDeVeces; ii++) {
					roman = roman +"I";
				}
				restante = newNumber%1;
			}
			newNumber = restante;
		}
		
		return roman;
	}

}
