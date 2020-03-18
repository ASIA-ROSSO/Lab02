package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AlienDictionary dizionario;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button btnTranslate;

	@FXML
	private TextField txtInserisci;

	@FXML
	private TextArea txtRisultato;

	@FXML
	private Button btnClear;

	@FXML
	void doReset(ActionEvent event) {
		txtRisultato.clear();
		txtInserisci.clear();
		dizionario.getParole().clear();
	}

	@FXML
	void doTranslate(ActionEvent event) {
		String inserimento = txtInserisci.getText();
		
		String alienWorld = inserimento.split(" ")[0].toLowerCase();
		if(!isValid(alienWorld)) {
			return;
		}
	
		System.out.println(alienWorld);
		if (inserimento.split(" ").length == 2) {
			String traduzione = inserimento.split(" ")[1].toLowerCase();
			if(!isValid(traduzione)) {
				return;
			}
			
			System.out.println(traduzione);
			dizionario.addWord(alienWorld, traduzione);
			txtRisultato.setText("Parola aggiunta al dizionario!");
		} else {
			String trad = dizionario.translateWord(inserimento);
			if(trad==null) {
				txtRisultato.setText("La parola aliena non contiene ancora una traduzione!");
			}else 
			txtRisultato.setText(dizionario.translateWord(inserimento));
		}

	}
	
	private boolean isValid(String s) {
		for(Character c : s.toCharArray()) {
			if(!Character.isLetter(c)) {
				txtRisultato.setText("Errore di formato! Inserire solo lettere.");
			return false;
			}
				}			
		return true;
	}

	@FXML
	void initialize() {
		assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
		dizionario = new AlienDictionary();
	}
}
