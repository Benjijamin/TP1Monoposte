package code_formes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Number1Vue {
	private Scene scene;

	public Number1Vue() {
		construireInterface();
	}

	private void construireInterface() {
		BorderPane bp = new BorderPane();
		// calls
		bp.setBottom(bottom());
		bp.setRight(right());
		bp.setCenter(center());
		bp.setStyle("-fx-background-color:azure");
		scene = new Scene(bp);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/no1.css").toString());

	}

	public Scene getScene() {
		return scene;
	}

	private VBox right() {
		VBox controls = new VBox();

		controls.setSpacing(20);

		// Formes
		Label labFormes = new Label("Formes");

		ObservableList<String> olFormes = FXCollections.observableArrayList("Ovale", "Rectangle", "Triangle", "Ligne");
		ListView<String> listeFormes = new ListView<String>(olFormes);
		listeFormes.setPrefHeight(150);

		VBox formes = new VBox(labFormes, listeFormes);

		// Couleurs
		Label labCouleur = new Label("Couleur");

		ColorPicker cpCouleur = new ColorPicker();
		cpCouleur.setPrefWidth(250);

		VBox couleurs = new VBox(labCouleur, cpCouleur);

		// Effet
		Label labEffet = new Label("Effet");

		CheckBox cbEffet = new CheckBox();

		VBox effet = new VBox(labEffet, cbEffet);

		// Position
		Label labPosx = new Label("Position x");
		Label labPosy = new Label("Position y");

		TextField tfPosx = new TextField();
		tfPosx.setMaxWidth(60);
		TextField tfPosy = new TextField();
		tfPosy.setMaxWidth(60);

		VBox vbPosx = new VBox(labPosx, tfPosx);
		VBox vbPosy = new VBox(labPosy, tfPosy);

		HBox position = new HBox(vbPosx, vbPosy);
		position.setSpacing(30);
		position.setPadding(new Insets(0, 30, 0, 30));

		// Cote
		Label labCoteA = new Label("Cote a");
		Label labCoteB = new Label("Cote b");
		Label labCoteC = new Label("Cote c");

		TextField tfCoteA = new TextField();
		tfCoteA.setMaxWidth(40);
		TextField tfCoteB = new TextField();
		tfCoteB.setMaxWidth(40);
		TextField tfCoteC = new TextField();
		tfCoteC.setMaxWidth(40);

		VBox vbCoteA = new VBox(labCoteA, tfCoteA);
		VBox vbCoteB = new VBox(labCoteB, tfCoteB);
		VBox vbCoteC = new VBox(labCoteC, tfCoteC);

		HBox cote = new HBox(vbCoteA, vbCoteB, vbCoteC);
		cote.setSpacing(30);
		cote.setPadding(new Insets(0, 12, 0, 12));

		// Opacite
		Label labOpacite = new Label("Opacite");

		Slider sliderOpacite = new Slider(0, 1, 0);

		VBox opacite = new VBox(labOpacite, sliderOpacite);

		// addAll
		controls.getChildren().addAll(formes, couleurs, effet, position, cote, opacite);

		controls.setPrefWidth(250);
		controls.setId("droite");
		return controls;
	}

	private HBox bottom() {
		HBox bot = new HBox();

		Button gen = new Button("Generer");
		Button re = new Button("Reinitialiser");
		Button quit = new Button("Quitter");

		bot.getChildren().addAll(gen, re, quit);

		bot.setPrefHeight(55);
		bot.setId("bottom");
		return bot;
	}

	private Pane center() {
		Pane centre = new Pane();
		Circle c = new Circle();

		c.setRadius(120);
		c.setCenterX(275);
		c.setCenterY(275);
		c.setFill(Color.RED);

		centre.getChildren().add(c);
		centre.getStyleClass().add("canvas");
		centre.setMinSize(550, 550);

		return centre;
	}

}
