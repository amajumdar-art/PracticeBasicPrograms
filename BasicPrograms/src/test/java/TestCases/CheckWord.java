package TestCases;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckWord {
	
	public static String word;
	
	public CheckWord() {
		  
		
	}  
	
	public boolean wordCheck(String word) {        
		this.word = word;
		try {
			BufferedReader in = new BufferedReader(new FileReader("/Users/aritramajumdar/eclipse-workspace/BasicPrograms/src/main/java/data/pg29765.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				if (str.indexOf(word) != -1) {
					return true;
					}
				}
			in.close();
			}
		catch (IOException e) {
			
		}
		return false;
		}
	
	}