package dad.javafx.calculadoracompleja;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {
	
	private TextField numeradorAText;
	private TextField numeradorBText;
	private TextField denominadorAText;
	private TextField denominadorBText;
	private ComboBox<String> operacionesCombo;
	private String[] operadores = {"+","-","*","/"};
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		numeradorAText = new TextField("0");
		numeradorBText = new TextField("0");
		
		HBox numeradorBox = new HBox();
		numeradorBox.setAlignment(Pos.BASELINE_CENTER);
		numeradorBox.setSpacing(5);
		numeradorBox.getChildren().addAll(numeradorAText,numeradorBText);
		
		denominadorAText = new TextField();
		denominadorBText = new TextField();
		
		HBox denominadorBox = new HBox();
		denominadorBox.setAlignment(Pos.BASELINE_CENTER);
		denominadorBox.setSpacing(5);
		denominadorBox.getChildren().addAll(denominadorAText,denominadorBText);
	
		operacionesCombo = new ComboBox<String>();
		operacionesCombo.getItems().addAll(operadores);
		VBox operacionesBox = new VBox();
		operacionesBox.setAlignment(Pos.BASELINE_CENTER);
		operacionesBox.setSpacing(5);
		operacionesBox.getChildren().addAll(operacionesCombo);

	}

}
