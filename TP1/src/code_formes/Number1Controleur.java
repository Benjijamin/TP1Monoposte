package code_formes;

import javafx.application.Application;

import javafx.stage.Stage;

public class Number1Controleur extends Application {

	private Number1Vue vue;

	@Override
	public void start(Stage stage) {
		vue = new Number1Vue();
		stage.setTitle("Dessin de formes");
		stage.setMinWidth(830);
		stage.setMinHeight(680);
		stage.setScene(vue.getScene());
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
