package NumeroUn;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class View extends Application {
	@Override
	public void start(Stage stage) {
		BorderPane bp = new BorderPane();
		stage.setTitle("Dessin de formes");
		stage.setMinWidth(500);
		stage.setMinHeight(500);
		// calls
		bp.setBottom(bottom());
		bp.setRight(right());
		bp.setCenter(center());

		Scene scene = new Scene(bp, 800, 600);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/no1.css").toString());
		stage.setScene(scene);
		stage.show();

	}

	private VBox right() {
		VBox controls = new VBox();

		controls.setSpacing(20);

		// Formes
		Label labFormes = new Label("Formes");

		ObservableList<String> olFormes = FXCollections.observableArrayList(
				"Ovale",
				"Rectangle",
				"Triangle",
				"Ligne");
		ListView<String> listeFormes = new ListView<String>(olFormes);
		listeFormes.setPrefHeight(150);

		VBox formes = new VBox(labFormes, listeFormes);

		
		// Couleurs
		Label labCouleur = new Label("Couleur");

		ObservableList<String> olCouleurText = FXCollections.observableArrayList(
				"Orange",
				"Rouge",
				"Bleu",
				"Rose",
				"Jaune",
				"Vert",
				"Mauve");
		ComboBox<String> cbCouleur = new ComboBox<String>(olCouleurText);
		cbCouleur.getSelectionModel().selectFirst();

		VBox couleurs = new VBox(labCouleur, cbCouleur);

		
		// Effet
		Label labEffet = new Label("Effet");

		CheckBox cbEffet = new CheckBox();

		VBox effet = new VBox(labEffet, cbEffet);

		
		// Position
		Label labPosx = new Label("Position x");
		Label labPosy = new Label("Position y");

		TextField tfPosx = new TextField();
		tfPosx.setMaxWidth(50);
		TextField tfPosy = new TextField();
		tfPosy.setMaxWidth(50);

		VBox vbPosx = new VBox(labPosx, tfPosx);
		VBox vbPosy = new VBox(labPosy, tfPosy);

		HBox position = new HBox(vbPosx, vbPosy);
		position.setSpacing(75);
		position.setPadding(new Insets(0, 30, 0, 30));

		
		// Cote
		Label labCoteA = new Label("Cote a");
		Label labCoteB = new Label("Cote b");
		Label labCoteC = new Label("Cote c");

		TextField tfCoteA = new TextField();
		tfCoteA.setMaxWidth(50);
		TextField tfCoteB = new TextField();
		tfCoteB.setMaxWidth(50);
		TextField tfCoteC = new TextField();
		tfCoteC.setMaxWidth(50);

		VBox vbCoteA = new VBox(labCoteA, tfCoteA);
		VBox vbCoteB = new VBox(labCoteB, tfCoteB);
		VBox vbCoteC = new VBox(labCoteC, tfCoteC);

		HBox cote = new HBox(vbCoteA, vbCoteB, vbCoteC);
		cote.setSpacing(33);
		cote.setPadding(new Insets(0,12,0,12));

		
		// Opacite
		Label labOpacite = new Label("Opacite");

		Slider sliderOpacite = new Slider(0, 1, 0);

		VBox opacite = new VBox(labOpacite, sliderOpacite);

		
		//addAll
		controls.getChildren().addAll(formes, couleurs, effet, position, cote, opacite);
		controls.setPrefWidth(250);
		return controls;
	}

	private HBox bottom() {
		HBox bot = new HBox();

		Button gen = new Button("Generer");
		Button re = new Button("Reinitialiser");
		Button quit = new Button("Quitter");

		bot.getChildren().addAll(gen, re, quit);

		bot.setPrefHeight(55);
		return bot;
	}

	private Pane center() {
		Pane centre = new Pane();
		Circle c = new Circle();

		c.setRadius(90);
		c.setCenterX(275);
		c.setCenterY(272.5);

		centre.getChildren().add(c);
		centre.getStyleClass().add("test3");

		return centre;
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
