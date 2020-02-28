package code_permis;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ViewPermis extends Application
{
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		stage.setTitle("Permis d'animaux");
		// calls
		bp.setTop(top());
		bp.setLeft(left());
		bp.setCenter(center());
		
		Scene scene = new Scene(bp);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/no3.css").toString());
		stage.setScene(scene);
		stage.show();

	}
	
	private HBox top() {
		HBox top = new HBox();
		
		Label labApp = new Label("Permis D'animaux");
		Button nouveau = new Button("Nouveau");
		Button enregistrer = new Button("Enregistrer");
		Button quitter = new Button("Quitter");
		
		top.getChildren().addAll(labApp,nouveau,enregistrer,quitter);
		top.setId("top");
		
		return top;
	}
	
	private VBox left() {
		VBox left = new VBox();
		
		Label labPermis = new Label("Liste des permis");
		
		ObservableList<String> olPermis = FXCollections.observableArrayList("Permis 1","Permis 2","Permis 3","Permis 4");
		ListView<String> lvPermis = new ListView<String>(olPermis);
		
		left.getChildren().addAll(labPermis,lvPermis);
		
		return left;
	}
	
	private VBox center() {
		VBox center = new VBox();
		
		Pane pTable = new Pane();
		
		
		//TableView
		
		TableView<Permis> tvPermis = new TableView<Permis>();
		
		TableColumn<Permis,String> col1 = new TableColumn<Permis,String>("colonne 1");
		col1.setCellValueFactory(new PropertyValueFactory("colonne1"));
		
		TableColumn<Permis,String> col2 = new TableColumn<Permis,String>("colonne 2");
		col2.setCellValueFactory(new PropertyValueFactory("colonne2"));
		
		TableColumn<Permis,String> col3 = new TableColumn<Permis,String>("colonne 3");
		col3.setCellValueFactory(new PropertyValueFactory("colonne3"));
		
		TableColumn<Permis,String> col4 = new TableColumn<Permis,String>("colonne 4");
		col4.setCellValueFactory(new PropertyValueFactory("colonne4"));
		
		tvPermis.getColumns().setAll(col1,col2,col3,col4);
		
		pTable.getChildren().add(tvPermis);
		tvPermis.setPrefHeight(200);
		
		
		//Controls
		
		AnchorPane apEdit = new AnchorPane();

		Label lNoPermis = new Label("noPermis");
		Label lDateDebutPermis = new Label("dateDebutPermis");
		Label lDateFinPermis = new Label("dateFinPermis");
		Label lTerritoireGardien = new Label("territoireGardien");
		Label lTypePermis = new Label("typePermis");
		Label lNom = new Label("Nom");
		Label lCouleur = new Label("Couleur");
		Label lSexe = new Label("Sexe:");
		Label lDateNaissance = new Label("DateNaissance");
		Label lPoids = new Label("Poids(Kg)");

		TextField tfNoPermis = new TextField("1234");
		TextField tfNom = new TextField("Normandin");
		TextField tfCouleur = new TextField("Noir");
		TextField tfPoids = new TextField("10Kg");
		
		DatePicker dpDateDebutPermis = new DatePicker();
		DatePicker dpDateFinPermis = new DatePicker();
		DatePicker dpDateNaissance = new DatePicker();
		
		ComboBox cbTerritoireGardien = new ComboBox();
		ComboBox cbTypePermis = new ComboBox();
		
		CheckBox chbVaccination = new CheckBox("Vaccination");
		CheckBox chbSterelisation = new CheckBox("Sterelisation");
		CheckBox chbMicropuce = new CheckBox("Micropuce");
		CheckBox chbDangereux = new CheckBox("Animal Dangereux");
		
		RadioButton rbMale = new RadioButton("Male");
		RadioButton rbFemelle = new RadioButton("Femelle");
		
		Separator sep = new Separator();
		sep.setOrientation(Orientation.HORIZONTAL);
		sep.setPrefWidth(700);
			
		
		apEdit.getChildren().addAll(
				lNoPermis,
				tfNoPermis,
				lDateDebutPermis,
				dpDateDebutPermis,
				lDateFinPermis,
				dpDateFinPermis,
				lTerritoireGardien,
				cbTerritoireGardien,
				sep,
				lTypePermis,
				cbTypePermis,
				lNom,
				tfNom,
				lCouleur,
				tfCouleur,
				lSexe,
				rbMale,
				rbFemelle,
				chbVaccination,
				chbSterelisation,
				chbMicropuce,
				chbDangereux,
				lDateNaissance,
				dpDateNaissance,
				lPoids,
				tfPoids);

		//noPermis
		AnchorPane.setTopAnchor(lNoPermis, 15d);
		AnchorPane.setLeftAnchor(lNoPermis, 15d);
		
		AnchorPane.setTopAnchor(tfNoPermis, 30d);
		AnchorPane.setLeftAnchor(tfNoPermis, 15d);

		//dateDebutPermis
		AnchorPane.setTopAnchor(lDateDebutPermis, 15d);
		AnchorPane.setLeftAnchor(lDateDebutPermis, 150d);
		
		AnchorPane.setTopAnchor(dpDateDebutPermis, 30d);
		AnchorPane.setLeftAnchor(dpDateDebutPermis, 150d);
		
		//dateFinPermis
		AnchorPane.setTopAnchor(lDateFinPermis, 15d);
		AnchorPane.setLeftAnchor(lDateFinPermis, 350d);

		AnchorPane.setTopAnchor(dpDateFinPermis, 30d);
		AnchorPane.setLeftAnchor(dpDateFinPermis, 350d);
		
		//territoireGardien
		AnchorPane.setTopAnchor(lTerritoireGardien, 15d);
		AnchorPane.setLeftAnchor(lTerritoireGardien, 550d);

		AnchorPane.setTopAnchor(cbTerritoireGardien, 30d);
		AnchorPane.setLeftAnchor(cbTerritoireGardien, 550d);
		
		AnchorPane.setTopAnchor(sep, 65d);
		
		//typePermis
		AnchorPane.setTopAnchor(lTypePermis, 75d);
		AnchorPane.setLeftAnchor(lTypePermis, 15d);

		AnchorPane.setTopAnchor(cbTypePermis, 90d);
		AnchorPane.setLeftAnchor(cbTypePermis, 15d);
		
		//nom
		AnchorPane.setTopAnchor(lNom, 75d);
		AnchorPane.setLeftAnchor(lNom, 150d);

		AnchorPane.setTopAnchor(tfNom, 90d);
		AnchorPane.setLeftAnchor(tfNom, 150d);
		
		//couleur
		AnchorPane.setTopAnchor(lCouleur, 75d);
		AnchorPane.setLeftAnchor(lCouleur, 350d);

		AnchorPane.setTopAnchor(tfCouleur, 90d);
		AnchorPane.setLeftAnchor(tfCouleur, 350d);
		
		//sexe
		AnchorPane.setTopAnchor(lSexe, 140d);
		AnchorPane.setLeftAnchor(lSexe, 15d);
		
		AnchorPane.setTopAnchor(rbMale, 140d);
		AnchorPane.setLeftAnchor(rbMale, 75d);
		
		AnchorPane.setTopAnchor(rbFemelle, 140d);
		AnchorPane.setLeftAnchor(rbFemelle, 150d);
		
		//vaccination
		AnchorPane.setTopAnchor(chbVaccination, 180d);
		AnchorPane.setLeftAnchor(chbVaccination, 15d);
		
		//sterelisation
		AnchorPane.setTopAnchor(chbSterelisation, 180d);
		AnchorPane.setLeftAnchor(chbSterelisation, 150d);
		
		//micropuce
		AnchorPane.setTopAnchor(chbMicropuce, 220d);
		AnchorPane.setLeftAnchor(chbMicropuce, 15d);
		
		//animal dangereux
		AnchorPane.setTopAnchor(chbDangereux, 220d);
		AnchorPane.setLeftAnchor(chbDangereux, 150d);
		
		//dateNaissance
		AnchorPane.setTopAnchor(lDateNaissance, 140d);
		AnchorPane.setLeftAnchor(lDateNaissance, 350d);

		AnchorPane.setTopAnchor(dpDateNaissance, 155d);
		AnchorPane.setLeftAnchor(dpDateNaissance, 350d);
		
		//poids
		AnchorPane.setTopAnchor(lPoids, 205d);
		AnchorPane.setLeftAnchor(lPoids, 350d);
		
		AnchorPane.setTopAnchor(tfPoids, 220d);
		AnchorPane.setLeftAnchor(tfPoids, 350d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		center.getChildren().addAll(pTable,apEdit);
		
		return center;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
