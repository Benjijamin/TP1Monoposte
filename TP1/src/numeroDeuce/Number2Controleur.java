package numeroDeuce;

import javafx.application.Application;

import javafx.stage.Stage;

public class Number2Controleur extends Application {

	private Number2Vue vue;

	@Override
	public void start(Stage stage) {
		vue = new Number2Vue();
		stage.setTitle("Suivi des travaux");
		stage.setScene(vue.getScene());
		stage.setMinHeight(590);
		stage.setMinWidth(1020);
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
