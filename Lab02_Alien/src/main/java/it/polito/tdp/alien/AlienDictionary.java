package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	/*private List<Word> parole = new LinkedList();

	public List<Word> getParole() {
		return parole;
	}

	public void addWord(String alienWord, String translation) {

		for (Word w : parole) {
			if (w.equals(alienWord)) {
				System.out.println("1");
				w.setTranslation(translation);
				return;
			}
		}
		System.out.println("2");
		parole.add(new Word(alienWord, translation));
	}

	public String translateWord(String alienWord) {
		for (Word w : parole) {
			if (w.equals(alienWord)) {
				return w.getTranslation();
			}
		}
		return null;
	}
*/
	private List<WordEnhanced> parole = new LinkedList();

	public List<WordEnhanced> getParole() {
		return parole;
	}

	public void addWord(String alienWord, String translation) {

		for (WordEnhanced w : parole) {
			if (w.equals(alienWord)) {
				System.out.println("1");
				//w.setTranslation(translation);
				w.aggiungiTraduzioni(translation);
				return;
			}
		}
		System.out.println("2");
		parole.add(new WordEnhanced(alienWord, translation));
	}

	public String translateWord(String alienWord) {
		for (WordEnhanced w : parole) {
			if (w.equals(alienWord)) {
				return w.getTraduzioni();
			}
		}
		return null;
	}
}