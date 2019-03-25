package eit2019.grise.upm.es;

public class ExperimentalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(ExperimentalObject.primeRomanNumber(2));		
			System.out.println(ExperimentalObject.primeRomanNumber(4));
			System.out.println(ExperimentalObject.primeRomanNumber(15));
		} catch (NegativeNumbersNotAllowed e) {
			e.printStackTrace();
		}

	}
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		
		String roman = new String();
		
		if(number > 999) { return "Over 1000";}
		
		if(number >= 100) {
			int cents = (number - (number%100)) / 100;
			roman += getFromPattern(cents, "C", "D", "M");
			number -= cents * 100;
		}
		if(number >= 10) {
			int diz = (number - (number%10)) / 10;
			roman += getFromPattern(diz, "X", "L", "C");
			number -= diz * 10;
		}
		if(number >= 1) {
			roman += getFromPattern(number, "I", "V", "X");
		}
		
		
		return roman;
	}
	
	public static String getFromPattern(int position, String pattern, String mid, String end) {
		
		
		System.out.println(position);
		
		String r = "";
		switch(position) {
	    	case 1:
	    		r = pattern;
		        break;
		    case 2:
	    		r = pattern + pattern;
		        break;
		    case 3:
	    		r = pattern + pattern + pattern;
		        break;
		    case 4:
	    		r = pattern + mid;
		        break;
		    case 5:
	    		r = mid;
		        break;
		    case 6:
	    		r = mid + pattern;
		        break;
		    case 7:
	    		r = mid + pattern + pattern;
		        break;
		    case 8:
	    		r = mid + pattern + pattern + pattern;
		        break;
		    case 9:
	    		r = pattern + end;
		        break;
		    case 10:
		    	r = end;
		        break;
		    default:
		        break;
		}
		return r;
	}

}
