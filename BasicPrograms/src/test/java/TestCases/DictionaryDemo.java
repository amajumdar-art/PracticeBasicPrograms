package TestCases;

import java.util.ArrayList;

public class DictionaryDemo extends CheckWord {
	
	static ArrayList ar = new ArrayList();
	

	public static void main(String[] args) {
		
		CheckWord check = new CheckWord();
		
		combine("working", new StringBuffer(), 0);
		
		System.out.println(ar.size());
		
		for (int i = 0; i < ar.size(); i++) {
			word = (String) ar.get(i);
			if (check.wordCheck(word)) {
				System.out.print(word + " is an English word");
			}
		}
		

	}
	
	
	public static void combine(String instr, StringBuffer outstr, int index)
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	        System.out.println(outstr);
	        ar.add(outstr);
	        combine(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);
	    
	        
	    }
	} 

}
