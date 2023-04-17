package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Main extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			VBox raiz = new VBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			
			Label lbselecciona = new Label("Selecciona los complementos:");
			ListView<String> lvComplementos = new ListView<>(FXCollections.observableArrayList(
					"Cliente1","Cliente2","Cliente3","Cliente4","Cliente5"));
			
			lvComplementos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			
			raiz.getChildren().addAll(lbselecciona,lvComplementos);
			Scene escena = new Scene(raiz,300,200);
			escenarioPrincipal.setTitle("Vista de lista");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
