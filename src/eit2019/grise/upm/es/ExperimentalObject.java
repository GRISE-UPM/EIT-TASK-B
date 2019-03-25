package eit2019.grise.upm.es;
import java.util.TreeMap;


public class ExperimentalObject {
	
	 private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<= 10; i++) {
	        try {
				System.out.println(i+"\t =\t "+ toRoman(i));
			} catch (NegativeNumbersNotAllowed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
	
	public static String toRoman(int number) throws NegativeNumbersNotAllowed {
		
		String roman = new String();
		
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    
		// TODO Method stub
		
	}

}
