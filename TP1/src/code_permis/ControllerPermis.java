package code_permis;

import javafx.application.Application;
import javafx.stage.Stage;

public class ControllerPermis extends Application{
	
	private ViewPermis vue;
	
	@Override
	public void start(Stage stage) throws Exception {
		vue = new ViewPermis();
		stage.setTitle("Permis d'animaux");
		stage.setMinHeight(550);
		stage.setMinWidth(840);
		stage.setScene(vue.getScene());
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
