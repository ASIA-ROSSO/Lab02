package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
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

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
	
	

}
