package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private String translation;
	private List<String> traduzioni;
	
	public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
		traduzioni = new LinkedList<String>();
		traduzioni.add(translation);
	}
	
	public String getTraduzioni() {
		String s = "";
		for(String s1 : traduzioni)
			s+= s1 +"\n";
		return s;
	}

	public String getAlienWord() {
		return alienWord;
	}
	
	public String getTranslation() {
		return translation;
	}

	@Override
	public boolean equals(Object obj) {
		String altra = (String) obj;
		if(altra.compareTo(alienWord)==0)
		return true;
		
		return false;
	}

	public void aggiungiTraduzioni(String translation) {
		traduzioni.add(translation);
	}
	
	

}
