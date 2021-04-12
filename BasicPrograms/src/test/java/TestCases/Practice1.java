package TestCases;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {
		
		String str = "abbccddeffez";
		
		HashMap <Character, Integer> strChar = new HashMap <Character, Integer> ();
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(strChar.containsKey(c)) {
				strChar.put(c, strChar.get(c)+1);
			}
			else {
				strChar.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m: strChar.entrySet()) {
			if(m.getValue() == 1) {
				System.out.print(m.getKey()+ "");
			}
		}
		
		
	}

}
