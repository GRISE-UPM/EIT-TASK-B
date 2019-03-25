package eit2019.grise.upm.es;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExperimentalObject {

	public static void main(String[] args) throws NegativeNumbersNotAllowed {
		// TODO Auto-generated method stub
		
		  }
	
	
	public static String primeRomanNumber(int number) throws NegativeNumbersNotAllowed {
		 LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
		String roman = new String();
		
		// TODO Method stub
		roman_numerals.put("M", 1000);
	    roman_numerals.put("CM", 900);
	    roman_numerals.put("D", 500);
	    roman_numerals.put("CD", 400);
	    roman_numerals.put("C", 100);
	    roman_numerals.put("XC", 90);
	    roman_numerals.put("L", 50);
	    roman_numerals.put("XL", 40);
	    roman_numerals.put("X", 10);
	    roman_numerals.put("IX", 9);
	    roman_numerals.put("V", 5);
	    roman_numerals.put("IV", 4);
	    roman_numerals.put("I", 1);
	    String res="";
	    for (Map.Entry<String,Integer>entry:roman_numerals.entrySet()) {
	    	int matches = number/entry.getValue();
	        res += repeat(entry.getKey(), matches);
	        number = number % entry.getValue();
	      }
	      return res;
	    }
	    public static String repeat(String s, int n) {
	      if(s == null) {
	          return null;
	      }
	      final StringBuilder sb = new StringBuilder();
	      for(int i = 0; i < n; i++) {
	          sb.append(s);
	      }
	    
		return sb.toString();
	    }}



